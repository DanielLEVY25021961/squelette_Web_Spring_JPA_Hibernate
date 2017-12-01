package levy.daniel.application.model.dao.metier.usersimple.impl;

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
 * @author dan Lévy
 * @version 1.0
 * @since 30 nov. 2017
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext-test.xml"})
public class DaoUserSimpleTest {

	// ************************ATTRIBUTS************************************/

	// "classpath*:META-INF/persistence-test.xml"
	// "classpath*:META-INF/context-test.xml"
	
	
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
	private IDaoUserSimple daoUserSimple;
	
	
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
	 * method testCreate() :<br/>
	 * <ul>
	 * Teste la méthode <b>create(IUserSimple pObject)</b>.<br/>
	 * </ul>
	 */
	@Commit
	@Transactional
	@Test
	public void testCreate() {
		
		// **********************************
		// AFFICHAGE DANS LE TEST ou NON
		final boolean affichage = true;
		// **********************************

		IUserSimple objet1Persistant = null;
		
		final IUserSimple objet1 
		= new UserSimple("M."
				, "Jean-Frédéric", "Borne"
				, "jean-frederic.borne@free.fr"
				, "jfbornelogin", "jfbornemdp"
				, "UTILISATEUR");
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
			
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("objet1 non persistant : " 
					+ objet1.toString());
			System.out.println(TIRETS);
			System.out.println();
			
		}
		
		if (this.daoUserSimple == null) {
			
			/* AFFICHAGE A LA CONSOLE. */
			if (AFFICHAGE_GENERAL && affichage) {
				System.out.println();
				System.out.println(TIRETS);
				System.out.println("this.daoUserSimple est NULL");
				System.out.println(TIRETS);
				System.out.println();
			}
			
			return;
		}
		
		
		try {
			
			/* *********************************************** */
			/* ********************* CREATION **************** */
			objet1Persistant = this.daoUserSimple.create(objet1);
			/* *********************************************** */
			
		}
		catch (AbstractDaoException e) {
			
			System.out.println();
			System.out.println(TIRETS);
			System.out.println("MESSAGE UTILISATEUR : " + e.getMessageUtilisateur());
			
			System.out.println("MESSAGE TECHNIQUE : " + e.getMessageTechnique());
			System.out.println(TIRETS);
			System.out.println();
			e.printStackTrace();
		}
		
		/* AFFICHAGE A LA CONSOLE. */
		if (AFFICHAGE_GENERAL && affichage) {
						
			if (objet1Persistant != null) {
				
				System.out.println();
				System.out.println(TIRETS);
				System.out.println("objet1 persistant : " 
						+ objet1Persistant.toString());
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
	


} // FIN DE LA CLASSE DaoUserSimpleTest.-------------------------------------
