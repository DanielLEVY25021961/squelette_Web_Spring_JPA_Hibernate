package levy.daniel.application.model.dao.daoexceptions;

import javax.persistence.EntityExistsException;
import javax.persistence.PersistenceException;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.exception.SQLGrammarException;
import org.postgresql.util.PSQLException;

import levy.daniel.application.model.dao.daoexceptions.technical.impl.DaoDoublonException;
import levy.daniel.application.model.dao.daoexceptions.technical.impl.DaoPSQLException;
import levy.daniel.application.model.dao.daoexceptions.technical.impl.DaoSQLGrammarException;

/**
 * class GestionnaireDaoException :<br/>
 * .<br/>
 * <br/>
 *
 * - Exemple d'utilisation :<br/>
 *<br/>
 * 
 * - Mots-clé :<br/>
 * StringUtils.splitByWholeSeparator, Split, Casser une chaine,<br/>
 * <br/>
 *
 * - Dépendances :<br/>
 * <br/>
 *
 *
 * @author dan Lévy
 * @version 1.0
 * @since 18 sept. 2017
 *
 */
public class GestionnaireDaoException {

	// ************************ATTRIBUTS************************************/

	/**
	 * TIRET_AERE : String :<br/>
	 * " - ".<br/>
	 */
	public static final String TIRET_AERE = " - ";
	
	
	/**
	 * LOG : Log : 
	 * Logger pour Log4j (utilisant commons-logging).
	 */
	private static final Log LOG 
		= LogFactory.getLog(GestionnaireDaoException.class);
	

	// *************************METHODES************************************/
	
	
	
	 /**
	 * method CONSTRUCTEUR GestionnaireDaoException() :<br/>
	 * CONSTRUCTEUR D'ARITE NULLE.<br/>
	 * <br/>
	 */
	public GestionnaireDaoException() {
		super();
	} // Fin de CONSTRUCTEUR D'ARITE NULLE.________________________________
	
	
	
	/**
	 * method gererException(
	 * String pClasse
	 * , String pMethode
	 * , Exception pE) :<br/>
	 * .<br/>
	 * <br/>
	 *
	 * @param pClasse : String : 
	 * @param pMethode : String :  
	 * @param pE : Exception.<br/>
	 * 
	 * @throws AbstractDaoException 
	 */
	public void gererException(
			final String pClasse
				, final String pMethode
					, final Exception pE) 
								throws AbstractDaoException {
		
		final Throwable causeMere = pE.getCause();
		Throwable causeGrandMere = null;
		
		if (causeMere != null) {
			causeGrandMere = causeMere.getCause();
		}
		
		
		/* Violation de contraintes. */
		if (pE instanceof PersistenceException) {			
			gererPersistenceException(pClasse, pMethode
					, pE, causeMere, causeGrandMere);			
		}
		
		if (pE instanceof EntityExistsException) {
			System.out.println(pClasse 
					+ TIRET_AERE 
					+ pMethode 
					+ TIRET_AERE 
					+ "PROBLEME DE PERSISTANCE EntityExistsException : " + pE);
		}
		
		if (pE instanceof IllegalArgumentException) {
			System.out.println(pClasse 
					+ TIRET_AERE 
					+ pMethode 
					+ TIRET_AERE 
					+ "PROBLEME DE DEFINITION DES ENTITES IllegalArgumentException : " + pE);
		}

	} // Fin de gererException(...)._______________________________________
	
	
	

