package levy.daniel.application.model.metier.usersimple.impl;



/**
 * ENUMERATION ProfilsSimplesEnum :<br/>
 * <ul>
 * <li>Enumération permettant de limiter les profils 
 * (ADMINISTRATEUR, UTILISATEUR, ...) d'un UserSimple.</li>
 * </ul>
 * <br/>
 *
 * - Exemple d'utilisation :<br/>
 * <code>// Récupère l'instance "ADMINISTRATEUR" 
 * dans l'Enumération.</code><br/>
 * <code>String PROFIL_ADMIN = 
 * ProfilsSimplesEnum.ADMINISTRATEUR.toString();</code><br/>
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
 * @since 10 déc. 2017
 *
 */
public enum ProfilsSimplesEnum {

	
	/**
	 * ADMINISTRATEUR : ProfilsSimplesEnum :<br/>
	 * Profil qui peut tout voir dans l'application.<br/>
	 */
	ADMINISTRATEUR

	
	, /**
	 * GESTIONNAIRE_DONNEES : ProfilsSimplesEnum :<br/>
	 * Profil qui peut téléverser des données dans l'application 
	 * mais ne peut voir que ce qui concerne sa zone géographique.<br/>
	 */
	GESTIONNAIRE_DONNEES
	
	
	, /**
	 * UTILISATEUR : ProfilsSimplesEnum :<br/>
	 * Profil qui ne peut que consulter les pages 
	 * <b>publiques</b> de l'application.<br/>
	 */
	UTILISATEUR;
	

} // FIN DE ENUMERATION ProfilsSimplesEnum.----------------------------------
