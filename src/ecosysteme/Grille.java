package ecosysteme;
//maj le 25 mai
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;


public abstract class Grille {

	/**
	 * attribut qui gere la taille de notre grille carree
	 */
	private int taille;

	/**
	 * attribut qui gere la grille, sous forme de matrice
	 */
	private static ArrayList<ArrayList<Case>> grille;


	/**
	 * Les getters
	 * @return taille, grille
	 */

	public int getTaille() {
		return taille;
	}
/* ancienne version
	public int[][] getGrille() {
		return grille;
	}
*/
	public ArrayList<ArrayList<Case>> getGrille() {
		return grille;
	}
	/**
	 * Une methode (ou getter ??) qui recupere le contenu de la grille a une position (x,y)
	 * Cette m�thode doit r�cup�rer la case pr�sente � la position (x, y normalement - Paul
	 * @param x
	 * @param y
	 * @return
	 */
	public static Case getCase(int x, int y) {
		return grille.get(x).get(y);
	}

	
	/**
	 * constructeur de la grille sous forme de matrice
	 * @param taille
	 */
	//nouvelle version
	public Grille(int taille) {
		this.taille=taille;
		this.grille=new ArrayList<ArrayList<Case>>();
		for(int i=0;i<this.taille;i++) {
			ArrayList<Case> colonne= new ArrayList<Case>();
			for ( int j=0;j<this.taille;j++) {
				int[] coord = new int[2];
				coord[0]=i;
				coord[1]=j;
				Herbe herbe = new Herbe(coord);
				colonne.add(herbe);
			}
			grille.add(colonne);
		}
	}

	/**
	 * une methode qui permet de modifier une case de la grille
	 */
	/*
	public void modifier(int x, int y, int z){
		this.grille[x][y]=z;
		
	}
	 */

	/**
	 * Une methode qui cree les buissons, applicable a toutes les classes filles, c'est une g�n�ration dans l'espace al�atoirement d'une quantitee de buisson definie en parametre. Lors de la creation de la grille un buisson ne peut etre place ni sur un autre buisson, ni sur aucun autre sol excepte l'herbe et le sable.
	 * @param buisson
	 */
	//nouvelle version
	public void creationBuisson(int buisson) {
		int i=0;
		while(i<buisson) {
			double a=Math.random()*this.taille;
			double b=Math.random()*this.taille;
			int x=(int)a;
			int y=(int)b;
			if(grille.get(x).get(y).getTypeOccupation()==1||
			   grille.get(x).get(y).getTypeOccupation()==2||
			   grille.get(x).get(y).getTypeOccupation()==3||
			   grille.get(x).get(y).getTypeOccupation()==5||
			   grille.get(x).get(y).getTypeOccupation()==7) {
				continue;
			}
	
			int[] coord = new int[2];
			coord[0]=x;
			coord[1]=y;
			Buisson buisson1 = new Buisson(coord);
			grille.get(x).set(y,buisson1);
			
			i=i+1;
		}
	}

