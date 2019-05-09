package ecosysteme;

/** 
 * Cette classe gère les cases de type terrain nu
 * @author Paul,Armand et Louise
 *
 */
public class TerrainNu extends Case{
	
	/**
	 * Constructeur
	 * @param position : position de la case
	 */
	public TerrainNu(int[] position) {
		super(6, true, false, position);
	}

	/**
	 * Constructeur
	 * @param typeOccupation : le type d'occupation (ici Arbre)
	 * @param estvide : Y a t'il un animal sur la case ?
	 * @param cadavre : Y a t'il un cadavre sur la case
	 * @param position : position de la case
	 */
	public TerrainNu(int typeOccupation, boolean estvide, boolean cadavre, int[] position) {
		super(6, estvide, cadavre, position);
	}

	/**
	 * getters et setters
	 */
	@Override
	public int getTypeOccupation() {
		return 6;
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
