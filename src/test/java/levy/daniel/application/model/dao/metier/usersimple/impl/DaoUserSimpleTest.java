package levy.daniel.application.model.dao.metier.usersimple.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
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
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
				
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
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
				, PRENOM_JEAN_FREDERIC, NOM_BORNE
				, EMAIL_BORNE
				, LOGIN_BORNE, MDP_BORNE
				, UTILISATEUR);
		
				
		/* Compte du nombre d'Objets initialement en base. */
		nombreObjetsinitial = this.daoUserSimple.count();
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
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
				, "prenomInexistant", "nomInexistant"
				, "emailInexistant"
				, "loginInexistant", "mdpInexistant"
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
	 * <li>garantit que findById(Long pId) retrouve 
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
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("LOT D'ENREGISTREMENTS EN BASE : ");
			System.out.println(this.daoUserSimple.afficherListe(lotPersistant));
			System.out.println(TIRETS);
			System.out.println();

		}
		
		/* *********************************************** */
		/* ********************* FINDBYID **************** */
		objetpersistantInexistant = this.daoUserSimple.findById(100L);
		
		/* garantit que retrieve(objetInexistant) retourne null. */
		assertNull("Un objet non persistant ne peut être trouvé en base : "
				, objetpersistantInexistant);

		/* *********************************************** */
		/* ********************* FINDBYID **************** */
		objetpersistant = this.daoUserSimple.findById(3L);
		
		if (objetpersistant != null) {
			
			/* garantit que retrieve(IUserSimple pObject) retrouve 
			 * objet existant en base.*/
			assertNotNull("Un objet persistant doit être trouvé en base : "
					, objetpersistant.getId());
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				this.afficherObjetPersistant(
						objetpersistant, nombreObjetsFinal);
			}
			
		}
				
		/* Vide la table. */
		this.viderTable();
				
	} // Fin de testFindById().____________________________________________
	

	
	/**
	 * method viderTable() :<br/>
	 * Vide la table.<br/>
	 * <br/>
	 *
	 * @throws AbstractDaoException
	 */
	private void viderTable() throws AbstractDaoException {
		this.daoUserSimple.deleteAll();
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
	
	
	
} // FIN DE LA CLASSE DaoUserSimpleTest.-------------------------------------
