package levy.daniel.application.model.dao.metier.usersimple.impl;

import static org.junit.Assert.assertTrue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import levy.daniel.application.model.dao.daoexceptions.AbstractDaoException;
import levy.daniel.application.model.dao.metier.usersimple.IDaoUserSimple;
import levy.daniel.application.model.metier.usersimple.IUserSimple;
import levy.daniel.application.model.metier.usersimple.impl.UserSimple;


/**
 * class DaoUserSimpleTest :<br/>
 * Test JUnit de la classe DaoUserSimple.<br/>
 * Test JUnit sous SPRINGr/>
 * <br/>
 *
 * - Exemple d'utilisation :<br/>
 *<br/>
 * 
 * - Mots-clé :<br/>
 * Test Spring, Test JUnit Spring, SPRING, TEST DAO SPRING,<br/>
 * <br/>
 *
 * - Dépendances :<br/>
 * <br/>
 *
 *
 * @author dan Lévy
 * @version 1.0
 * @since 30 nov. 2017
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext-test.xml"})
public class DaoUserSimpleTest {

	// ************************ATTRIBUTS************************************/
	
	/**
	 * AFFICHAGE_GENERAL : Boolean :<br/>
	 * Boolean qui commande l'affichage pour tous les tests.<br/>
	 */
	public static final Boolean AFFICHAGE_GENERAL = true;

	
	/**
	 * TIRETS : String :<br/>
	 * "--------------------------------------------------------".<br/>
	 */
	public static final String TIRETS 
	= "--------------------------------------------------------";


	/**
	 * daoUserSimple : IDaoUserSimple :<br/>
	 * DAO pour les UserSimple.<br/>
	 */
	@Autowired
	private transient IDaoUserSimple daoUserSimple;
	
	
	/**
	 * LOG : Log : 
	 * Logger pour Log4j (utilisant commons-logging).
	 */
	private static final Log LOG 
			= LogFactory.getLog(DaoUserSimpleTest.class);
	

	// *************************METHODES************************************/
	
		
	 /**
	 * method CONSTRUCTEUR DaoUserSimpleTest() :<br/>
	 * CONSTRUCTEUR D'ARITE NULLE.<br/>
	 * <br/>
	 */
	public DaoUserSimpleTest() {
		super();
	} // Fin de CONSTRUCTEUR D'ARITE NULLE.________________________________
	
	

	/**
	 * method testCreateNull() :<br/>
	 * <ul>
	 * Teste la méthode <b>create(null)</b>.<br/>
	 * <li>garantit que create(null) ne fait rien 
	 * et retourne null.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Test
	public void testCreateNull() throws AbstractDaoException {
				
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = true;
		// **********************************
		
		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		final IUserSimple objet1 = null;
		IUserSimple objet1Persistant = null;
				
		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		if (AFFICHAGE_GENERAL && affichage) {
			this.afficherNbreObjetsInitial(nombreObjetsinitial);			
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			objet1Persistant = this.daoUserSimple.create(objet1);
			/* *********************************************** */
			
			/* Calcul du nombre d'objets en base après le traitement. */
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que create(null) ne fait rien et retourne null. */
			assertTrue("nombreObjetsFinal doit valoir "
					+ "nombreObjetsinitial + 0 : "
					, nombreObjetsFinal == nombreObjetsinitial + 0);
			
		}
		catch (AbstractDaoException e) {			
			this.afficherAbstractDaoException(e);			
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
						
			if (objet1Persistant != null) {
				
				System.out.println();
				System.out.println(TIRETS);
				System.out.println("objet1 persistant : " 
						+ objet1Persistant.toString());
				System.out.println("nombre d'objets finalement en base = " 
						+ nombreObjetsFinal);
				System.out.println(TIRETS);
				System.out.println();
				
			} else {
				
				System.out.println();
				System.out.println(TIRETS);
				System.out.println("objet1Persistant est NULL");
				System.out.println(TIRETS);
				System.out.println();
				
			}
			
		}
				
	} // Fin de testCreateNull().__________________________________________
	
	
	
	/**
	 * method testCreate() :<br/>
	 * <ul>
	 * Teste la méthode <b>create(IUserSimple pObject)</b>.<br/>
	 * <li>garantit que create(IUserSimple pObject) insère 
	 * un objet en base.</li>
	 * </ul>
	 * @throws AbstractDaoException 
	 */
	@Commit
	@Transactional
	@Test
	public void testCreate() throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = true;
		// **********************************

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		IUserSimple objet1Persistant = null;
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple("M."
				, "Jean-Frédéric", "Borne"
				, "jean-frederic.borne@free.fr"
				, "jfbornelogin", "jfbornemdp"
				, "UTILISATEUR");
		
		
		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			this.afficherObjetNonPersistant(objet1, nombreObjetsinitial);
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			objet1Persistant = this.daoUserSimple.create(objet1);
			/* *********************************************** */
			
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que create(IUserSimple pObject) 
			 * insère un objet en base.*/
			assertTrue("nombreObjetsFinal doit valoir "
					+ "nombreObjetsinitial + 1 : "
					, nombreObjetsFinal == nombreObjetsinitial + 1);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
						
			if (objet1Persistant != null) {
				
				System.out.println();
				System.out.println(TIRETS);
				System.out.println("objet1 persistant : " 
						+ objet1Persistant.toString());
				System.out.println("nombre d'objets finalement en base = " 
						+ nombreObjetsFinal);
				System.out.println(TIRETS);
				System.out.println();
				
			} else {
				
				System.out.println();
				System.out.println(TIRETS);
				System.out.println("objet1Persistant est NULL");
				System.out.println(TIRETS);
				System.out.println();
				
			}
			
		}
		
	} // Fin de testCreate().______________________________________________
	


	/**
	 * method afficherDAONonInstancie() :<br/>
	 * Affiche à la console de
	 * <b>"DAO NON INSTANCIE - this.daoUserSimple est NULL"</b>.<br/>
	 * <br/>
	 */
	private void afficherDAONonInstancie() {
		
		System.out.println();
		System.out.println(TIRETS);
		System.out.println("DAO NON INSTANCIE "
				+ "- this.daoUserSimple est NULL");
		System.out.println(TIRETS);
		System.out.println();
		
	} // Fin de afficherDAONonInstancie()._________________________________
	

	
	/**
	 * method afficherNbreObjetsInitial(
	 * Long pNbreObjetsInitial) :<br/>
	 * <ul>
	 * Affiche à la console :
	 * <li>Le nombre d'objets pNbreObjetsInitial initialement 
	 * en base avant le test.</li>
	 * </ul>
	 * <br/>
	 *
	 * @param pNbreObjetsInitial : Long : 
	 * Nombre d'objets initialement en base.<br/>
	 */
	private void afficherNbreObjetsInitial(
						final Long pNbreObjetsInitial) {
		
		System.out.println();
		System.out.println(TIRETS);
		System.out.println("nombre d'objets initialement en base = " 
				+ pNbreObjetsInitial);
		System.out.println(TIRETS);
		System.out.println();

	} // Fin de afficherNbreObjetsInitial(...).____________________________
	
	
	
	/**
	 * method afficherObjetNonPersistant(
	 * IUserSimple pObjetNonPersistant
	 * , Long pNbreObjetsInitial) :<br/>
	 * <ul>
	 * Affiche à la console :
	 * <li>l'objet pObjetNonPersistant non persisté en base.</li>
	 * <li>Le nombre d'objets pNbreObjetsInitial initialement 
	 * en base avant le test.</li>
	 * </ul>
	 * <br/>
	 *
	 * @param pObjetNonPersistant : IUserSimple : 
	 * Objet non persistant en base.<br/>
	 * @param pNbreObjetsInitial : Long : 
	 * Nombre d'objets initialement en base.<br/>
	 */
	private void afficherObjetNonPersistant(
			final IUserSimple pObjetNonPersistant
				, final Long pNbreObjetsInitial) {
		
		System.out.println();
		System.out.println(TIRETS);
		System.out.println("objet1 non persistant : " 
				+ pObjetNonPersistant.toString());
		System.out.println("nombre d'objets initialement en base = " 
				+ pNbreObjetsInitial);
		System.out.println(TIRETS);
		System.out.println();
		
	} // Fin de afficherObjetNonPersistant(...).___________________________
	
	

	/**
	 * method afficherAbstractDaoException(
	 * AbstractDaoException pE) :<br/>
	 * <ul>
	 * Affiche à la console :
	 * <li>le message Utilisateur d'une AbstractDaoException pE.</li>
	 * <li>le message Technique d'une AbstractDaoException pE.</li>
	 * </ul>
	 * <br/>
	 *
	 * @param pE : AbstractDaoException.<br/>
	 */
	private void afficherAbstractDaoException(
			final AbstractDaoException pE) {
		
		System.out.println();
		System.out.println(TIRETS);
		System.out.println("MESSAGE UTILISATEUR : " 
				+ pE.getMessageUtilisateur());
		System.out.println();
		System.out.println("MESSAGE TECHNIQUE : " 
				+ pE.getMessageTechnique());
		System.out.println(TIRETS);
		System.out.println();

	} // Fin de afficherAbstractDaoException(...)._________________________
	
	
	
} // FIN DE LA CLASSE DaoUserSimpleTest.-------------------------------------
