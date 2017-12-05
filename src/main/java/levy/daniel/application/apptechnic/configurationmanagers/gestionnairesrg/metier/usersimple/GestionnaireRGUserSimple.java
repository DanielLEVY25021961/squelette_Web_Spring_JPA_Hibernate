package levy.daniel.application.apptechnic.configurationmanagers.gestionnairesrg.metier.usersimple;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import levy.daniel.application.apptechnic.configurationmanagers.gestionnairesrg.AbstractGestionnaireRG;



/**
 * class GestionnaireRGUserSimple :<br/>
 * <ul>
 * <li>Classe Utilitaire chargée de gérer les <b>RG</b> 
 * se rapportant à un <b>UserSimple</b>.</li>
 * <li>délégué du <b>GestionnaireRG</b> qui centralise en un 
 * <b>point unique</b> toute la gestion des RG de l'application.</li>
 * <br/>
 * <li>
 * <img src="../../../../../../../../../../../javadoc/images/UserSimple_Entity.png" 
 * alt="implémentation de l'Entity UserSimple" border="1" align="center" />
 * </li>
 * <br/>
 * <li></li>
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
 * @since 5 déc. 2017
 *
 */
public class GestionnaireRGUserSimple extends AbstractGestionnaireRG {

	// ************************ATTRIBUTS************************************/

	/**
	 * RG_USERSIMPLE_PRENOM_RENSEIGNE_01 : String :<br/>
	 * "RG_USERSIMPLE_PRENOM_RENSEIGNE_01
	 *  : le prénom du UserSimple doit être renseigné".<br/>
	 */
	public static final String RG_USERSIMPLE_PRENOM_RENSEIGNE_01 
		= "RG_USERSIMPLE_PRENOM_RENSEIGNE_01"
				+ " : le prénom du UserSimple doit être renseigné";
	
	/**
	 * RG_USERSIMPLE_PRENOM_LITTERAL_02 : String :<br/>
	 * "RG_USERSIMPLE_PRENOM_LITTERAL_02
	 *  : le prénom du UserSimple ne doit contenir que des lettres".<br/>
	 */
	public static final String RG_USERSIMPLE_PRENOM_LITTERAL_02 
	= "RG_USERSIMPLE_PRENOM_LITTERAL_02"
			+ " : le prénom du UserSimple ne doit contenir que des lettres";
	
	/**
	 * RG_USERSIMPLE_PRENOM_LONGUEUR_03 : String :<br/>
	 * "RG_USERSIMPLE_PRENOM_LONGUEUR_03
	 *  : le prénom du UserSimple doit contenir entre 1 et 30 lettres".<br/>
	 */
	public static final String RG_USERSIMPLE_PRENOM_LONGUEUR_03 
	= "RG_USERSIMPLE_PRENOM_LONGUEUR_03"
			+ " : le prénom du UserSimple doit contenir entre 1 et 30 lettres";
	
	/**
	 * RG_USERSIMPLE_NOM_RENSEIGNE_04 : String :<br/>
	 * "RG_USERSIMPLE_NOM_RENSEIGNE_04
	 *  : le prénom du UserSimple doit être renseigné".<br/>
	 */
	public static final String RG_USERSIMPLE_NOM_RENSEIGNE_04 
	= "RG_USERSIMPLE_NOM_RENSEIGNE_04"
			+ " : le prénom du UserSimple doit être renseigné";
	
	/**
	 * RG_USERSIMPLE_NOM_LITTERAL_05 : String :<br/>
	 * "RG_USERSIMPLE_NOM_LITTERAL_05
	 *  : le nom du UserSimple ne doit contenir que des lettres".<br/>
	 */
	public static final String RG_USERSIMPLE_NOM_LITTERAL_05 
	= "RG_USERSIMPLE_NOM_LITTERAL_05"
			+ " : le nom du UserSimple ne doit contenir que des lettres";
	
	/**
	 * RG_USERSIMPLE_NOM_LONGUEUR_06 : String :<br/>
	 * "RG_USERSIMPLE_NOM_LONGUEUR_06
	 *  : le nom du UserSimple doit contenir entre 1 et 50 lettres".<br/>
	 */
	public static final String RG_USERSIMPLE_NOM_LONGUEUR_06 
	= "RG_USERSIMPLE_NOM_LONGUEUR_06"
			+ " : le nom du UserSimple doit contenir entre 1 et 50 lettres";
	
	/**
	 * RG_USERSIMPLE_EMAIL_MOTIF_07 : String :<br/>
	 * "RG_USERSIMPLE_EMAIL_MOTIF_07
	 *  : l'e-mail du UserSimple doit respecter le motif (Regex) d'un e-mail".<br/>
	 */
	public static final String RG_USERSIMPLE_EMAIL_MOTIF_07 
	= "RG_USERSIMPLE_EMAIL_MOTIF_07"
			+ " : l'e-mail du UserSimple doit respecter le motif (Regex) d'un e-mail";
	
