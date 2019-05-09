package ecosysteme;

/** 
 * Cette classe gère les cases de type eau
 * @author Paul,Armand et Louise
 *
 */
public class Eau extends Case{
	
	/**
	 * Constructeur
	 * @param position : position de la case
	 */
	public Eau(int[] position) {
		super(2, true, false, position);
	}

	/**
	 * Constructeur
	 * @param typeOccupation : le type d'occupation (ici Arbre)
	 * @param estvide : Y a t'il un animal sur la case ?
	 * @param cadavre : Y a t'il un cadavre sur la case
	 * @param position : position de la case
	 */
	public Eau(int typeOccupation, boolean estvide, boolean cadavre, int[] position) {
		super(2, estvide, cadavre, position);
	}
	
	/**
	 * getters et setters
	 */
	@Override
	public int getTypeOccupation() {
		return 2;
	}

	@Override
	public int getNourriture() {
		return 0;
	}

	@Override
	public void setNourriture(int nourriture) {		
	}

	@Override
	public void recuperation() {
	}
	
}
