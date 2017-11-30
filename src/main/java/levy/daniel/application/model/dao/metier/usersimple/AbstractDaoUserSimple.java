package levy.daniel.application.model.dao.metier.usersimple;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import levy.daniel.application.model.dao.AbstractDaoGenericJPASpring;
import levy.daniel.application.model.dao.daoexceptions.AbstractDaoException;
import levy.daniel.application.model.metier.usersimple.IUserSimple;

/**
 * class AbstractDaoUserSimple :<br/>
 * <ul>
 * <li>
 * DAO ABSTRAIT SPRING pour les 
 * <b>IUserSimple</b>.
 * </li>
 * <li>
 * Comporte l'implémentation des méthodes <b>spécifiques</b> aux 
 * IUserSimple.
 * </li>
 * <li>IMPLEMENTE L'INTERFACE IDaoUserSimple.</li>
 * <li>
 * HERITE DE LA CLASSE ABSTRAITE 
 * AbstractDaoGenericJPASpring&lt;IUserSimple, Long&gt;.
 * </li>
 * <br/>
 * <li>
 * <img src="../../../../../../../../../../javadoc/images/implementation_dao_usersimple.png" 
 * alt="implémentation des DAOs" border="1" align="center" />
 * </li>
 * </ul>
 * <br/>
 *
 * - Exemple d'utilisation :<br/>
 *<br/>
 * 
 * - Mots-clé :<br/>
 * <br/>
 *
 * - Dépendances :<br/>
 * <br/>
 *
 *
 * @author daniel.levy Lévy
 * @version 1.0
 * @since 30 nov. 2017
 *
 */
