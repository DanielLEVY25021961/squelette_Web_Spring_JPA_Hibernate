package levy.daniel.application.model.dao.metier.usersimple.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import levy.daniel.application.model.dao.metier.usersimple.AbstractDaoUserSimple;


/**
 * class DaoUserSimple :<br/>
 *  <ul>
 * <li>DAO <b>CONCRET</b> pour les <b>IUserSimple</b>.</li>
 * <li>
 * HERITE DU DAO ABSTRAIT AbstractDaoUserSimple.
 * </li>
 * <li>
 * Certaines méthodes (getOne(ID), ...) sont 
 * <b>compatibles SPRING DATA</b>.
 * </li>
 * <li>
 * Annoté (SPRING) <b>Repository(value="DaoUserSimple")</b> 
 * pour l'<b>injection</b> (Autowiring) dans les SERVICES par SPRING.
 * </li>
 * <br/>
 * <li>
 * <img src="../../../../../../../../../../../javadoc/images/implementation_dao_usersimple.png" 
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
 * @author dan Lévy
 * @version 1.0
 * @since 30 nov. 2017
 *
 */
@Repository(value="DaoUserSimple")
public class DaoUserSimple extends AbstractDaoUserSimple {

	// ************************ATTRIBUTS************************************/

	/**
	 * LOG : Log : 
	 * Logger pour Log4j (utilisant commons-logging).
	 */
	private static final Log LOG = LogFactory.getLog(DaoUserSimple.class);

	// *************************METHODES************************************/
	

	
	 /**
	 * method CONSTRUCTEUR DaoUserSimple() :<br/>
	 * CONSTRUCTEUR D'ARITE NULLE.<br/>
	 * <br/>
	 */
	public DaoUserSimple() {
		super();
	} // Fin de CONSTRUCTEUR D'ARITE NULLE.________________________________

	
	
} // FIN DE LA CLASSE DaoUserSimple.-----------------------------------------