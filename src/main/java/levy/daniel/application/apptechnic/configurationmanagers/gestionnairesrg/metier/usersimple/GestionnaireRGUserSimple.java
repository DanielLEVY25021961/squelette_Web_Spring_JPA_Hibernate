package levy.daniel.application.apptechnic.configurationmanagers.gestionnairesrg.metier.usersimple;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import levy.daniel.application.ConfigurationApplicationManager;
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
	 * RG_USERSIMPLE_CIVILITE_NOMENCLATURE_01 : String :<br/>
	 * "RG_USERSIMPLE_CIVILITE_NOMENCLATURE_01 : 
	 * la civilite (M., Mme, ...) du UserSimple doit respecter 
	 * un ensemble fini de valeurs (nomenclature)".<br/>
	 */
	public static final String RG_USERSIMPLE_CIVILITE_NOMENCLATURE_01 
	= "RG_USERSIMPLE_CIVILITE_NOMENCLATURE_01"
			+ " : la civilite (M., Mme, ...) du UserSimple "
			+ "doit respecter un ensemble fini de valeurs (nomenclature)";


	/**
	 * RG_USERSIMPLE_PRENOM_RENSEIGNE_02 : String :<br/>
	 * "RG_USERSIMPLE_PRENOM_RENSEIGNE_02 : 
	 * le prénom du UserSimple doit être renseigné (obligatoire)".<br/>
	 */
	public static final String RG_USERSIMPLE_PRENOM_RENSEIGNE_02 
		= "RG_USERSIMPLE_PRENOM_RENSEIGNE_02"
			+ " : le prénom du UserSimple "
				+ "doit être renseigné (obligatoire)";

	
	/**
	 * RG_USERSIMPLE_PRENOM_LITTERAL_03 : String :<br/>
	 * "RG_USERSIMPLE_PRENOM_LITTERAL_03 : 
	 * le prénom du UserSimple 
	 * ne doit contenir que des lettres ou des 
	 * caractères spéciaux '-', '_', ... (aucun chiffre)".<br/>
	 */
	public static final String RG_USERSIMPLE_PRENOM_LITTERAL_03 
		= "RG_USERSIMPLE_PRENOM_LITTERAL_03"
				+ " : le prénom du UserSimple "
				+ "ne doit contenir que des "
				+ "lettres ou des caractères spéciaux '-', '_', ... "
				+ "(aucun chiffre)";


	/**
	 * RG_USERSIMPLE_PRENOM_LONGUEUR_04 : String :<br/>
	 * "RG_USERSIMPLE_PRENOM_LONGUEUR_04 : 
	 * le prénom du UserSimple doit contenir 
	 * entre [1] et [30] lettres".<br/>
	 */
	public static final String RG_USERSIMPLE_PRENOM_LONGUEUR_04 
		= "RG_USERSIMPLE_PRENOM_LONGUEUR_04"
				+ " : le prénom du UserSimple "
				+ "doit contenir entre [1] et [30] lettres";


	/**
	 * RG_USERSIMPLE_NOM_RENSEIGNE_05 : String :<br/>
	 * "RG_USERSIMPLE_NOM_RENSEIGNE_05
	 *  : le nom du UserSimple doit être renseigné (obligatoire)".<br/>
	 */
	public static final String RG_USERSIMPLE_NOM_RENSEIGNE_05 
		= "RG_USERSIMPLE_NOM_RENSEIGNE_05"
				+ " : le nom du UserSimple "
				+ "doit être renseigné (obligatoire)";


	/**
	 * RG_USERSIMPLE_NOM_LITTERAL_06 : String :<br/>
	 * "RG_USERSIMPLE_NOM_LITTERAL_06
	 *  : le nom du UserSimple 
	 *  ne doit contenir que des lettres ou des caractères spéciaux 
	 *  '-', '_', ... (aucun chiffre)".<br/>
	 */
	public static final String RG_USERSIMPLE_NOM_LITTERAL_06 
	= "RG_USERSIMPLE_NOM_LITTERAL_06"
			+ " : le nom du UserSimple "
			+ "ne doit contenir que des lettres ou des "
			+ "caractères spéciaux '-', '_', ... (aucun chiffre)";

	
	/**
	 * RG_USERSIMPLE_NOM_LONGUEUR_07 : String :<br/>
	 * "RG_USERSIMPLE_NOM_LONGUEUR_07
	 *  : le nom du UserSimple doit contenir entre 
	 *  [1] et [50] lettres".<br/>
	 */
	public static final String RG_USERSIMPLE_NOM_LONGUEUR_07 
		= "RG_USERSIMPLE_NOM_LONGUEUR_07"
				+ " : le nom du UserSimple "
				+ "doit contenir "
				+ "entre [1] et [50] lettres";
	
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
	
	
	
	/**
	 * {@inheritDoc}
	 * <ul>
	 * Pour le <b>GestionnaireRGUserSimple</b> qui gère 
	 * les RG du <b>UserSimple</b> : <br/>
	 * <li>Chemin absolu vers <b>rg-usersimple.properties</b> : </li>
	 * <li><b>H:.../ressources_externes/rg/metier/</b></li>
	 * </ul>
	 */
	@Override
	protected String fournirCheminRessourceExterneRG() {
		
		String cheminRessourcesExternes = null;
		String cheminRessourcesExternesRG = null;
		
		try {
			
			/* Récupère le chemin vers les ressources externes
			 *  auprès du ConfigurationApplicationManager. */
			cheminRessourcesExternes 
				= ConfigurationApplicationManager
					.getPathRessourcesExternes();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		/* constitue le chemin vers rg-usersimple.properties 
		 * à partir du chemin des ressources_externes. */
		cheminRessourcesExternesRG 
			= cheminRessourcesExternes + "/rg/metier/";
		
		return cheminRessourcesExternesRG;
					
	} // Fin de fournirCheminRessourceExterneRG()._________________________
	
	
	
	/**
	 * {@inheritDoc}
	 * <ul>
	 * Pour le <b>GestionnaireRGUserSimple</b> qui gère 
	 * les RG du <b>UserSimple</b> : <br/>
	 * <li><b>"rg-usersimple"</b>.</li>
	 * </ul>
	 */
	@Override
	protected String fournirNomBasePropertiesRG() {
		return "rg-usersimple";
	} // Fin de fournirNomBasePropertiesRG().______________________________


	

	
	/* PRENOM. */	
	/**
	 * method fournirCleValiderUserSimplePrenom() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimplePrenom</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant globalement la validation des RG 
	 * sur le prenom du userSimple.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Prenom".<br/>
	 */
	private String fournirCleValiderUserSimplePrenom() {
		return "valider.UserSimple.Prenom";
	} // Fin de fournirCleValiderUserSimplePrenom()._______________________
	

	
	/**
	 * method fournirCleValiderUserSimplePrenomRenseigne01() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimplePrenomRenseigne01</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant la validation de 
	 * RG_USERSIMPLE_PRENOM_RENSEIGNE_01 sur le prenom.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Prenom.Renseigne.01".<br/>
	 */
	private String fournirCleValiderUserSimplePrenomRenseigne01() {
		return "valider.UserSimple.Prenom.Renseigne.01";
	} // Fin de fournirCleValiderUserSimplePrenomRenseigne01().____________
	

	
	/**
	 * method fournirCleValiderUserSimplePrenomLitteral02() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimplePrenomLitteral02</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant la validation de 
	 * RG_USERSIMPLE_PRENOM_LITTERAL_02 sur le prenom.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Prenom.Litteral.02".<br/>
	 */
	private String fournirCleValiderUserSimplePrenomLitteral02() {
		return "valider.UserSimple.Prenom.Litteral.02";
	} // Fin de fournirCleValiderUserSimplePrenomLitteral02()._____________

	
	
	/**
	 * method fournirCleValiderUserSimplePrenomLongueur03() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimplePrenomLongueur03</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant la validation de 
	 * RG_USERSIMPLE_PRENOM_LONGUEUR_03 sur le prenom.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Prenom.Longueur.03".<br/>
	 */
	private String fournirCleValiderUserSimplePrenomLongueur03() {
		return "valider.UserSimple.Prenom.Longueur.03";
	} // Fin de fournirCleValiderUserSimplePrenomLongueur03()._____________
	
	
	
	/* NOM. */
	/**
	 * method fournirCleValiderUserSimpleNom() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleNom</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant globalement la validation des RG 
	 * sur le nom du userSimple.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Nom".<br/>
	 */
	private String fournirCleValiderUserSimpleNom() {
		return "valider.UserSimple.Nom";
	} // Fin de fournirCleValiderUserSimpleNom().__________________________
	
	
	
	/**
	 * method fournirCleValiderUserSimpleNomRenseigne04() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleNomRenseigne04</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant la validation de 
	 * RG_USERSIMPLE_NOM_RENSEIGNE_04 sur le nom.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Nom.Renseigne.04".<br/>
	 */
	private String fournirCleValiderUserSimpleNomRenseigne04() {
		return "valider.UserSimple.Nom.Renseigne.04";
	} // Fin de fournirCleValiderUserSimpleNomRenseigne04()._______________
	
	
	
	/**
	 * method fournirCleValiderUserSimpleNomLitteral05() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleNomLitteral05</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant la validation de 
	 * RG_USERSIMPLE_NOM_LITTERAL_05 sur le nom.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Nom.Litteral.05".<br/>
	 */
	private String fournirCleValiderUserSimpleNomLitteral05() {
		return "valider.UserSimple.Nom.Litteral.05";
	} // Fin de fournirCleValiderUserSimpleNomLitteral05().________________
	
	
	
	/**
	 * method fournirCleValiderUserSimpleNomLongueur06() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleNomLongueur06</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant la validation de 
	 * RG_USERSIMPLE_NOM_LONGUEUR_06 sur le nom.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Nom.Longueur.06".<br/>
	 */
	private String fournirCleValiderUserSimpleNomLongueur06() {
		return "valider.UserSimple.Nom.Longueur.06";
	} // Fin de fournirCleValiderUserSimpleNomLongueur06().________________
	

	
	/* EMAIL. */
	/**
	 * method fournirCleValiderUserSimpleEmail() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleEmail</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant globalement la validation des RG 
	 * sur l'email du userSimple.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Email".<br/>
	 */
	private String fournirCleValiderUserSimpleEmail() {
		return "valider.UserSimple.Email";
	} // Fin de fournirCleValiderUserSimpleEmail().________________________
	
	
	
	/**
	 * method fournirCleValiderUserSimpleEmailMotif07() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleEmailMotif07</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant la validation de 
	 * RG_USERSIMPLE_EMAIL_MOTIF_07 sur l'email.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Email.Motif.07".<br/>
	 */
	private String fournirCleValiderUserSimpleEmailMotif07() {
		return "valider.UserSimple.Email.Motif.07";
	} // Fin de fournirCleValiderUserSimpleEmailMotif07()._________________
	

	
	/* LOGIN. */	
	/**
	 * method fournirCleValiderUserSimpleLogin() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleLogin</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant globalement la validation des RG 
	 * sur le login du userSimple.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Login".<br/>
	 */
	private String fournirCleValiderUserSimpleLogin() {
		return "valider.UserSimple.Login";
	} // Fin de fournirCleValiderUserSimpleLogin().________________________
	
	
	
	/**
	 * method fournirCleValiderUserSimpleLoginRenseigne08() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleLoginRenseigne08</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant la validation de 
	 * RG_USERSIMPLE_LOGIN_RENSEIGNE_08 sur le Login.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Login.Renseigne.08".<br/>
	 */
	private String fournirCleValiderUserSimpleLoginRenseigne08() {
		return "valider.UserSimple.Login.Renseigne.08";
	} // Fin de fournirCleValiderUserSimpleLoginRenseigne08()._____________
	

	
	/**
	 * method fournirCleValiderUserSimpleLoginLongueur09() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleLoginLongueur09</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant la validation de 
	 * RG_USERSIMPLE_LOGIN_LONGUEUR_09 sur le Login.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Login.Longueur.09".<br/>
	 */
	private String fournirCleValiderUserSimpleLoginLongueur09() {
		return "valider.UserSimple.Login.Longueur.09";
	} // Fin de fournirCleValiderUserSimpleLoginLongueur09().______________
	

	
	/* MDP. */
	/**
	 * method fournirCleValiderUserSimpleMdp() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleMdp</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant globalement la validation des RG 
	 * sur le mdp du userSimple.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Mdp".<br/>
	 */
	private String fournirCleValiderUserSimpleMdp() {
		return "valider.UserSimple.Mdp";
	} // Fin de fournirCleValiderUserSimpleMdp().__________________________
	
	
	
	/**
	 * method fournirCleValiderUserSimpleMdpRenseigne10() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleMdpRenseigne10</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant la validation de 
	 * RG_USERSIMPLE_MDP_RENSEIGNE_10 sur le mdp.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Mdp.Renseigne.10".<br/>
	 */
	private String fournirCleValiderUserSimpleMdpRenseigne10() {
		return "valider.UserSimple.Mdp.Renseigne.10";
	} // Fin de fournirCleValiderUserSimpleMdpRenseigne10()._______________
	
	
	
	/**
	 * method fournirCleValiderUserSimpleMdpLongueur11() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleMdpLongueur11</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant la validation de 
	 * RG_USERSIMPLE_MDP_LONGUEUR_11 sur le mdp.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Mdp.Longueur.11".<br/>
	 */
	private String fournirCleValiderUserSimpleMdpLongueur11() {
		return "valider.UserSimple.Mdp.Longueur.11";
	} // Fin de fournirCleValiderUserSimpleMdpLongueur11().________________
	

	
	/* PROFIL. */
	/**
	 * method fournirCleValiderUserSimpleProfil() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleProfil</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant globalement la validation des RG 
	 * sur le profil du userSimple.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Profil".<br/>
	 */
	private String fournirCleValiderUserSimpleProfil() {
		return "valider.UserSimple.Profil";
	} // Fin de fournirCleValiderUserSimpleProfil()._______________________
	
	
	
	/**
	 * method fournirCleValiderUserSimpleProfilRenseigne12() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleProfilRenseigne12</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant la validation de 
	 * RG_USERSIMPLE_PROFIL_RENSEIGNE_12 sur le profil.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Profil.Renseigne.12".<br/>
	 */
	private String fournirCleValiderUserSimpleProfilRenseigne12() {
		return "valider.UserSimple.Profil.Renseigne.12";
	} // Fin de fournirCleValiderUserSimpleProfilRenseigne12().____________

	
	
	/**
	 * method fournirCleValiderUserSimpleProfilLongueur13() :<br/>
	 * <ul>
	 * <li>retourne la <b>clé</b> du Boolean 
	 * <b>validerUserSimpleProfilLongueur13</b> 
	 * dans <b>rg-usersimple.properties</b>.</li>
	 * <li>Boolean activant la validation de 
	 * RG_USERSIMPLE_PROFIL_LONGUEUR_13 sur le profil.</li>
	 * </ul>
	 *
	 * @return : String : "valider.UserSimple.Profil.Longueur.13".<br/>
	 */
	private String fournirCleValiderUserSimpleProfilLongueur13() {
		return "valider.UserSimple.Profil.Longueur.13";
	} // Fin de fournirCleValiderUserSimpleProfilLongueur13()._____________



	
	/**
	 * method getValiderUserSimplePrenom() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimplePrenom : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimplePrenom() {
	
		return validerUserSimplePrenom;
	}



	
	/**
	 * method getValiderUserSimplePrenomRenseigne01() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimplePrenomRenseigne01 : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimplePrenomRenseigne01() {
	
		return validerUserSimplePrenomRenseigne01;
	}



	
	/**
	 * method getValiderUserSimplePrenomLitteral02() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimplePrenomLitteral02 : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimplePrenomLitteral02() {
	
		return validerUserSimplePrenomLitteral02;
	}



	
	/**
	 * method getValiderUserSimplePrenomLongueur03() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimplePrenomLongueur03 : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimplePrenomLongueur03() {
	
		return validerUserSimplePrenomLongueur03;
	}



	
	/**
	 * method getValiderUserSimpleNom() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleNom : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleNom() {
	
		return validerUserSimpleNom;
	}



	
	/**
	 * method getValiderUserSimpleNomRenseigne04() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleNomRenseigne04 : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleNomRenseigne04() {
	
		return validerUserSimpleNomRenseigne04;
	}



	
	/**
	 * method getValiderUserSimpleNomLitteral05() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleNomLitteral05 : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleNomLitteral05() {
	
		return validerUserSimpleNomLitteral05;
	}



	
	/**
	 * method getValiderUserSimpleNomLongueur06() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleNomLongueur06 : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleNomLongueur06() {
	
		return validerUserSimpleNomLongueur06;
	}



	
	/**
	 * method getValiderUserSimpleEmail() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleEmail : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleEmail() {
	
		return validerUserSimpleEmail;
	}



	
	/**
	 * method getValiderUserSimpleEmailMotif07() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleEmailMotif07 : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleEmailMotif07() {
	
		return validerUserSimpleEmailMotif07;
	}



	
	/**
	 * method getValiderUserSimpleLogin() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleLogin : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleLogin() {
	
		return validerUserSimpleLogin;
	}



	
	/**
	 * method getValiderUserSimpleLoginRenseigne08() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleLoginRenseigne08 : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleLoginRenseigne08() {
	
		return validerUserSimpleLoginRenseigne08;
	}



	
	/**
	 * method getValiderUserSimpleLoginLongueur09() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleLoginLongueur09 : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleLoginLongueur09() {
	
		return validerUserSimpleLoginLongueur09;
	}



	
	/**
	 * method getValiderUserSimpleMdp() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleMdp : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleMdp() {
	
		return validerUserSimpleMdp;
	}



	
	/**
	 * method getValiderUserSimpleMdpRenseigne10() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleMdpRenseigne10 : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleMdpRenseigne10() {
	
		return validerUserSimpleMdpRenseigne10;
	}



	
	/**
	 * method getValiderUserSimpleMdpLongueur11() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleMdpLongueur11 : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleMdpLongueur11() {
	
		return validerUserSimpleMdpLongueur11;
	}



	
	/**
	 * method getValiderUserSimpleProfil() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleProfil : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleProfil() {
	
		return validerUserSimpleProfil;
	}



	
	/**
	 * method getValiderUserSimpleProfilRenseigne12() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleProfilRenseigne12 : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleProfilRenseigne12() {
	
		return validerUserSimpleProfilRenseigne12;
	}



	
	/**
	 * method getValiderUserSimpleProfilLongueur13() :<br/>
	 * Getter .<br/>
	 * <br/>
	 *
	 * @return validerUserSimpleProfilLongueur13 : Boolean.<br/>
	 */
	public static final Boolean getValiderUserSimpleProfilLongueur13() {
	
		return validerUserSimpleProfilLongueur13;
	}
	
	
	
	
	
} // FIN DE LA CLASSE GestionnaireRGUserSimple.------------------------------
