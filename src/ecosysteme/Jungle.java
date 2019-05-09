package ecosysteme;

/**
 * Classe qui crée l'ecosystème de type jungle
 * @author Paul, Armand et Louise
 *
 */
public class Jungle extends Grille{

	/**
	 * Le constructeur de la classe, reutilisant le constructeur de la classe mere
	 * @param taille
	 */
	public Jungle(int taille) {
		super(taille);
	}

	/**
	 * methode qui creer un cours d'eau avec plusieurs ramifications, crees independemments sous forme de troncons
	 */
	@Override
	public void creationEau() {
		// troncon 1
		for(int x=(int)getTaille()/7;x<=(int)3*getTaille()/7;x++) {
			int y=(int)getTaille()/4;
			int[] coord = new int[2];
			coord[0]=x;
			coord[1]=y;
			Eau eau = new Eau(coord);
			getGrille().get(x).set(y-1, eau);
			getGrille().get(x).set(y, eau);
			getGrille().get(x).set(y+1, eau);
		}
		// troncon 2
		for(int x=(int)3*getTaille()/7-2;x<=(int)5*getTaille()/7;x++) {
			int y=(int)getTaille()/4+3;
			int[] coord = new int[2];
			coord[0]=x;
			coord[1]=y;
			Eau eau = new Eau(coord);
			getGrille().get(x).set(y-1, eau);
			getGrille().get(x).set(y, eau);
			getGrille().get(x).set(y+1, eau);
		}
		// troncon 3
		for(int y=(int)getTaille()/4+5;y<=(int)2*getTaille()/4;y++) {
			int x=(int)5*getTaille()/7-1;
			int[] coord = new int[2];
			coord[0]=x;
			coord[1]=y;
			Eau eau = new Eau(coord);
			getGrille().get(x-1).set(y, eau);
			getGrille().get(x).set(y, eau);
			getGrille().get(x+1).set(y, eau);
		}
		// troncon 4
		for(int x=(int)5*getTaille()/7-2;x<(int)getTaille();x++) {
			int y=(int)2*getTaille()/4+2;
			int[] coord = new int[2];
			coord[0]=x;
			coord[1]=y;
			Eau eau = new Eau(coord);
			getGrille().get(x).set(y-1, eau);
			getGrille().get(x).set(y, eau);
			getGrille().get(x).set(y+1, eau);
		}
		// troncon 5
		for(int y=(int)getTaille()/4+3;y<=(int)3*getTaille()/4;y++) {
			int x=(int)getTaille()/2;
			int[] coord = new int[2];
			coord[0]=x;
			coord[1]=y;
			Eau eau = new Eau(coord);
			getGrille().get(x-1).set(y, eau);
			getGrille().get(x).set(y, eau);
			getGrille().get(x+1).set(y, eau);
		}
	}


	/**
	 * Methode qui cree la grille avec ses composantes, l'ajout successif des sols suit un ordre bien precis
	 */
	@Override
	public void creationGrille() {
		int arbre = (int)Math.pow(getTaille(),2)*80/(21*100);
		int buisson = (int)getTaille()*50/100;
		Jungle  jungle = new Jungle(getTaille());

		jungle.creationArbre(arbre);
		jungle.creationBuisson(buisson);
		jungle.creationEau();
		jungle.afficher();
	}

	/**
	 * Méthode permettant de créer de la neige
	 */
	@Override
	public void creationNeige() {
		// TODO Auto-generated method stub
//		Methode vide car il n'y a pas de neige dans la jungle
	}

	/**
	 * Méthode permettant de créer de la montagne
	 */
	@Override
	public void creationMontagne() {
		// TODO Auto-generated method stub
		//		Methode vide car il n'y a pas de montagne dans la jungle
	}
	
}