	/**
	 * method gererPersistenceException(
	 * String pClasse
	 * , String pMethode
	 * , Exception pE
	 * , Throwable pCauseMere
	 * , Throwable pCauseGrandMere) :<br/>
	 * .<br/>
	 * <br/>
	 *
	 * @param pClasse : String : 
	 * @param pMethode : String :  
	 * @param pE : Exception : 
	 * @param pCauseMere : Throwable : 
	 * @param pCauseGrandMere : Throwable : 
	 * 
	 * @throws AbstractDaoException
	 */
	private void gererPersistenceException(
			final String pClasse
			, final String pMethode
				, final Exception pE
					, final Throwable pCauseMere
						, final Throwable pCauseGrandMere) 
							throws AbstractDaoException {
				
		if (pCauseGrandMere != null) {
			
			/* PSQLException. */
			if (pCauseGrandMere instanceof PSQLException) {
				
				/* SQLGrammarException : problème de création de tables. */
				if (pCauseMere instanceof SQLGrammarException) {
					
					final String messageUtilisateur 
					= "PROBLEME DE CREATION DE TABLE - " 
							+ this.getDetailpostgresqlException(
									pCauseGrandMere.getMessage());
				
					final String messageTechnique 
						= pClasse + TIRET_AERE + pMethode + TIRET_AERE 
							+ "PROBLEME DE CREATION DE TABLE - "
							+ pCauseGrandMere.getMessage() 
							+ TIRET_AERE 
							+ pCauseGrandMere.getClass().getName();
					
					
					final DaoSQLGrammarException daoGrammarExc 
					= new DaoSQLGrammarException(
							pCauseGrandMere.getMessage(), pCauseGrandMere);
					
					daoGrammarExc.setMessageUtilisateur(messageUtilisateur);
					daoGrammarExc.setMessageTechnique(messageTechnique);
					
					throw daoGrammarExc;
					
				} // Fin de SQLGrammarException._______________________
				
				final String messageUtilisateur 
					= "TENTATIVE DE CREATION DE DOUBLON - " 
							+ this.getDetailpostgresqlException(
									pCauseGrandMere.getMessage());
				
				final String messageTechnique 
					= pClasse 
						+ TIRET_AERE 
						+ pMethode 
						+ TIRET_AERE 
						+ "TENTATIVE DE CREATION DE DOUBLON - "
						+ pCauseGrandMere.getMessage() 
						+ TIRET_AERE 
						+ pCauseGrandMere.getClass().getName();
				
				
				final DaoDoublonException daoDoublonExc 
				= new DaoDoublonException(
						pCauseGrandMere.getMessage(), pCauseGrandMere);
				
				daoDoublonExc.setMessageUtilisateur(messageUtilisateur);
				daoDoublonExc.setMessageTechnique(messageTechnique);
				
				throw daoDoublonExc;
				
			} //  Fin de PSQLException.__________________________________
		}
		else if (pCauseMere != null) {
			
			final String messageUtilisateur 
			= "CAUSE MERE : " 
			+ pCauseMere.getClass().getName() 
			+ TIRET_AERE 
			+  pCauseMere.getMessage();
			
			final String messageTechnique 
			= pClasse + TIRET_AERE + pMethode + TIRET_AERE 
			+ "CAUSE MERE : " 
			+ pCauseMere.getClass().getName() 
			+ TIRET_AERE 
			+  pCauseMere.getMessage();
			
			final DaoPSQLException daoPSQLExc 
			= new DaoPSQLException(
					pCauseMere.getMessage(), pCauseMere);
			
			daoPSQLExc.setMessageUtilisateur(messageUtilisateur);
			daoPSQLExc.setMessageTechnique(messageTechnique);
			
			throw daoPSQLExc;
			
		}
		else {
			
			final String messageUtilisateur 
			= "CAUSE DE L'EXCEPTION : " 
			+ pE.getClass().getName() 
			+ TIRET_AERE 
			+  pE.getMessage();
			
			final String messageTechnique 
			= "CAUSE MERE : " 
			+ pE.getClass().getName() 
			+ TIRET_AERE 
			+  pE.getMessage();
			
			final DaoDoublonException daoDoublonExc 
			= new DaoDoublonException(
					pE.getMessage(), pE);
			
			daoDoublonExc.setMessageUtilisateur(messageUtilisateur);
			daoDoublonExc.setMessageTechnique(messageTechnique);
			
			throw daoDoublonExc;			
		}
				
	} // Fin de gererPersistenceException(...).____________________________
	

	
	/**
	 * method getDetailpostgresqlException(
	 * String pString) :<br/>
	 * Split.<br/>
	 * <br/>
	 *
	 * @param pString
	 * @return :  :  .<br/>
	 */
	private String getDetailpostgresqlException(
			final String pString) {
		
		if (StringUtils.isBlank(pString)) {
			return null;
		}
				
		String resultat = null;
		
		final String[] tableauString 
			= StringUtils.splitByWholeSeparator(pString, "Détail : ");
				
		if (tableauString != null) {
			
			final int taille = tableauString.length;
			
			resultat = tableauString[taille - 1];
						
		}
		
		return resultat;
		
	} // Fin de getDetailpostgresqlException(...)._________________________
	
	
	
} // FIN DE LA CLASSE GestionnaireDaoException.------------------------------
