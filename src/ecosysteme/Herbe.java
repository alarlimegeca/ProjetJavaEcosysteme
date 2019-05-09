package ecosysteme;

import Gestion.Gestionnaire;


/** 
 * Cette classe gère les cases de type herbe
 * @author Paul,Armand et Louise
 *
 */
public class Herbe extends Case{
	
	/**
	 * stock de nourriture que contient l'herbe
	 */
	private int nourriture;

	/**
	 * Constructeur
	 * @param position : position de la case
	 */
	public Herbe(int[] position) {
		super(0, true, false, position);
		this.nourriture=10;
	}
	
	/**
	 * Constructeur
	 * @param typeOccupation : le type d'occupation (ici Arbre)
	 * @param estvide : Y a t'il un animal sur la case ?
	 * @param cadavre : Y a t'il un cadavre sur la case
	 * @param position : position de la case
	 */
	public Herbe(int typeOccupation, boolean estvide, boolean cadavre, int[] position) {
		super(0, estvide, cadavre, position);
		this.nourriture=10;
	}


	/**
	 * Getter
	 * @return
	 */
	public int getNourriture() {
		return nourriture;
	}

	/**
	 * Setter
	 * @param nourriture
	 */
	public void setNourriture(int nourriture) {
		this.nourriture = nourriture;
	}



	/**
	 * methode qui recharge le stock de nourriture que contient le buisson si il est vide
	 */
	public void recuperation() {

		if (nourriture==0) {

			int tourDeRecup = Gestionnaire.getTour();

			int recuperation=0;

			while(recuperation <= 3) {
				recuperation = Gestionnaire.getTour() - tourDeRecup;
				if(recuperation==3) {
					this.nourriture=10;
				}
			}
		}
	}
	
	/**
	 * getter
	 */
	public int getTypeOccupation() {
		return 0;
	}
	
}
