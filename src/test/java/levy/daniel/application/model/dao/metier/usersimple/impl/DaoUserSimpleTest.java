package levy.daniel.application.model.dao.metier.usersimple.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

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
 * <ul>
 * <li>Test JUnit de la classe <b>DaoUserSimple</b>.</li>
 * <li>Test JUnit sous <b>SPRING</b>.</li>
 * <li>Le <b>fichier de configuration SPRING</b> utilisé pour ce test est 
 * <b>classpath*:applicationContext-test.xml</b> grâce à l'annotation 
 * <b>ContextConfiguration</b>.</li>
 * </ul>
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
	 * NBRE_OBJETS_FINAL_DOIT : String :<br/>
	 * "nombreObjetsFinal doit valoir ".<br/>
	 */
	public static final String NBRE_OBJETS_FINAL_DOIT 
		= "nombreObjetsFinal doit valoir ";
	
	
	/**
	 * NBRE_INITIAL_PLUS_ZERO : String :<br/>
	 * "nombreObjetsinitial + 0 : ".<br/>
	 */
	public static final String NBRE_INITIAL_PLUS_ZERO 
		= "nombreObjetsinitial + 0 : ";
	
	
	/**
	 * NBRE_INITIAL_PLUS_UN : String :<br/>
	 * "nombreObjetsinitial + 1 : ".<br/>
	 */
	public static final String NBRE_INITIAL_PLUS_UN 
		= "nombreObjetsinitial + 1 : ";

	
	/**
	 * NBRE_INITIAL_PLUS_DEUX : String :<br/>
	 * "nombreObjetsinitial + 2 : ".<br/>
	 */
	public static final String NBRE_INITIAL_PLUS_DEUX 
		= "nombreObjetsinitial + 2 : ";

	
	/**
	 * NBRE_INITIAL_PLUS_TROIS : String :<br/>
	 * "nombreObjetsinitial + 3 : ".<br/>
	 */
	public static final String NBRE_INITIAL_PLUS_TROIS 
	= "nombreObjetsinitial + 3 : ";

	
	/**
	 * LOT_OBJET_INITIAL : String :<br/>
	 * "LOT D'OBJETS INITIALEMENT EN BASE : ".<br/>
	 */
	public static final String LOT_OBJET_INITIAL 
	= "LOT D'OBJETS INITIALEMENT EN BASE : ";
	
	
	/**
	 * LOT_OBJETS_APRES_DELETE : String :<br/>
	 * "LOT D'OBJETS EN BASE APRES DELETE : ".<br/>
	 */
	public static final String LOT_OBJETS_APRES_DELETE 
		= "LOT D'OBJETS EN BASE APRES DELETE : ";
	
	
	/**
	 * daoUserSimple : IDaoUserSimple :<br/>
	 * DAO pour les UserSimple.<br/>
	 * INJECTE PAR SPRING.<b/>
	 */
	@Autowired
	private transient IDaoUserSimple daoUserSimple;
	
	
	/**
	 * CIVILITE_M : String :<br/>
	 * "M.".<br/>
	 */
	public static final String CIVILITE_M = "M.";

	
	/**
	 * CIVILITE_MME : String :<br/>
	 * "Mme".<br/>
	 */
	public static final String CIVILITE_MME = "Mme";
	
	
	/**
	 * PRENOM_WALLACE1 : String :<br/>
	 * "Wallace1".<br/>
	 */
	public static final String PRENOM_WALLACE1 = "Wallace1";

		
	/**
	 * PRENOM_AMANDINE : String :<br/>
	 * "Amandine".<br/>
	 */
	public static final String PRENOM_AMANDINE = "Amandine";
	
	
	/**
	 * PRENOM_GERALDINE : String :<br/>
	 * "Géraldine".<br/>
	 */
	public static final String PRENOM_GERALDINE = "Géraldine";
	

	/**
	 * PRENOM_JEAN_FREDERIC : String :<br/>
	 * "Jean-Frédéric".<br/>
	 */
	public static final String PRENOM_JEAN_FREDERIC = "Jean-Frédéric";
	
	
	/**
	 * NOM_WATSON : String :<br/>
	 * "Watson".<br/>
	 */
	public static final String NOM_WATSON = "Watson";
	
	
	/**
	 * NOM_ROURKE_1 : String :<br/>
	 * "Rourke1".<br/>
	 */
	public static final String NOM_ROURKE_1 = "Rourke1";

	
	/**
	 * NOM_BORNE : String :<br/>
	 * "Bôrne".<br/>
	 */
	public static final String NOM_BORNE = "Bôrne";
	
	
	/**
	 * EMAIL_YAHOO : String :<br/>
	 * "email@yahoo.fr".<br/>
	 */
	public static final String EMAIL_YAHOO = "email@yahoo.fr";

	
	/**
	 * EMAIL_BORNE : String :<br/>
	 * "jean-frederic.borne@free.fr".<br/>
	 */
	public static final String EMAIL_BORNE = "jean-frederic.borne@free.fr";
	
	
	/**
	 * LOGIN : String :<br/>
	 * "login".<br/>
	 */
	public static final String LOGIN = "login";

	
	/**
	 * LOGIN_AMANDINE_WATSON : String :<br/>
	 * "Amandine.Watson".<br/>
	 */
	public static final String LOGIN_AMANDINE_WATSON = "Amandine.Watson";

	
	/**
	 * LOGIN_GERALDINE_WATSON : String :<br/>
	 * "Geraldine.Watson".<br/>
	 */
	public static final String LOGIN_GERALDINE_WATSON = "Geraldine.Watson";
			

	/**
	 * LOGIN_BORNE : String :<br/>
	 * "jfbornelogin".<br/>
	 */
	public static final String LOGIN_BORNE = "jfbornelogin";
	
		
	/**
	* MDP : String :<br/>
	* "mdp".<br/>
	*/
	public static final String MDP = "mdp";
	
	
	/**
	* MDP_ZOZO93 : String :<br/>
	* "zozo93".<br/>
	*/
	public static final String MDP_ZOZO93 = "zozo93";

	
	/**
	 * MDP_BORNE : String :<br/>
	 * "jfbornemdp".<br/>
	 */
	public static final String MDP_BORNE = "jfbornemdp";
	
	
	/**
	 * ADMINISTRATEUR : String :<br/>
	 * "ADMINISTRATEUR".<br/>
	 */
	public static final String ADMINISTRATEUR = "ADMINISTRATEUR";
	
	
	/**
	 * UTILISATEUR : String :<br/>
	 * "UTILISATEUR".<br/>
	 */
	public static final String UTILISATEUR = "UTILISATEUR";


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
	@Commit
	@Transactional
	@Test
	public void testCreateNull() throws AbstractDaoException {
				
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		final IUserSimple objet1 = null;
		IUserSimple objet1Persistant = null;
						
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testCreateNull()");
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
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_ZERO
					, nombreObjetsFinal == nombreObjetsinitial + 0);
			
		}
		catch (AbstractDaoException e) {			
			this.afficherAbstractDaoException(e);			
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testCreateNull()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);						
		}

		/* Vide la table. */
		this.viderTable();

	} // Fin de testCreateNull().__________________________________________
	
	
	
	/**
	 * method testCreate() :<br/>
	 * <ul>
	 * Teste la méthode <b>create(IUserSimple pObject)</b>.<br/>
	 * <li>garantit que create(IUserSimple pObject) insère 
	 * un objet en base.</li>
	 * </ul>
	 * 
	 * @throws AbstractDaoException 
	 */
	@Commit
	@Transactional
	@Test
	public void testCreate() throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		IUserSimple objet1Persistant = null;
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
				
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testCreate()");
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
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_UN
					, nombreObjetsFinal == nombreObjetsinitial + 1);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testCreate()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);
		}
		
		/* Vide la table. */
		this.viderTable();
		
	} // Fin de testCreate().______________________________________________
	

	
	/**
	 * method testCreateDoublon() :<br/>
	 * <ul>
	 * Teste la méthode <b>create(IUserSimple pDoublon)</b>.<br/>
	 * <li>garantit que create(IUserSimple pDoublon) retourne 
	 * null sans lever d'Exception.</li>
	 * </ul>
	 * 
	 * @throws AbstractDaoException 
	 */
	@Commit
	@Transactional
	@Test
	public void testCreateDoublon() 
							throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		IUserSimple objet1Persistant = null;
		IUserSimple objet2PersistantEquals1 = null;
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet2Equals1 
		= new UserSimple(CIVILITE_MME
				, PRENOM_AMANDINE, NOM_WATSON
				, EMAIL_YAHOO
				, LOGIN_BORNE, MDP_BORNE
				, ADMINISTRATEUR);
		
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testCreateDoublon()");
			this.afficherObjetNonPersistant(objet1, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet2Equals1, nombreObjetsinitial);
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			objet1Persistant = this.daoUserSimple.create(objet1);
			objet2PersistantEquals1 = this.daoUserSimple.create(objet2Equals1);
			/* *********************************************** */
			
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que create(IUserSimple pObject) 
			 * insère un objet en base.*/
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_UN
					, nombreObjetsFinal == nombreObjetsinitial + 1);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testCreateDoublon()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);
			this.afficherObjetPersistant(
					objet2PersistantEquals1, nombreObjetsFinal);
		}

		/* Vide la table. */
		this.viderTable();

	} // Fin de testCreateDoublon()._______________________________________


	
	/**
	 * method testSaveNull() :<br/>
	 * <ul>
	 * Teste la méthode <b>save(null)</b>.<br/>
	 * <li>garantit que save(null) ne fait rien 
	 * et retourne null.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testSaveNull() throws AbstractDaoException {
				
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		final IUserSimple objet1 = null;
		IUserSimple objet1Persistant = null;
				
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testSaveNull()");
			this.afficherNbreObjetsInitial(nombreObjetsinitial);			
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			objet1Persistant = this.daoUserSimple.save(objet1);
			/* *********************************************** */
			
			/* Calcul du nombre d'objets en base après le traitement. */
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que save(null) ne fait rien et retourne null. */
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_ZERO
					, nombreObjetsFinal == nombreObjetsinitial + 0);
			
		}
		catch (AbstractDaoException e) {			
			this.afficherAbstractDaoException(e);			
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testSaveNull()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);						
		}

		/* Vide la table. */
		this.viderTable();

	} // Fin de testSaveNull().____________________________________________
	
	
	
	/**
	 * method testSave() :<br/>
	 * <ul>
	 * Teste la méthode <b>save(IUserSimple pObject)</b>.<br/>
	 * <li>garantit que save(IUserSimple pObject) insère 
	 * un objet en base.</li>
	 * </ul>
	 * 
	 * @throws AbstractDaoException 
	 */
	@Commit
	@Transactional
	@Test
	public void testSave() throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		IUserSimple objet1Persistant = null;
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, "Christopher", "Columbus"
				, "Christopher.columbus@yahoo.com"
				, "Christopher.columbus", MDP_ZOZO93
				, UTILISATEUR);
		
				
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testSave()");
			this.afficherObjetNonPersistant(objet1, nombreObjetsinitial);
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			objet1Persistant = this.daoUserSimple.save(objet1);
			/* *********************************************** */
			
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que save(IUserSimple pObject) 
			 * insère un objet en base.*/
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_UN
					, nombreObjetsFinal == nombreObjetsinitial + 1);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testSave()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);
		}
		
		/* Vide la table. */
		this.viderTable();
		
	} // Fin de testSave().________________________________________________
	

	
	/**
	 * method testSaveDoublon() :<br/>
	 * <ul>
	 * Teste la méthode <b>save(IUserSimple pDoublon)</b>.<br/>
	 * <li>garantit que save(IUserSimple pDoublon) retourne 
	 * null sans lever d'Exception.</li>
	 * </ul>
	 * 
	 * @throws AbstractDaoException 
	 */
	@Commit
	@Transactional
	@Test
	public void testSaveDoublon() 
							throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		IUserSimple objet1Persistant = null;
		IUserSimple objet2PersistantEquals1 = null;
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet2Equals1 
		= new UserSimple(CIVILITE_MME
				, PRENOM_AMANDINE, NOM_WATSON
				, EMAIL_YAHOO
				, LOGIN_BORNE, MDP_BORNE
				, ADMINISTRATEUR);
		
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testSaveDoublon()");
			this.afficherObjetNonPersistant(objet1, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet2Equals1, nombreObjetsinitial);
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			objet1Persistant = this.daoUserSimple.save(objet1);
			objet2PersistantEquals1 = this.daoUserSimple.save(objet2Equals1);
			/* *********************************************** */
			
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que save(IUserSimple pObject) 
			 * insère un objet en base.*/
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_UN
					, nombreObjetsFinal == nombreObjetsinitial + 1);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testSaveDoublon()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);
			this.afficherObjetPersistant(
					objet2PersistantEquals1, nombreObjetsFinal);
		}

		/* Vide la table. */
		this.viderTable();

	} // Fin de testSaveDoublon()._________________________________________

	

	/**
	 * method testPersistNull() :<br/>
	 * <ul>
	 * Teste la méthode <b>persist(null)</b>.<br/>
	 * <li>garantit que persist(null) ne fait rien.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testPersistNull() throws AbstractDaoException {
				
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		final IUserSimple objet1 = null;
		IUserSimple objet1Persistant = null;
				
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testPersistNull()");
			this.afficherNbreObjetsInitial(nombreObjetsinitial);			
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			this.daoUserSimple.persistSousClasse(objet1);
			objet1Persistant = this.daoUserSimple.retrieve(objet1);
			/* *********************************************** */
			
			/* Calcul du nombre d'objets 
			 * en base après le traitement. */
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que persist(null) 
			 * ne fait rien et retourne null. */
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_ZERO
					, nombreObjetsFinal == nombreObjetsinitial + 0);
			
		}
		catch (AbstractDaoException e) {			
			this.afficherAbstractDaoException(e);			
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testPersistNull()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);						
		}

		/* Vide la table. */
		this.viderTable();

	} // Fin de testPersistNull()._________________________________________
	
	
	
	/**
	 * method testPersist() :<br/>
	 * <ul>
	 * Teste la méthode <b>persist(IUserSimple pObject)</b>.<br/>
	 * <li>garantit que persist(IUserSimple pObject) insère 
	 * un objet en base.</li>
	 * </ul>
	 * 
	 * @throws AbstractDaoException 
	 */
	@Commit
	@Transactional
	@Test
	public void testPersist() throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		IUserSimple objet1Persistant = null;
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
				
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testPersist()");
			this.afficherObjetNonPersistant(objet1, nombreObjetsinitial);
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			this.daoUserSimple.persistSousClasse(objet1);
			objet1Persistant = this.daoUserSimple.retrieve(objet1);
			/* *********************************************** */
			
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que persist(IUserSimple pObject) 
			 * insère un objet en base.*/
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_UN
					, nombreObjetsFinal == nombreObjetsinitial + 1);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testPersist()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);
		}
		
		/* Vide la table. */
		this.viderTable();
		
	} // Fin de testPersist()._____________________________________________
	

	
	/**
	 * method testPersistDoublon() :<br/>
	 * <ul>
	 * Teste la méthode <b>persist(IUserSimple pDoublon)</b>.<br/>
	 * <li>garantit que persist(IUserSimple pDoublon) retourne 
	 * null sans lever d'Exception.</li>
	 * </ul>
	 * 
	 * @throws AbstractDaoException 
	 */
	@Commit
	@Transactional
	@Test
	public void testPersistDoublon() 
							throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		IUserSimple objet1Persistant = null;
		IUserSimple objet2PersistantEquals1 = null;
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet2Equals1 
		= new UserSimple(CIVILITE_MME
				, PRENOM_AMANDINE, NOM_WATSON
				, EMAIL_YAHOO
				, LOGIN_BORNE, MDP_BORNE
				, ADMINISTRATEUR);
		
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testPersistDoublon()");
			this.afficherObjetNonPersistant(objet1, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet2Equals1, nombreObjetsinitial);
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			this.daoUserSimple.persistSousClasse(objet1);
			this.daoUserSimple.persistSousClasse(objet2Equals1);
			objet1Persistant = this.daoUserSimple.retrieve(objet1);
			objet2PersistantEquals1 = this.daoUserSimple.retrieve(objet2Equals1);
			/* *********************************************** */
			
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que persist(IUserSimple pObject) 
			 * insère un objet en base.*/
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_UN
					, nombreObjetsFinal == nombreObjetsinitial + 1);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testPersistDoublon()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);
			this.afficherObjetPersistant(
					objet2PersistantEquals1, nombreObjetsFinal);
		}

		/* Vide la table. */
		this.viderTable();

	} // Fin de testPersistDoublon().______________________________________


	

	/**
	 * method testPersistSousClasseNull() :<br/>
	 * <ul>
	 * Teste la méthode <b>persistSousClasse(null)</b>.<br/>
	 * <li>garantit que persistSousClasse(null) ne fait rien.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testPersistSousClasseNull() throws AbstractDaoException {
				
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		final IUserSimple objet1 = null;
		IUserSimple objet1Persistant = null;
				
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testPersistSousClasseNull()");
			this.afficherNbreObjetsInitial(nombreObjetsinitial);			
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			this.daoUserSimple.persistSousClasse(objet1);
			objet1Persistant = this.daoUserSimple.retrieve(objet1);
			/* *********************************************** */
			
			/* Calcul du nombre d'objets en base après le traitement. */
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que persistSousClasse(null) ne fait 
			 * rien et retourne null. */
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_ZERO
					, nombreObjetsFinal == nombreObjetsinitial + 0);
			
		}
		catch (AbstractDaoException e) {			
			this.afficherAbstractDaoException(e);			
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testPersistSousClasseNull()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);						
		}

		/* Vide la table. */
		this.viderTable();

	} // Fin de testPersistSousClasseNull()._______________________________
	
	
	
	/**
	 * method testPersistSousClasse() :<br/>
	 * <ul>
	 * Teste la méthode 
	 * <b>persistSousClasse(IUserSimple pObject)</b>.<br/>
	 * <li>garantit que persistSousClasse(IUserSimple pObject) insère 
	 * un objet en base.</li>
	 * </ul>
	 * 
	 * @throws AbstractDaoException 
	 */
	@Commit
	@Transactional
	@Test
	public void testPersistSousClasse() throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		IUserSimple objet1Persistant = null;
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
				
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testPersistSousClasse()");
			this.afficherObjetNonPersistant(objet1, nombreObjetsinitial);
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			this.daoUserSimple.persistSousClasse(objet1);
			objet1Persistant = this.daoUserSimple.retrieve(objet1);
			/* *********************************************** */
			
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que persistSousClasse(IUserSimple pObject) 
			 * insère un objet en base.*/
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_UN
					, nombreObjetsFinal == nombreObjetsinitial + 1);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testPersistSousClasse()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);
		}
		
		/* Vide la table. */
		this.viderTable();
		
	} // Fin de testPersistSousClasse().___________________________________
	

	
	/**
	 * method testPersistSousClasseDoublon() :<br/>
	 * <ul>
	 * Teste la méthode 
	 * <b>persistSousClasse(IUserSimple pDoublon)</b>.<br/>
	 * <li>garantit que persistSousClasse(IUserSimple pDoublon) retourne 
	 * null sans lever d'Exception.</li>
	 * </ul>
	 * 
	 * @throws AbstractDaoException 
	 */
	@Commit
	@Transactional
	@Test
	public void testPersistSousClasseDoublon() 
							throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		IUserSimple objet1Persistant = null;
		IUserSimple objet2PersistantEquals1 = null;
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet2Equals1 
		= new UserSimple(CIVILITE_MME
				, PRENOM_AMANDINE, NOM_WATSON
				, EMAIL_YAHOO
				, LOGIN_BORNE, MDP_BORNE
				, ADMINISTRATEUR);
		
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testPersistSousClasseDoublon()");
			this.afficherObjetNonPersistant(objet1, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet2Equals1, nombreObjetsinitial);
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			this.daoUserSimple.persistSousClasse(objet1);
			this.daoUserSimple.persistSousClasse(objet2Equals1);
			objet1Persistant = this.daoUserSimple.retrieve(objet1);
			objet2PersistantEquals1 = this.daoUserSimple.retrieve(objet2Equals1);
			/* *********************************************** */
			
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que persistSousClasse(IUserSimple pObject) 
			 * insère un objet en base.*/
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_UN
					, nombreObjetsFinal == nombreObjetsinitial + 1);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testPersistSousClasseDoublon()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);
			this.afficherObjetPersistant(
					objet2PersistantEquals1, nombreObjetsFinal);
		}

		/* Vide la table. */
		this.viderTable();

	} // Fin de testPersistSousClasseDoublon().____________________________



	/**
	 * method testCreateReturnIdNull() :<br/>
	 * <ul>
	 * Teste la méthode <b>createReturnId(null)</b>.<br/>
	 * <li>garantit que createReturnId(null) ne fait rien 
	 * et retourne null.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testCreateReturnIdNull() throws AbstractDaoException {
				
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		final IUserSimple objet1 = null;
		IUserSimple objet1Persistant = null;
		Long idObjetPersistant = null;
				
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testCreateReturnIdNull()");
			this.afficherNbreObjetsInitial(nombreObjetsinitial);			
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			idObjetPersistant = this.daoUserSimple.createReturnId(objet1);
			objet1Persistant = this.daoUserSimple.findById(idObjetPersistant);
			/* *********************************************** */
			
			/* Calcul du nombre d'objets en base après le traitement. */
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que create(null) ne fait rien et retourne null. */
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_ZERO
					, nombreObjetsFinal == nombreObjetsinitial + 0);
			
		}
		catch (AbstractDaoException e) {			
			this.afficherAbstractDaoException(e);			
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testCreateReturnIdNull()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);						
		}

		/* Vide la table. */
		this.viderTable();

	} // Fin de testCreateReturnId().______________________________________
	

	
	/**
	 * method testCreateReturnId() :<br/>
	 * <ul>
	 * Teste la méthode <b>createReturnId(IUserSimple pObject)</b>.<br/>
	 * <li>garantit que createReturnId(IUserSimple pObject) insère 
	 * un objet en base et retourne son ID.</li>
	 * </ul>
	 * 
	 * @throws AbstractDaoException 
	 */
	@Commit
	@Transactional
	@Test
	public void testCreateReturnId() throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		IUserSimple objet1Persistant = null;
		Long idObjetPersistant = null;
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, "David", "Copperfield"
				, "david.copperfield@tele1.com"
				, "david.copperfield", "dcopperfield"
				, UTILISATEUR);
		
				
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testCreateReturnId()");
			this.afficherObjetNonPersistant(objet1, nombreObjetsinitial);
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			idObjetPersistant = this.daoUserSimple.createReturnId(objet1);
			objet1Persistant = this.daoUserSimple.findById(idObjetPersistant);
			/* *********************************************** */
			
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que create(IUserSimple pObject) 
			 * insère un objet en base.*/
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_UN
					, nombreObjetsFinal == nombreObjetsinitial + 1);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testCreateReturnId()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);
		}
		
		/* Vide la table. */
		this.viderTable();
		
	} // Fin de testCreateReturnId().______________________________________
	

	
	/**
	 * method testCreateReturnIdDoublon() :<br/>
	 * <ul>
	 * Teste la méthode <b>createReturnId(IUserSimple pDoublon)</b>.<br/>
	 * <li>garantit que createReturnId(IUserSimple pDoublon) retourne 
	 * null sans lever d'Exception.</li>
	 * </ul>
	 * 
	 * @throws AbstractDaoException 
	 */
	@Commit
	@Transactional
	@Test
	public void testCreateReturnIdDoublon() 
							throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		IUserSimple objet1Persistant = null;
		IUserSimple objet2PersistantEquals1 = null;
		
		Long idObjet1Persistant = null;
		Long idObjet2PersistantEquals1 = null;
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
		/* Instanciation d'un IUserSimple. */
		final IUserSimple objet2Equals1 
		= new UserSimple(CIVILITE_MME
				, PRENOM_AMANDINE, NOM_WATSON
				, EMAIL_YAHOO
				, LOGIN_BORNE, MDP_BORNE
				, ADMINISTRATEUR);
		
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testCreateReturnIdDoublon()");
			this.afficherObjetNonPersistant(objet1, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet2Equals1, nombreObjetsinitial);
		}
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			idObjet1Persistant = this.daoUserSimple.createReturnId(objet1);
			idObjet2PersistantEquals1 = this.daoUserSimple.createReturnId(objet2Equals1);
			objet1Persistant = this.daoUserSimple.findById(idObjet1Persistant);
			objet2PersistantEquals1 = this.daoUserSimple.findById(idObjet2PersistantEquals1);
			/* *********************************************** */
			
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que create(IUserSimple pObject) 
			 * insère un objet en base.*/
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_UN
					, nombreObjetsFinal == nombreObjetsinitial + 1);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testCreateReturnIdDoublon()");
			this.afficherObjetPersistant(
					objet1Persistant, nombreObjetsFinal);
			this.afficherObjetPersistant(
					objet2PersistantEquals1, nombreObjetsFinal);
		}

		/* Vide la table. */
		this.viderTable();

	} // Fin de testCreateReturnIdDoublon()._______________________________



	/**
	 * method testSaveLot() :<br/>
	 * <ul>
	 * Teste la méthode <b>save(Iterable&lt;S&gt; pObjects)</b>.<br/>
	 * <li>garantit que save(Iterable&lt;S&gt; pObjects) insère 
	 * un lot d'objets en base.</li>
	 * <li>garantit que save(Iterable&lt;S&gt; pObjects) 
	 * saute les null.</li>
	 * <li>garantit que save(Iterable&lt;S&gt; pObjects) 
	 * saute les doublons.</li>
	 * </ul>
	 * 
	 * @throws AbstractDaoException 
	 */
	@Commit
	@Transactional
	@Test
	public void testSaveLot() 
							throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		List<IUserSimple> lotPersistant = null;
		
		/* Instanciation de IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, "Zorro", "Halliday"
				, EMAIL_BORNE
				, "Zorro.Halliday", MDP_BORNE
				, UTILISATEUR);
		
		final IUserSimple objet2Null = null;
		
		final IUserSimple objet3Equals1 
		= new UserSimple(CIVILITE_M
				, "Zorro", "Halliday"
				, EMAIL_BORNE
				, "Zorro.Halliday", MDP_BORNE
				, UTILISATEUR);
		
		final IUserSimple objet4 
		= new UserSimple(CIVILITE_MME
				, "Calamity", "Jane"
				, EMAIL_YAHOO
				, "Calamity.Jane", MDP_BORNE
				, ADMINISTRATEUR);
		
		/* Constitution d'un lot d'objets. */
		final List<IUserSimple> lot = new ArrayList<IUserSimple>();
		
		lot.add(objet1);
		lot.add(objet2Null);
		lot.add(objet3Equals1);
		lot.add(objet4);
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();

		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testSaveLot()");
			this.afficherObjetNonPersistant(objet1, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet2Null, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet3Equals1, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet4, nombreObjetsinitial);
		}

		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			lotPersistant = (List<IUserSimple>) this.daoUserSimple.save(lot);
			/* *********************************************** */
			
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que save(Lot pObjects) 
			 * insère des objets en base.*/
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_DEUX
					, nombreObjetsFinal == nombreObjetsinitial + 2);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}

		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testSaveLot()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("LOT D'ENREGISTREMENTS EN BASE : ");
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();

		}
				
		/* Vide la table. */
		this.viderTable();
		
	} // Fin de testSaveLot()._____________________________________________
	

	
	/**
	 * method testRetrieve() :<br/>
	 * <ul>
	 * Teste la méthode <b>retrieve(IUserSimple pObject)</b>.<br/>
	 * <li>garantit que retrieve(IUserSimple pObject) retrouve 
	 * objet existant en base.</li>
	 * <li>garantit que retrieve(objetInexistant) retourne null.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testRetrieve() 
							throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		IUserSimple objetpersistantInexistant = null;
		IUserSimple objetpersistant = null;
		
		List<IUserSimple> lotPersistant = null;
		
		/* Instanciation de IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
		final IUserSimple objet2Null = null;
		
		final IUserSimple objet3Equals1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
		final IUserSimple objet4 
		= new UserSimple(CIVILITE_MME
				, PRENOM_AMANDINE, NOM_WATSON
				, EMAIL_YAHOO
				, LOGIN_AMANDINE_WATSON, MDP_BORNE
				, ADMINISTRATEUR);
		
		final IUserSimple objet5 
		= new UserSimple(CIVILITE_M
				, PRENOM_WALLACE1, NOM_ROURKE_1
				, EMAIL_YAHOO
				, LOGIN, MDP_ZOZO93
				, UTILISATEUR);
		
		final IUserSimple objetInexistant 
		= new UserSimple(
				CIVILITE_M
				, "prenomInexistant1", "nomInexistant1"
				, "emailInexistant1"
				, "loginInexistant1", "mdpInexistant1"
				, UTILISATEUR);
		
		/* Constitution d'un lot d'objets. */
		final List<IUserSimple> lot = new ArrayList<IUserSimple>();
		
		lot.add(objet1);
		lot.add(objet2Null);
		lot.add(objet3Equals1);
		lot.add(objet4);
		lot.add(objet5);
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();

		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testRetrieve()");
			this.afficherObjetNonPersistant(objet1, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet2Null, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet3Equals1, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet4, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet5, nombreObjetsinitial);
		}

		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			lotPersistant = (List<IUserSimple>) this.daoUserSimple.save(lot);
			/* *********************************************** */
			
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que save(Lot pObjects) 
			 * insère des objets en base.*/
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_TROIS
					, nombreObjetsFinal == nombreObjetsinitial + 3);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}

		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testRetrieve()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("LOT D'ENREGISTREMENTS EN BASE : ");
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();

		}
		
		/* *********************************************** */
		/* ********************* RETRIEVE **************** */
		objetpersistantInexistant = this.daoUserSimple.retrieve(objetInexistant);
		
		/* garantit que retrieve(objetInexistant) retourne null. */
		assertNull("Un objet non persistant ne peut être trouvé en base : "
				, objetpersistantInexistant);

		/* *********************************************** */
		/* ********************* RETRIEVE **************** */
		objetpersistant = this.daoUserSimple.retrieve(objet5);
		
		/* garantit que retrieve(IUserSimple pObject) retrouve 
		 * objet existant en base.*/
		assertEquals("Un objet persistant doit être trouvé en base : "
				, objet5
					, objetpersistant);
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testRetrieve()");
			this.afficherObjetPersistant(
					objetpersistant, nombreObjetsFinal);
		}
		
		/* Vide la table. */
		this.viderTable();
		
	} // Fin de testRetrieve().____________________________________________
	

	
	/**
	 * method testFindById() :<br/>
	 * <ul>
	 * Teste la méthode <b>findById(Long pId)</b>.<br/>
	 * <li>garantit que findById(Long pId) retrouve un
	 * objet existant en base.</li>
	 * <li>garantit que findById(Long pIdInexistant) retourne null.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testFindById() 
							throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		Long nombreObjetsFinal = 0L;
		
		IUserSimple objetpersistantInexistant = null;
		IUserSimple objetpersistant = null;
		
		/* remplit de la table. */
		this.remplirTable(affichage);
		
		nombreObjetsFinal = this.daoUserSimple.count();
		
		/* *********************************************** */
		/* ********************* FINDBYID **************** */
		objetpersistantInexistant = this.daoUserSimple.findById(100L);
		
		/* garantit que findById(Long pIdInexistant) retourne null. */
		assertNull("Un objet non persistant ne peut être trouvé en base : "
				, objetpersistantInexistant);

		/* *********************************************** */
		/* ********************* FINDBYID **************** */
		objetpersistant = this.daoUserSimple.findById(3L);
		
		if (objetpersistant != null) {
			
			/* garantit que findById(Long pIdExistant) retrouve 
			 * un objet existant en base.*/
			assertNotNull("Un objet persistant doit être trouvé en base : "
					, objetpersistant.getId());
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				System.out.println("testFindById()");
				this.afficherObjetPersistant(
						objetpersistant, nombreObjetsFinal);
			}
			
		}
				
		/* Vide la table. */
		this.viderTable();
				
	} // Fin de testFindById().____________________________________________
	

	
	/**
	 * method testFindAll() :<br/>
	 * <ul>
	 * Teste la méthode <b>findAll()</b>.<br/>
	 * <li>garantit que findAll() retrouve 
	 * tous les objets existants en base.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testFindAll() 
							throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}
		
		List<IUserSimple> lotPersistant = null;
				
		/* remplit de la table. */
		this.remplirTable(affichage);
		
		
		/* *********************************************** */
		/* ********************* FINDALL ***************** */
		lotPersistant = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testFindAll()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("LOT D'OBJETS TROUVES EN BASE PAR findAll() : ");
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		
		/* garantit que findAll() retrouve tous 
		 * les objets existants en base. */
		assertEquals("Le nombre d'objets trouvés "
				+ "par findAll() doit être 3 : "
				, 3
					, lotPersistant.size());
				
		/* Vide la table. */
		this.viderTable();
				
	} // Fin de testFindAll()._____________________________________________
	

	
	/**
	 * method testFindAllMax() :<br/>
	 * <ul>
	 * Teste la méthode <b>findAllMax(Long pMax)</b>.<br/>
	 * <li>garantit que findAll(Long pMax) retrouve 
	 * les pMax premiers objets existants en base.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testFindAllMax() 
							throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}
		
		List<IUserSimple> lotPersistant = null;
				
		/* remplit de la table. */
		this.remplirTable(affichage);
		
		
		/* *********************************************** */
		/* ********************* FINDALLMax ************** */
		lotPersistant = this.daoUserSimple.findAllMax(2L);
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testFindAllMax()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("LOT D'OBJETS TROUVES EN BASE PAR findAllMax(2) : ");
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		if (lotPersistant != null) {
			
			/* garantit que findAllMax() retrouve tous 
			 * les pMax premiers objets existants en base. */
			assertEquals("Le nombre d'objets trouvés "
					+ "par findAll() doit être 2 : "
					, 2
						, lotPersistant.size());
			
		}
		
				
		/* Vide la table. */
		this.viderTable();
				
	} // Fin de testFindAllMax().__________________________________________
	

		
	/**
	 * method testFindAllIterable() :<br/>
	 * <ul>
	 * Teste la méthode <b>findAll(Iterable<ID> pIds)</b>.<br/>
	 * <li>garantit que findAll(Iterable<ID> pIds) retrouve 
	 * les objets existants en base.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testFindAllIterable() 
							throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}
		
		List<IUserSimple> lotPersistant = null;
		Iterable<IUserSimple> lotPersistantIterable = null;
				
		/* remplit de la table. */
		this.remplirTable(affichage);
		
		final List<Long> listIds = new ArrayList<Long>();
		listIds.add(1L);
		listIds.add(2L);
		
		/* *********************************************** */
		/* ***************** FINDALL(Ite) **************** */
		lotPersistantIterable = this.daoUserSimple.findAll(listIds);
		
		lotPersistant = this.fabriquerList(lotPersistantIterable);
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testFindAllIterable()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("LOT D'OBJETS TROUVES EN BASE PAR findAll(listIds) : ");
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		if (lotPersistant != null) {
			
			final boolean exists1 = this.daoUserSimple.exists(1L);
			final boolean exists2 = this.daoUserSimple.exists(2L);
			
			if (exists1 && exists2) {
				
				/* garantit que findAllMax() retrouve tous 
				 * les objets existants en base. */
				assertEquals("Le nombre d'objets trouvés "
						+ "par findAll() doit être 2 : "
						, 2
							, lotPersistant.size());
			}
						
		}
						
		/* Vide la table. */
		this.viderTable();
				
	} // Fin de testFindAllIterable()._____________________________________
	

	
	/**
	 * method testUpdateInexistant() :<br/>
	 * <ul>
	 * Teste la méthode <b>update(T pObjectInexistant)</b>.<br/>
	 * <li>garantit que update(T pObjectInexistant) ne fait rien 
	 * et ne persiste pas pObjectInexistant en base.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testUpdateInexistant() 
			throws AbstractDaoException {
				
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}
		
		IUserSimple objetpersistantInexistant = null;
		
		final IUserSimple objetInexistant 
		= new UserSimple(
				CIVILITE_M
				, "prenomInexistant", "nomInexistant"
				, "emailInexistant"
				, "loginInexistant", "mdpInexistant"
				, UTILISATEUR);
		
		/* ************************************************ */
		/* ***************** UPDATE(Objet) **************** */
		objetpersistantInexistant 
			= this.daoUserSimple.update(objetInexistant);
		
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testUpdateInexistant()");
			this.afficherObjetPersistant(
					objetpersistantInexistant, 0L);
		}
		
		if (objetpersistantInexistant != null) {
			
			assertEquals("Le nom doit être nomInexistant : "
					, "nomInexistant"
						, objetpersistantInexistant.getNom());
			
			assertSame("L'objet à modifer et l'objet modifié "
					+ "sont la même instance : "
					, objetInexistant
						, objetpersistantInexistant);
			
			/* garantit que update(T pObjectInexistant) ne fait rien 
			 * et ne persiste pas pObjectInexistant en base. */
			assertNull("l'ID de l'objet inexistant doit être null : "
					, objetpersistantInexistant.getId());
			
		}
		
		/* Vide la table. */
		this.viderTable();
		
	}
	

	
	/**
	 * method testUpdate() :<br/>
	 * <ul>
	 * Teste la méthode <b>update(T pObject)</b>.<br/>
	 * <li>garantit que update(T pObject) modifie 
	 * l'objet existant en base.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testUpdate() 
			throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}
	
		IUserSimple objet1 = null;
		IUserSimple objet1Persistant = null;
		IUserSimple objet1ModifiePersistant = null;
		
		/* remplit de la table. */
		this.remplirTable(affichage);
		
		/* Instanciation de IUserSimple. */
		objet1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
				
		/* Récupération de l'objet persistant. */
		objet1Persistant = this.daoUserSimple.retrieve(objet1);
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testUpdate()");
			this.afficherObjetPersistant(
					objet1Persistant, 3L);
		}
		
		/* ************** */
		/* Modifications. */
		objet1Persistant.setPrenom("Jean-Frédéric modifié");
		objet1Persistant.setNom("Bôrne modifié");
		
		/* ************************************************ */
		/* ***************** UPDATE(Objet) **************** */
		objet1ModifiePersistant = this.daoUserSimple.update(objet1Persistant);

		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			System.out.println("testUpdate()");
			this.afficherObjetPersistant(
					objet1ModifiePersistant, 3L);
		}
		
		if (objet1ModifiePersistant != null) {
			
			/* garantit que update(T pObject) modifie 
			 * l'objet existant en base.*/
			assertEquals("Le nom doit être Bôrne modifié : "
					, "Bôrne modifié"
						, objet1ModifiePersistant.getNom());
			
			assertSame("L'objet à modifer et l'objet modifié sont la même instance : "
					, objet1Persistant
						, objet1ModifiePersistant);
			
		}
		
		/* Vide la table. */
		this.viderTable();
		
	} // Fin de testUpdate().______________________________________________
	

		
	/**
	 * method testDeleteInexistant() :<br/>
	 * <ul>
	 * Teste la méthode <b>delete(T pObjectInexistant)</b>.<br/>
	 * <li>garantit que delete(T pObjectInexistant) ne fait rien 
	 * et retourne false.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testDeleteInexistant() 
			throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}
	
		IUserSimple objet1 = null;
		boolean resultat = false;
		List<IUserSimple> lotPersistant = null;
		List<IUserSimple> lotPersistantApresDelete = null;
		
		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		/* Instanciation de IUserSimple. */
		objet1 
		= new UserSimple(CIVILITE_M
				, "Papy1", "Gonzales1"
				, "papy.gonzales1@free.fr"
				, "papy.gonzales1", "ppg1"
				, UTILISATEUR);
		
		final IUserSimple objetInexistant 
		= new UserSimple(
				CIVILITE_M
				, "prenomInexistant2", "nomInexistant2"
				, "emailInexistant2"
				, "loginInexistant2", "mdpInexistant2"
				, UTILISATEUR);


		/* remplit de la table. */
		this.remplirTable(affichage);
		this.daoUserSimple.create(objet1);
		
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* *********************************************** */
		/* ********************* FINDALL ***************** */
		lotPersistant = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDeleteInexistant()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println(LOT_OBJET_INITIAL);
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		
		/* ************************************************ */
		/* ***************** DELETE(Objet) **************** */
		resultat = this.daoUserSimple.delete(objetInexistant);

		
		nombreObjetsFinal = this.daoUserSimple.count();
		
		lotPersistantApresDelete = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDeleteInexistant()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("LOT D'OBJETS EN BASE APRES DELETE (INEXISTANT) : ");
			System.out.println(this.daoUserSimple.afficherListe(lotPersistantApresDelete));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		/* garantit que delete(T pObject) retourne false. */
		assertFalse("Le résultat de delete() doit être false : "
				, resultat);
		
		assertEquals("NbreObjetsFinal = NbreObjetsInitial : "
				, nombreObjetsFinal
					, nombreObjetsinitial);
		
		/* Vide la table. */
		this.viderTable();

	} // Fin de testDeleteInexistant().____________________________________
	

	
	/**
	 * method testDelete() :<br/>
	 * <ul>
	 * Teste la méthode <b>delete(T pObject)</b>.<br/>
	 * <li>garantit que delete(T pObject) détruit 
	 * l'objet existant en base et retourne true.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testDelete() 
			throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}
	
		IUserSimple objet1 = null;
		boolean resultat = false;
		List<IUserSimple> lotPersistant = null;
		List<IUserSimple> lotPersistantApresDelete = null;
		
		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		/* Instanciation de IUserSimple. */
		objet1 
		= new UserSimple(CIVILITE_M
				, "Papy3", "Gonzales3"
				, "papy.gonzales3@free.fr"
				, "papy.gonzales3", "ppg3"
				, UTILISATEUR);

		/* remplit de la table. */
		this.remplirTable(affichage);
		this.daoUserSimple.create(objet1);
		
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* *********************************************** */
		/* ********************* FINDALL ***************** */
		lotPersistant = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDelete()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println(LOT_OBJET_INITIAL);
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		
		/* ************************************************ */
		/* ***************** DELETE(Objet) **************** */
		resultat = this.daoUserSimple.delete(objet1);

		
		nombreObjetsFinal = this.daoUserSimple.count();
		
		lotPersistantApresDelete = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDelete()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println(LOT_OBJETS_APRES_DELETE);
			System.out.println(this.daoUserSimple.afficherListe(lotPersistantApresDelete));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		/* garantit que delete(T pObject) détruit l'objet existant en base. */
		assertTrue("Le résultat de delete() doit être true : "
				, resultat);
		
		assertTrue(NBRE_OBJETS_FINAL_DOIT 
				+ NBRE_INITIAL_PLUS_UN
					, nombreObjetsFinal == nombreObjetsinitial - 1);
		
		/* Vide la table. */
		this.viderTable();

	} // Fin de testDelete().______________________________________________
	

	
	/**
	 * method testDeleteByIdInexistant() :<br/>
	 * <ul>
	 * Teste la méthode <b>deleteById(Long pId)</b>.<br/>
	 * <li>garantit que deleteById(Long pIdInexistant) ne fait rien.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testDeleteByIdInexistant() 
			throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}
	
		IUserSimple objet1 = null;

		List<IUserSimple> lotPersistant = null;
		List<IUserSimple> lotPersistantApresDelete = null;
		
		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		/* Instanciation de IUserSimple. */
		objet1 
		= new UserSimple(CIVILITE_M
				, "Papy4", "Gonzales4"
				, "papy.gonzales4@free.fr"
				, "papy.gonzales4", "ppg4"
				, UTILISATEUR);

		/* remplit de la table. */
		this.remplirTable(affichage);
		this.daoUserSimple.create(objet1);
		
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* *********************************************** */
		/* ********************* FINDALL ***************** */
		lotPersistant = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDeleteByIdInexistant()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println(LOT_OBJET_INITIAL);
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		
		/* **************************************************** */
		/* ***************** DELETEBYID(Objet) **************** */
		this.daoUserSimple.deleteById(100L);

		
		nombreObjetsFinal = this.daoUserSimple.count();
		
		lotPersistantApresDelete = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDeleteByIdInexistant()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("LOT D'OBJETS EN BASE APRES DELETEBYID(inexistant) : ");
			System.out.println(this.daoUserSimple.afficherListe(lotPersistantApresDelete));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		/* garantit que deleteById(T pObject) ne fait rien. */
		assertEquals("deleteById(inexistant) ne fait rien : "
				, nombreObjetsinitial, nombreObjetsFinal);

		/* Vide la table. */
		this.viderTable();

	} // Fin de testDeleteById().__________________________________________
	

	
	/**
	 * method testDeleteById() :<br/>
	 * <ul>
	 * Teste la méthode <b>deleteById(Long pId)</b>.<br/>
	 * <li>garantit que deleteById(Long pId) détruit 
	 * l'objet existant en base.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testDeleteById() 
			throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}
	
		IUserSimple objet1 = null;
		IUserSimple objet1Persistant = null;
		Long idExistant = 0L;
		
		List<IUserSimple> lotPersistant = null;
		List<IUserSimple> lotPersistantApresDelete = null;
		
		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		/* Instanciation de IUserSimple. */
		objet1 
		= new UserSimple(CIVILITE_M
				, "Papy7", "Gonzales7"
				, "papy.gonzales7@free.fr"
				, "papy.gonzales7", "ppg7"
				, UTILISATEUR);

		/* remplit de la table. */
		this.remplirTable(affichage);
		this.daoUserSimple.create(objet1);
		
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* *********************************************** */
		/* ********************* FINDALL ***************** */
		lotPersistant = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDeleteById()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println(LOT_OBJET_INITIAL);
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		objet1Persistant = this.daoUserSimple.retrieve(objet1);
		
		if (objet1Persistant != null) {
			idExistant = objet1Persistant.getId();
		}
		
		
		/* ************************************************ */
		/* ***************** DELETEBYID(Objet) **************** */
		this.daoUserSimple.deleteById(idExistant);

		
		nombreObjetsFinal = this.daoUserSimple.count();
		
		lotPersistantApresDelete = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDeleteById()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println(LOT_OBJETS_APRES_DELETE);
			System.out.println(this.daoUserSimple.afficherListe(lotPersistantApresDelete));
			System.out.println(TIRETS);
			System.out.println();
			
		}
		
		/* garantit que deleteById(Long pId) détruit l'objet existant en base. */		
		assertTrue("NbreObjetsFinal = NbreObjetsInitial - 1 : "
				, nombreObjetsFinal == nombreObjetsinitial - 1);
		
		/* Vide la table. */
		this.viderTable();

	} // Fin de testDeleteById().__________________________________________
	

	
	/**
	 * method testDeleteByIdBooleanInexistant() :<br/>
	 * <ul>
	 * Teste la méthode <b>deleteByIdBoolean(Long pId)</b>.<br/>
	 * <li>garantit que deleteByIdBoolean(Long pIdInexistant) 
	 * ne fait rien et retourne false.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testDeleteByIdBooleanInexistant() 
			throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = true;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}
	
		IUserSimple objet1 = null;
		boolean resultat = false;
		List<IUserSimple> lotPersistant = null;
		List<IUserSimple> lotPersistantApresDelete = null;
		
		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		/* Instanciation de IUserSimple. */
		objet1 
		= new UserSimple(CIVILITE_M
				, "Papy8", "Gonzales8"
				, "papy.gonzales8@free.fr"
				, "papy.gonzales8", "ppg8"
				, UTILISATEUR);

		/* remplit de la table. */
		this.remplirTable(affichage);
		this.daoUserSimple.create(objet1);
		
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* *********************************************** */
		/* ********************* FINDALL ***************** */
		lotPersistant = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDeleteByIdBooleanInexistant()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println(LOT_OBJET_INITIAL);
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		
		/* *************************************************** */
		/* ********* DELETEBYIDBOOLEAN(Objet) **************** */
		resultat = this.daoUserSimple.deleteByIdBoolean(100L);
		
		nombreObjetsFinal = this.daoUserSimple.count();
		
		lotPersistantApresDelete = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDeleteByIdBooleanInexistant()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("LOT D'OBJETS EN BASE APRES DELETEBYIDBOOLEAN(inexistant) : ");
			System.out.println(this.daoUserSimple.afficherListe(lotPersistantApresDelete));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		/* garantit que deleteByIdBoolean(pIdInexistant) retourne false. */
		assertFalse("Le résultat de delete() doit être false : "
				, resultat);
		
		/* garantit que deleteByIdBoolean(pIdInexistant) ne fait rien. */
		assertEquals("Nombre d'objets doit rester inchangé : "
				, nombreObjetsinitial
					, nombreObjetsFinal);
		
		/* Vide la table. */
		this.viderTable();
		
	} // Fin de testDeleteByIdBooleanInexistant()._________________________
	

	
	/**
	 * method testDeleteByIdBoolean() :<br/>
	 * <ul>
	 * Teste la méthode <b>deleteByIdBoolean(Long pId)</b>.<br/>
	 * <li>garantit que deleteByIdBoolean(Long pId) détruit 
	 * l'objet existant en base et retourne true.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testDeleteByIdBoolean() 
			throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}
	
		IUserSimple objet1 = null;
		IUserSimple objet1Persistant = null;
		Long idExistant = 0L;
		boolean resultat = false;
		
		List<IUserSimple> lotPersistant = null;
		List<IUserSimple> lotPersistantApresDelete = null;
		
		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		/* Instanciation de IUserSimple. */
		objet1 
		= new UserSimple(CIVILITE_M
				, "Papy", "Gonzales"
				, "papy.gonzales@free.fr"
				, "papy.gonzales", "ppg"
				, UTILISATEUR);

		/* remplit de la table. */
		this.remplirTable(affichage);
		this.daoUserSimple.create(objet1);
		
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* *********************************************** */
		/* ********************* FINDALL ***************** */
		lotPersistant = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDeleteByIdBoolean()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println(LOT_OBJET_INITIAL);
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		objet1Persistant = this.daoUserSimple.retrieve(objet1);
		
		if (objet1Persistant != null) {
			idExistant = objet1Persistant.getId();
		}
		
		/* ************************************************ */
		/* ***************** DELETE(Objet) **************** */
		resultat = this.daoUserSimple.deleteByIdBoolean(idExistant);
		
		nombreObjetsFinal = this.daoUserSimple.count();
		
		lotPersistantApresDelete = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDeleteByIdBoolean()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("LOT D'OBJETS EN BASE APRES DELETEBYIDBOOLEAN : ");
			System.out.println(this.daoUserSimple.afficherListe(lotPersistantApresDelete));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		/* garantit que deleteByIdBoolean(Long pId) retourne true. */
		assertTrue("Le résultat de testDeleteByIdBoolean() doit être true : "
				, resultat);
		
		/* garantit que deleteByIdBoolean(Long pId) détruit l'objet existant en base. */
		assertTrue("NbreObjetsFinal = NbreObjetsInitial - 1 : "
				, nombreObjetsFinal == nombreObjetsinitial - 1);
		
		/* Vide la table. */
		this.viderTable();
				
	} // Fin de testDeleteByIdBoolean().___________________________________
	

	
	/**
	 * method testDeleteIterable() :<br/>
	 * <ul>
	 * Teste la méthode <b>delete(Iterable)</b>.<br/>
	 * <li>garantit que delete(Iterable) détruit 
	 * les objets existants en base.</li>
	 * </ul>
	 *
	 * @throws AbstractDaoException
	 */
	@Commit
	@Transactional
	@Test
	public void testDeleteIterable() throws AbstractDaoException {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = false;
		// **********************************

		/* daoUserSimple NON INJECTE. */
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherDAONonInstancie();
			}			
			return;
		}

		List<IUserSimple> lotPersistant = null;
		List<IUserSimple> lotPersistantApresDelete = null;
		
		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;

		/* remplit de la table. */
		this.remplirTable(affichage);
		
		/* *********************************************** */
		/* ********************* FINDALL ***************** */
		lotPersistant = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDeleteIterable()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println(LOT_OBJET_INITIAL);
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();
			
		}

		nombreObjetsinitial = this.daoUserSimple.count();

		/* Instanciation de IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
		final IUserSimple objet4 
		= new UserSimple(CIVILITE_MME
				, PRENOM_AMANDINE, NOM_WATSON
				, EMAIL_YAHOO
				, LOGIN_AMANDINE_WATSON, MDP_BORNE
				, ADMINISTRATEUR);
		
		final IUserSimple objetInexistant 
		= new UserSimple(
				CIVILITE_M
				, "prenomInexistant4", "nomInexistant4"
				, "emailInexistant4"
				, "loginInexistant4", "mdpInexistant4"
				, UTILISATEUR);
		
		/* Constitution du lot d'iterables. */
		final List<IUserSimple> lotPersistantIterable 
			= new ArrayList<IUserSimple>();
		lotPersistantIterable.add(objet1);
		lotPersistantIterable.add(objet4);
		lotPersistantIterable.add(objetInexistant);
		
		
		/* *************************************************** */
		/* ********************* DELETE(ITE) ***************** */
		this.daoUserSimple.delete(lotPersistantIterable);
		
		nombreObjetsFinal = this.daoUserSimple.count();
		
		lotPersistantApresDelete = this.daoUserSimple.findAll();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println("testDeleteIterable()");
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("LOT D'OBJETS EN BASE APRES DELETE(Iterable) : ");
			System.out.println(this.daoUserSimple.afficherListe(lotPersistantApresDelete));
			System.out.println(TIRETS);
			System.out.println();
			
		}
		
		/* garantit que delete(Iterable) détruit 
		 * les objets existants en base.*/
		assertTrue("NbreObjetsFinal = NbreObjetsInitial - 2 : "
				, nombreObjetsFinal == nombreObjetsinitial - 2);
		
		/* Vide la table. */
		final boolean resultatVidage = this.daoUserSimple.deleteAllBoolean();
		
		assertTrue("La table doit être vide : ", resultatVidage); 

	} // Fin de testDeleteIterable().______________________________________
	
	
	
	/**
	 * method remplirTable(
	 * boolean pAffichage) :<br/>
	 * Remplit la table USERSIMPLES avec 3 enregistrements.<br/>
	 * <br/>
	 * 
	 * @param pAffichage : boolean.<br/>
	 * 
	 * @throws AbstractDaoException 
	 */
	private void remplirTable(
			final boolean pAffichage) throws AbstractDaoException {
		
		Long nombreObjetsinitial = 0L;
		Long nombreObjetsFinal = 0L;
		
		List<IUserSimple> lotPersistant = null;
		
		/* Instanciation de IUserSimple. */
		final IUserSimple objet1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
		final IUserSimple objet2Null = null;
		
		final IUserSimple objet3Equals1 
		= new UserSimple(CIVILITE_M
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
		final IUserSimple objet4 
		= new UserSimple(CIVILITE_MME
				, PRENOM_AMANDINE, NOM_WATSON
				, EMAIL_YAHOO
				, LOGIN_AMANDINE_WATSON, MDP_BORNE
				, ADMINISTRATEUR);
		
		final IUserSimple objet5 
		= new UserSimple(CIVILITE_M
				, PRENOM_WALLACE1, NOM_ROURKE_1
				, EMAIL_YAHOO
				, LOGIN, MDP_ZOZO93
				, UTILISATEUR);
		
		
		/* Constitution d'un lot d'objets. */
		final List<IUserSimple> lot = new ArrayList<IUserSimple>();
		
		lot.add(objet1);
		lot.add(objet2Null);
		lot.add(objet3Equals1);
		lot.add(objet4);
		lot.add(objet5);
		
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();

		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && pAffichage) {
			this.afficherObjetNonPersistant(objet1, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet2Null, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet3Equals1, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet4, nombreObjetsinitial);
			this.afficherObjetNonPersistant(objet5, nombreObjetsinitial);
		}

		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			lotPersistant = (List<IUserSimple>) this.daoUserSimple.save(lot);
			/* *********************************************** */
			
			nombreObjetsFinal = this.daoUserSimple.count();
			
			/* garantit que save(Lot pObjects) 
			 * insère des objets en base.*/
			assertTrue(NBRE_OBJETS_FINAL_DOIT
					+ NBRE_INITIAL_PLUS_TROIS
					, nombreObjetsFinal == nombreObjetsinitial + 3);
			
		}
		catch (AbstractDaoException e) {
			this.afficherAbstractDaoException(e);
			e.printStackTrace();
		}

		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && pAffichage) {
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("LOT D'ENREGISTREMENTS EN BASE : ");
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();

		}

		final Long nbeObjetsFinal = this.daoUserSimple.count();
		
		assertEquals("La table doit être contenir 3 enregistements : "
				, Long.valueOf(3L), nbeObjetsFinal);
		
	} // Fin de remplirTable(...)._________________________________________
	
	
	
	/**
	 * method viderTable() :<br/>
	 * Vide la table.<br/>
	 * <br/>
	 *
	 * @throws AbstractDaoException
	 */
	private void viderTable() throws AbstractDaoException {
		
		this.daoUserSimple.deleteAll();
		
		final Long nbeObjetsFinal = this.daoUserSimple.count();
		
		assertEquals("La table doit être vide : "
				, Long.valueOf(0L), nbeObjetsFinal);
		
	} // Fin de viderTable().______________________________________________
	
	
	
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
	 * method afficherObjetPersistant(
	 * IUserSimple pObjetPersistant
	 * , Long pNbreObjetsFinal) :<br/>
	 * <ul>
	 * Affiche à la console :
	 * <li>l'objet pObjetPersistant persisté en base.</li>
	 * <li>Le nombre d'objets pNbreObjetsFinal finalement 
	 * en base après le test.</li>
	 * </ul>
	 * <br/>
	 *
	 * @param pObjetPersistant : IUserSimple : 
	 * Objet persistant en base.<br/>
	 * @param pNbreObjetsFinal : Long : 
	 * Nombre d'objets finalement en base.<br/>
	 */
	private void afficherObjetPersistant(
			final IUserSimple pObjetPersistant
				, final Long pNbreObjetsFinal) {
		
		if (pObjetPersistant != null) {
			
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("objet persistant : " 
					+ pObjetPersistant.toString());
			System.out.println("nombre d'objets finalement en base = " 
					+ pNbreObjetsFinal);
			System.out.println(TIRETS);
			System.out.println();
			
		} else {
			
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("objetPersistant est NULL");
			System.out.println(TIRETS);
			System.out.println();
			
		}
		
	} // Fin de afficherObjetPersistant(...).______________________________
	
	
	
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
		
		if (pObjetNonPersistant != null) {
			
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("objet non persistant : " 
					+ pObjetNonPersistant.toString());
			System.out.println("nombre d'objets initialement en base = " 
					+ pNbreObjetsInitial);
			System.out.println(TIRETS);
			System.out.println();

		}
		else {
			
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("objet non persistant est NULL");
			System.out.println("nombre d'objets initialement en base = " 
					+ pNbreObjetsInitial);
			System.out.println(TIRETS);
			System.out.println();
			
		}
		
	} // Fin de afficherObjetNonPersistSousClasseant(...).___________________________
	
	

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
	

	
	/**
	 * method fabriquerList(
	 * Iterable<IUserSimple> pIterable) :<br/>
	 * fabrique une liste à partir d'un Iterable.<br/>
	 * <br/>
	 *
	 * @param pIterable : Iterable<IUserSimple>.<br/>
	 * 
	 * @return : List<IUserSimple>.<br/>
	 */
	public final List<IUserSimple> fabriquerList(
			final Iterable<IUserSimple> pIterable) {
		
		final List<IUserSimple> list = new ArrayList<IUserSimple>();
		
	    for (final IUserSimple item : pIterable) {
	        list.add(item);
	    }
	    
	    return list;
	    
	} // Fin de fabriquerList(...).________________________________________
	
	
	
} // FIN DE LA CLASSE DaoUserSimpleTest.-------------------------------------