	/**
	 * RG_USERSIMPLE_LOGIN_RENSEIGNE_08 : String :<br/>
	 * "RG_USERSIMPLE_LOGIN_RENSEIGNE_08
	 *  : le login du UserSimple doit être renseigné".<br/>
	 */
	public static final String RG_USERSIMPLE_LOGIN_RENSEIGNE_08 
	= "RG_USERSIMPLE_LOGIN_RENSEIGNE_08"
			+ " : le login du UserSimple doit être renseigné";
	
	/**
	 * RG_USERSIMPLE_LOGIN_LONGUEUR_09 : String :<br/>
	 * "RG_USERSIMPLE_LOGIN_LONGUEUR_09
	 *  : le login du UserSimple doit contenir entre 1 et 100 caractères".<br/>
	 */
	public static final String RG_USERSIMPLE_LOGIN_LONGUEUR_09 
	= "RG_USERSIMPLE_LOGIN_LONGUEUR_09"
			+ " : le login du UserSimple doit contenir entre 1 et 100 caractères";
	
	/**
	 * RG_USERSIMPLE_MDP_RENSEIGNE_10 : String :<br/>
	 * "RG_USERSIMPLE_MDP_RENSEIGNE_10
	 *  : le mot de passe du UserSimple doit être renseigné".<br/>
	 */
	public static final String RG_USERSIMPLE_MDP_RENSEIGNE_10 
	= "RG_USERSIMPLE_MDP_RENSEIGNE_10"
			+ " : le mot de passe du UserSimple doit être renseigné";
	
	/**
	 * RG_USERSIMPLE_MDP_LONGUEUR_11 : String :<br/>
	 * "RG_USERSIMPLE_MDP_LONGUEUR_11
	 *  : le mot de passe du UserSimple doit contenir entre 3 et 20 caractères".<br/>
	 */
	public static final String RG_USERSIMPLE_MDP_LONGUEUR_11 
	= "RG_USERSIMPLE_MDP_LONGUEUR_11"
			+ " : le mot de passe du UserSimple doit contenir entre 3 et 20 caractères";
	
	/**
	 * RG_USERSIMPLE_PROFIL_RENSEIGNE_12 : String :<br/>
	 * "RG_USERSIMPLE_PROFIL_RENSEIGNE_12
	 *  : le profil du UserSimple doit être renseigné".<br/>
	 */
	public static final String RG_USERSIMPLE_PROFIL_RENSEIGNE_12 
	= "RG_USERSIMPLE_PROFIL_RENSEIGNE_12"
			+ " : le profil du UserSimple doit être renseigné";
	
	/**
	 * RG_USERSIMPLE_PROFIL_LONGUEUR_13 : String :<br/>
	 * "RG_USERSIMPLE_PROFIL_LONGUEUR_13
	 *  : le profil du UserSimple doit contenir entre 1 et 30 lettres".<br/>
	 */
	public static final String RG_USERSIMPLE_PROFIL_LONGUEUR_13 
	= "RG_USERSIMPLE_PROFIL_LONGUEUR_13"
			+ " : le profil du UserSimple doit contenir entre 1 et 30 lettres";

	
	/* PRENOM. */
	/**
	 * validerUserSimplePrenom : Boolean :<br/>
	 * Boolean activant globalement la validation des RG 
	 * sur le prenom du userSimple.<br/>
	 */
	private static Boolean validerUserSimplePrenom;
	
	/**
	 * validerUserSimplePrenomRenseigne01 : Boolean :<br/>
	 * Boolean activant la validation de 
	 * RG_USERSIMPLE_PRENOM_RENSEIGNE_01 sur le prenom.<br/>
	 */
	private static Boolean validerUserSimplePrenomRenseigne01;
	
	/**
	 * validerUserSimplePrenomLitteral02 : Boolean :<br/>
	 * Boolean activant la validation de 
	 * RG_USERSIMPLE_PRENOM_LITTERAL_02 sur le prenom.<br/>
	 */
	private static Boolean validerUserSimplePrenomLitteral02;

	
	/**
	 * validerUserSimplePrenomLongueur03 : Boolean :<br/>
	 * Boolean activant la validation de 
	 * RG_USERSIMPLE_PRENOM_LONGUEUR_03 sur le prenom.<br/>
	 */
	private static Boolean validerUserSimplePrenomLongueur03;
	

