/******************************************************
Cours : LOG121
Session : A2014
Groupe : 01
Projet : Laboratoire #1
�tudiant : Mario Morra
Code(s) perm. : MORM07039202 (AM54710)
Professeur : Ghizlane El boussaidi
Charg�s de labo : Alvine Boaye Belle et Michel Gagnon
Nom du fichier : ApplicationFormes.java
Date cr�� : 2014-09-20
Date dern. modif. 2014-09-20
*******************************************************
Historique des modifications
*******************************************************
2014-09-20 Version initiale
*******************************************************/

package affichage;

import ca.etsmtl.log.util.IDLogger;
import formes.TableauFormes;
import util.CommBase;

public class ApplicationFormes {
	
	private CommBase comm;
	private FenetrePrincipale fenetre;
	private static IDLogger logger;
	protected static ServerInput input;

	public static void main(String[] args) {
		input = new ServerInput();	
		ApplicationFormes.setLogger(IDLogger.getInstance());
	}
	
	public ApplicationFormes(){
		comm = new CommBase();		
		String hostname = input.hostname;
		int port = input.server;
		comm.connect(host, port);	
		fenetre = new FenetrePrincipale(comm);
		comm.setPropertyChangeListener(fenetre);
	}

	public static IDLogger getLogger() {
		return logger;
	}

	public static void setLogger(IDLogger logger) {
		ApplicationFormes.logger = logger;
	}
}