	/**
	 * Une methode qui cree les arbres, applicable a toutes les classes filles, c'est une g�n�ration dans l'espace al�atoirement d'une quantitee d'arbre definie en parametre. Un arbres est grand et donc occupe plusieurs cases. Lors de la creation de la grille un arbre ne peut etre place sur aucun autre sol excepte l'herbe, le sable et les buissons, il ne peut superposer que legerment un autre arbre.
	 * @param arbre
	 */
	public void creationArbre(int arbre) {
		int i=0;
		while(i<arbre) {
			double a=Math.random()*this.taille;
			double b=Math.random()*this.taille;
			int x=(int)a;
			int y=(int)b;
			if((x-2)<0 || (x+2)>(this.taille-1) || (y-2)<0 || (y+2)>(this.taille-1)) {
				continue;
			}

			if( grille.get(x).get(y).getTypeOccupation()==3||
			grille.get(x-1).get(y-1).getTypeOccupation()==3||
			grille.get(x-1).get(y).getTypeOccupation()==3||
			grille.get(x-1).get(y+1).getTypeOccupation()==3||
			grille.get(x).get(y-1).getTypeOccupation()==3||
			grille.get(x).get(y+1).getTypeOccupation()==3||
			grille.get(x+1).get(y-1).getTypeOccupation()==3||
			grille.get(x+1).get(y).getTypeOccupation()==3||
			grille.get(x+1).get(y+1).getTypeOccupation()==3||
			grille.get(x).get(y).getTypeOccupation()==7||
			grille.get(x).get(y).getTypeOccupation()==5||
			grille.get(x).get(y).getTypeOccupation()==2 )  {
				continue;
			}

			int[] coord = new int[2];
			coord[0]=x;
			coord[1]=y;
			Arbre arbre1 = new Arbre(coord);
			grille.get(x).set(y, arbre1);
			grille.get(x-1).set(y-1, arbre1);
			grille.get(x-1).set(y, arbre1);
			grille.get(x-1).set(y+1, arbre1);
			grille.get(x).set(y-1, arbre1);
			grille.get(x).set(y+1, arbre1);
			grille.get(x+1).set(y-1, arbre1);
			grille.get(x+1).set(y, arbre1);
			grille.get(x+1).set(y+1, arbre1);
			grille.get(x-2).set(y-1, arbre1);
			grille.get(x-2).set(y, arbre1);
			grille.get(x-2).set(y+1, arbre1);
			grille.get(x-1).set(y-2, arbre1);
			grille.get(x).set(y-2, arbre1);
			grille.get(x+1).set(y-2, arbre1);
			grille.get(x+2).set(y-1, arbre1);
			grille.get(x+2).set(y, arbre1);
			grille.get(x+2).set(y+1, arbre1);
			grille.get(x-1).set(y+2, arbre1);
			grille.get(x).set(y+2, arbre1);
			grille.get(x+1).set(y+2, arbre1);
			
			i=i+1;
		}
	}
	
	
	/**
	 * Une methode qui permet de cree du sable selon deux regles, l'ajout de sable ne peut se faire que sur de l'herbe et doit etre distant
	 * de deux cases d'un arbre
	 */
	public void creationSable(){
		for(int x=2;x<=this.taille-3;x++) {
		for(int y=2;y<=this.taille-3;y++) {
		if( grille.get(x).get(y).getTypeOccupation()==0 &&
				grille.get(x+2).get(y).getTypeOccupation()!=3 &&
				grille.get(x+2).get(y+2).getTypeOccupation()!=3 &&
				grille.get(x).get(y+2).getTypeOccupation()!=3 &&
				grille.get(x-2).get(y+2).getTypeOccupation()!=3 &&
				grille.get(x-2).get(y).getTypeOccupation()!=3 &&
				grille.get(x-2).get(y-2).getTypeOccupation()!=3 &&
				grille.get(x).get(y-2).getTypeOccupation()!=3 &&
				grille.get(x+2).get(y-2).getTypeOccupation()!=3 ) {
			
			int[] coord = new int[2];
			coord[0]=x;
			coord[1]=y;
			Sable sable = new Sable(coord);
			grille.get(x).set(y, sable);
		}
		}
		}
	}
	/**
	 * methodes abstraite redefinie dans les classes filles
	 */
	public abstract void creationNeige();
	public abstract void creationEau();
	public abstract void creationMontagne();


	  
	/**
	 * Une Methode permettant de creer la grille a partir des methodes precedentes, un ordre particulier de ces methode sera choisi (......)
	 */
	public  abstract void creationGrille();
	  
	/**
	 * Une methode qui afficher la grille dans la console, ce n'est pas l'interface graphique.
	 */
	
	//nouvelle version
	public void afficher() {
		for(int i=0;i<this.taille;i++) {
			for (int j=0;j<this.taille;j++) {
				System.out.print(grille.get(i).get(j).getTypeOccupation()+"");
			}
			System.out.println(" ");
		}
	}
}