	/* NOM. */
	/**
	 * validerUserSimpleNom : Boolean :<br/>
	 * Boolean activant globalement la validation des RG 
	 * sur le nom du userSimple.<br/>
	 */
	private static Boolean validerUserSimpleNom;

	
	/**
	 * validerUserSimpleNomRenseigne04 : Boolean :<br/>
	 * Boolean activant la validation de 
	 * RG_USERSIMPLE_NOM_RENSEIGNE_04 sur le nom.<br/>
	 */
	private static Boolean validerUserSimpleNomRenseigne04;

	
	/**
	 * validerUserSimpleNomLitteral05 : Boolean :<br/>
	 * Boolean activant la validation de 
	 * RG_USERSIMPLE_NOM_LITTERAL_05 sur le nom.<br/>
	 */
	private static Boolean validerUserSimpleNomLitteral05;

	
	/**
	 * validerUserSimpleNomLongueur06 : Boolean :<br/>
	 * Boolean activant la validation de 
	 * RG_USERSIMPLE_NOM_LONGUEUR_06 sur le nom.<br/>
	 */
	private static Boolean validerUserSimpleNomLongueur06;
	

	/* EMAIL. */
	/**
	 * validerUserSimpleEmail : Boolean :<br/>
	 * Boolean activant globalement la validation des RG 
	 * sur l'email du userSimple.<br/>
	 */
	private static Boolean validerUserSimpleEmail;
	
	
	/**
	 * validerUserSimpleEmailMotif07 : Boolean :<br/>
	 * Boolean activant la validation de 
	 * RG_USERSIMPLE_EMAIL_MOTIF_07 sur l'email.<br/>
	 */
	private static Boolean validerUserSimpleEmailMotif07;
	

	/* LOGIN. */
	/**
	 * validerUserSimpleLogin : Boolean :<br/>
	 * Boolean activant globalement la validation des RG 
	 * sur le login du userSimple.<br/>
	 */
	private static Boolean validerUserSimpleLogin;

	
	/**
	 * validerUserSimpleLoginRenseigne08 : Boolean :<br/>
	 * Boolean activant la validation de 
	 * RG_USERSIMPLE_LOGIN_RENSEIGNE_08 sur le Login.<br/>
	 */
	private static Boolean validerUserSimpleLoginRenseigne08;

	
	/**
	 * validerUserSimpleLoginLongueur09 : Boolean :<br/>
	 * Boolean activant la validation de 
	 * RG_USERSIMPLE_LOGIN_LONGUEUR_09 sur le Login.<br/>
	 */
	private static Boolean validerUserSimpleLoginLongueur09;

	
	/* MDP. */
	/**
	 * validerUserSimpleMdp : Boolean :<br/>
	 * Boolean activant globalement la validation des RG 
	 * sur le mdp du userSimple.<br/>
	 */
	private static Boolean validerUserSimpleMdp;

	
	/**
	 * validerUserSimpleMdpRenseigne10 : Boolean :<br/>
	 * Boolean activant la validation de 
	 * RG_USERSIMPLE_MDP_RENSEIGNE_10 sur le mdp.<br/>
	 */
	private static Boolean validerUserSimpleMdpRenseigne10;

	
	/**
	 * validerUserSimpleMdpLongueur11 : Boolean :<br/>
	 * Boolean activant la validation de 
	 * RG_USERSIMPLE_MDP_LONGUEUR_11 sur le mdp.<br/>
	 */
	private static Boolean validerUserSimpleMdpLongueur11;

	
	/* PROFIL. */
	/**
	 * validerUserSimpleProfil : Boolean :<br/>
	 * Boolean activant globalement la validation des RG 
	 * sur le profil du userSimple.<br/>
	 */
	private static Boolean validerUserSimpleProfil;

	
	/**
	 * validerUserSimpleProfilRenseigne12 : Boolean :<br/>
	 * Boolean activant la validation de 
	 * RG_USERSIMPLE_PROFIL_RENSEIGNE_12 sur le profil.<br/>
	 */
	private static Boolean validerUserSimpleProfilRenseigne12;

	
	/**
	 * validerUserSimpleProfilLongueur13 : Boolean :<br/>
	 * Boolean activant la validation de 
	 * RG_USERSIMPLE_PROFIL_LONGUEUR_13 sur le profil.<br/>
	 */
	private static Boolean validerUserSimpleProfilLongueur13;
	
	
	
	/**
	 * LOG : Log : 
	 * Logger pour Log4j (utilisant commons-logging).
	 */
	private static final Log LOG 
		= LogFactory.getLog(GestionnaireRGUserSimple.class);

	
	// *************************METHODES************************************/
	
	
	 /**
	 * method CONSTRUCTEUR GestionnaireRGUserSimple() :<br/>
	 * CONSTRUCTEUR D'ARITE NULLE.<br/>
	 * <br/>
	 */
	public GestionnaireRGUserSimple() {
		super();
	} // Fin de CONSTRUCTEUR D'ARITE NULLE.________________________________
	
	
	
	
} // FIN DE LA CLASSE GestionnaireRGUserSimple.------------------------------
