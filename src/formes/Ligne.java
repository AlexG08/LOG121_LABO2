/******************************************************
Cours : LOG121
Session : A2014
Groupe : 01
Projet : Laboratoire #1
�tudiant : Mario Morra
Code(s) perm. : MORM07039202 (AM54710)
Professeur : Ghizlane El boussaidi
Charg�s de labo : Alvine Boaye Belle et Michel Gagnon
Nom du fichier : Ligne.java
Date cr�� : 2014-09-20
Date dern. modif. 2014-09-20
*******************************************************
Historique des modifications
*******************************************************
2014-09-20 Version initiale
*******************************************************/

package formes;

import java.awt.Color;
import java.awt.Graphics;

public class Ligne extends Forme {
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Ligne(int nseq, int x1, int y1, int x2, int y2){
		super.nseq = nseq;
		super.couleur = Color.BLACK;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public int obtenirX(){
		return x1;
	}
	
	public int obtenirY(){
		return y1;
	}
	
	public int obtenirX2(){
		return x2;
	}
	
	public int obtenirY2(){
		return y2;
	}

	@Override
	public int obtenirHauteur() {	
		return y2-y1;
	}

	@Override
	public int obtenirLargeur() {
		return x2-x1;
	}

	@Override
	public void dessinerForme(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dessinerForme(Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dessinerCadre(Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		
	};
	
}
