package ecosysteme;

/** 
 * Cette classe gère les cases de type sable
 * @author Paul,Armand et Louise
 *
 */
public class Sable extends Case{

	/**
	 * Constructeur
	 * @param position : position de la case
	 */
	public Sable(int[] position) {
		super(4, true, false, position);
	}
	
	/**
	 * Constructeur
	 * @param typeOccupation : le type d'occupation (ici Arbre)
	 * @param estvide : Y a t'il un animal sur la case ?
	 * @param cadavre : Y a t'il un cadavre sur la case
	 * @param position : position de la case
	 */
	public Sable(int typeOccupation, boolean estvide, boolean cadavre, int[] position) {
		super(4, estvide, cadavre, position);
	}

	/**
	 * getters et setters
	 */
	@Override
	public int getTypeOccupation() {
		return 4;
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