public abstract class AbstractDaoUserSimple 
		extends AbstractDaoGenericJPASpring<IUserSimple, Long>
										implements IDaoUserSimple {

	// ************************ATTRIBUTS************************************/

	/**
	 * SAUT_LIGNE_JAVA : char :<br/>
	 * '\n'.<br/>
	 */
	public static final char SAUT_LIGNE_JAVA = '\n';

	
	/**
	 * SELECT_OBJET : String :<br/>
	 * "select iusersimple from 
	 * IUserSimple as iusersimple ".<br/>
	 */
	public static final String SELECT_OBJET 
		= "select iusersimple from "
				+ "IUserSimple as iusersimple ";

	
	/**
	 * LOG : Log : 
	 * Logger pour Log4j (utilisant commons-logging).
	 */
	private static final Log LOG 
		= LogFactory.getLog(AbstractDaoUserSimple.class);
	

	// *************************METHODES************************************/
	
	
	 /**
	 * method CONSTRUCTEUR AbstractDaoUserSimple() :<br/>
	 * CONSTRUCTEUR D'ARITE NULLE.<br/>
	 * <br/>
	 */
	public AbstractDaoUserSimple() {
		super();
	} // Fin de CONSTRUCTEUR D'ARITE NULLE.________________________________


	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public final Long createReturnId(
			final IUserSimple pObject) 
					throws AbstractDaoException {
				
		/* retourne null si pObject == null. */
		if (pObject == null) {
			return null;
		}
		
		/* Crée l'Objet en base ou jette une AbstractDaoException. */
		final IUserSimple objetPersistant 
			= this.create(pObject);
		
		/* retourne null si l'objet pObject n'a pu être créé en base. */
		if (objetPersistant == null) {
			return null;
		}
		
		/* retourne l'ID de l'objet persistant. */
		return objetPersistant.getId();	
		
	} // Fin de createReturnId(...)._______________________________________
	


	/**
	 * {@inheritDoc}
	 */
	@Override
	public final IUserSimple retrieve(
			final IUserSimple pObject) 
						throws AbstractDaoException {

		/* return null si pObject == null. */
		if (pObject == null) {
			return null;
		}
		
		IUserSimple objetResultat = null;
		
		/* REQUETE HQL PARMETREE. */
		final String requeteString 
			= SELECT_OBJET
				+ "where iusersimple.login = :pLogin "
				+ "and iusersimple.mdp = :pMdp";
		
		/* Construction de la requête HQL. */
		final Query requete 
			= this.entityManager.createQuery(requeteString);
		
		/* Passage des paramètres de la requête HQL. */
		requete.setParameter("pLogin", pObject.getLogin());
		requete.setParameter("pMdp", pObject.getMdp());
		
		try {
			
			/* Execution de la requete HQL. */
			objetResultat 
			= (IUserSimple) requete.getSingleResult();
			
		}
		catch (NoResultException noResultExc) {
			
			/* retourne null si l'Objet métier n'existe pas en base. */
			return null;
			
		}
		catch (Exception e) {
			
			/* LOG. */
			if (LOG.isDebugEnabled()) {
				LOG.debug(e.getMessage(), e);
			}
			
			/* Gestion de la DAO Exception. */
			this.gestionnaireException.gererException(e);
		}
				
		return objetResultat;

	} // Fin de retrieve(...)._____________________________________________


	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public final IUserSimple retrieveByIdMetier(
			final IUserSimple pObjet) throws AbstractDaoException {
		return this.retrieve(pObjet);
	} // Fin de retrieveByIdMetier(...).___________________________________


	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public final List<IUserSimple> retrieveByNomPrenom(
			final String pNom
				, final String pPrenom) throws AbstractDaoException {
		
		/* Retourne null si pNom est blank. */
		if (StringUtils.isBlank(pNom)) {
			return null;
		}
		
		/* Retourne null si pPrenom est blank. */
		if (StringUtils.isBlank(pPrenom)) {
			return null;
		}
		
		List<IUserSimple> objetResultat = null;
		
		/* REQUETE HQL PARMETREE. */
		final String requeteString 
			= SELECT_OBJET
				+ "where iusersimple.nom = :pNom "
				+ "and iusersimple.prenom = :pPrenom";
		
		/* Construction de la requête HQL. */
		final Query requete 
			= this.entityManager.createQuery(requeteString);
		
		/* Passage des paramètres de la requête HQL. */
		requete.setParameter("pNom", pNom);
		requete.setParameter("pPrenom", pPrenom);
		
		try {
			
			/* Execution de la requete HQL. */
			objetResultat = requete.getResultList();
			
		}
		catch (NoResultException noResultExc) {
			
			/* retourne null si l'Objet métier n'existe pas en base. */
			return null;
			
		}
		catch (Exception e) {
			
			/* LOG. */
			if (LOG.isDebugEnabled()) {
				LOG.debug(e.getMessage(), e);
			}
			
			/* Gestion de la DAO Exception. */
			this.gestionnaireException.gererException(e);
		}

		return objetResultat;
		
	} // Fin de retrieveByNomPrenom(...).__________________________________
	
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public final void deleteById(
			final Long pId) throws AbstractDaoException {
		
		/* ne fait rien si pId == null. */
		if (pId == null) {
			return;
		}

		IUserSimple objetPersistant = null;

		/* REQUETE HQL PARAMETREE. */
		final String requeteString 
		= SELECT_OBJET 
		+ "where iusersimple.id = :pId";

		/* Construction de la requête HQL. */
		final Query requete 
			= this.entityManager.createQuery(requeteString);

		/* Passage des paramètres de la requête HQL. */
		requete.setParameter("pId", pId);

		try {
			/* Execution de la requete HQL. */
			objetPersistant 
			= (IUserSimple) requete.getSingleResult();
		}
		catch (NoResultException noResultExc) {
			objetPersistant = null;
		}

		
		try {
			
			if (objetPersistant != null) {
				
				/* Merge avant destruction. */
				this.entityManager.merge(objetPersistant);
				
				/* DESTRUCTION. */
				this.entityManager.remove(objetPersistant);
				
			}

		}
		catch (Exception e) {
			
			/* LOG. */
			if (LOG.isDebugEnabled()) {
				LOG.debug(e.getMessage(), e);
			}

			/* Gestion de la DAO Exception. */
			this.gestionnaireException.gererException(e);
		}
		
	} // Fin de deleteById(...).___________________________________________
	
	

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final boolean deleteByIdBoolean(
			final Long pId) throws AbstractDaoException {
		
		/* retourne false si pId == null. */
		if (pId == null) {
			return false;
		}
		
		boolean resultat = false;
		
		IUserSimple objetPersistant = null;

		/* REQUETE HQL PARAMETREE. */
		final String requeteString 
		= SELECT_OBJET 
		+ "where iusersimple.id = :pId";

		/* Construction de la requête HQL. */
		final Query requete 
			= this.entityManager.createQuery(requeteString);

		/* Passage des paramètres de la requête HQL. */
		requete.setParameter("pId", pId);

		try {
			/* Execution de la requete HQL. */
			objetPersistant 
			= (IUserSimple) requete.getSingleResult();
		}
		catch (NoResultException noResultExc) {
			objetPersistant = null;
			resultat = false;
		}
		
		try {
			
			if (objetPersistant != null) {
				
				/* Merge avant destruction. */
				this.entityManager.merge(objetPersistant);
				
				/* DESTRUCTION. */
				this.entityManager.remove(objetPersistant);
				
				resultat = true;
			}

		}
		catch (Exception e) {
			
			/* LOG. */
			if (LOG.isDebugEnabled()) {
				LOG.debug(e.getMessage(), e);
			}

			/* Gestion de la DAO Exception. */
			this.gestionnaireException.gererException(e);
		}
		
		return resultat;
		
	} // Fin de deleteByIdBoolean(...).____________________________________


	/**
	 * {@inheritDoc}
	 */
	@Override
	public final boolean exists(
			final IUserSimple pObject) throws AbstractDaoException {
		
		/* retourne false si pObject == null. */
		if (pObject == null) {
			return false;
		}

		boolean resultat = false;		
		IUserSimple objetResultat = null;
		
		/* REQUETE HQL PARMETREE. */
		/* REQUETE HQL PARMETREE. */
		final String requeteString 
			= SELECT_OBJET
				+ "where iusersimple.login = :pLogin "
				+ "and iusersimple.mdp = :pMdp";
		
		/* Construction de la requête HQL. */
		final Query requete 
			= this.entityManager.createQuery(requeteString);
		
		/* Passage des paramètres de la requête HQL. */
		requete.setParameter("pLogin", pObject.getLogin());
		requete.setParameter("pMdp", pObject.getMdp());
		
		try {
			
			/* Execution de la requete HQL. */
			objetResultat 
			= (IUserSimple) requete.getSingleResult();
			
			/* retourne true si l'objet existe en base. */
			if (objetResultat != null) {
				resultat = true;
			}
			
		}
		catch (NoResultException noResultExc) {
			
			/* retourne false si l'Objet métier n'existe pas en base. */
			return false;
			
		}
		catch (Exception e) {
			
			/* LOG. */
			if (LOG.isDebugEnabled()) {
				LOG.debug(e.getMessage(), e);
			}
			
			/* Gestion de la DAO Exception. */
			this.gestionnaireException.gererException(e);
		}
				
		return resultat;
		
	} // Fin de exists(...)._______________________________________________
	
	

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final boolean exists(
			final Long pId) throws AbstractDaoException {
		
		/* retourne false si pId == null . */
		if (pId == null) {
			return false;
		}
		
		/* retourne true si l'objet métier existe en base. */
		if (this.findById(pId) != null) {
			return true;
		}
		
		return false;
		
	} // Fin de exists(...)._______________________________________________


	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public final String afficherListe(
			final List<IUserSimple> pListe) {
		
		/* retourne null si pListe == null. */
		if (pListe == null) {
			return null;
		}
		
		final StringBuilder stb = new StringBuilder();
		
		for (final IUserSimple objet : pListe) {
			stb.append(objet.toString());
			stb.append(SAUT_LIGNE_JAVA);
		}
				
		return stb.toString();
			
	} // Fin de afficherListe(...).________________________________________


	
	/**
	 * {@inheritDoc}
	 * <br/>
	 * this.<b>classObjetMetier</b> dans AbstractDaoUserSimple : 
	 * <b>IUserSimple.class</b><br/>
	 * <br/>
	 * 
	 */
	@Override
	protected void renseignerClassObjetMetier() {

		this.setClassObjetMetier(IUserSimple.class);

	} // Fin de renseignerClassObjetMetier().______________________________


	
} // FIN DE LA CLASSE AbstractDaoUserSimple.---------------------------------