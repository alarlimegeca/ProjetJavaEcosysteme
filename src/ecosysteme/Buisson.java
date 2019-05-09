package ecosysteme;

import Gestion.Gestionnaire;

/** 
 * Cette classe gère les cases de type buisson
 * @author Paul,Armand et Louise
 *
 */
public class Buisson extends Case{

	/**
	 * stock de nourriture que contient le buisson
	 */
	private int nourriture;

	/**
	 * Constructeur
	 * @param position : position de la case
	 */
	public Buisson(int[] position) {
		super(1, true, false, position);
		this.nourriture=10;
	}
	
	/**
	 * Constructeur
	 * @param typeOccupation : le type d'occupation (ici buisson)
	 * @param estvide : Y a t'il un animal sur la case ?
	 * @param cadavre : Y a t'il un cadavre sur la case
	 * @param position : position de la case
	 */
	public Buisson(int typeOccupation, boolean estvide, boolean cadavre, int[] position) {
		super(typeOccupation, estvide, cadavre, position);
		this.nourriture=10;
	}

	/**
	 * Getter
	 * @return la quantitée de nourriture présente sur la case
	 */
	public int getNourriture() {
		return nourriture;
	}

	/**
	 * Setter
	 * @param nourriture : la quantitée de nourriture présente sur la case
	 */
	public void setNourriture(int nourriture) {
		this.nourriture = nourriture;
	}


	/**
	 * methode qui recharge le stock de nouriiture que contient le buisson si il est vide
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
		return 1;
	}
	
}
