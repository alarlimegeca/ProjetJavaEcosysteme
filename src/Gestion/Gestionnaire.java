package Gestion;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import animaux.Animal;

public class Gestionnaire {
	protected static int tour;
	private static int cadence;
	private static ArrayList<Animal> animaux = new ArrayList<Animal>();

	/**
	 * getter et setter
	 * 
	 */

	public static int getTour() {
		return tour;
	}

	public void setTour(int tour) {
		Gestionnaire.tour = tour;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int newCadence) {
		Gestionnaire.cadence = newCadence;
	}

	public Animal getAnimal(int id) {
		return animaux.get(id);
	}

	public static ArrayList<Animal> getAnimaux(){
		return animaux;
	}

	public static void addAnimal(Animal animal) {
		animaux.add(animal);
	}


	public void nouveauTour() {
		tour = tour++;
		//TimerTask task = new TimerTask() {
			//public void run() { 
				for (Animal animal : animaux) {								// pour chaque animal présent dans la simulation
					if (animal.getEstVivant() == false){						// si l'animal est decedé,
						animal.seDecomposer();								// on applique la fonction seDecomposer()
						continue;										// et on termine le tour de l'animal
					}
					else {												// sinon,
						if (animal.getEsperanceVie() <= tour - animal.getDateNaissance() || animal.famine() == true ) {	//si l'animal a atteint son esperance de vie, ou si il est en famine avancée
							animal.decede();												// il décede
							continue;												// et on termine le tour de l'animal
						}else {														//sinon,
							animal.seDeplacer();											// l'animal se déplace,
							animal.seNourrir();											// se nourrit si il le peut
							animal.seReproduire();										// et se reproduit si il le peut
						}
					}

				}
			}
		//};
		//Timer timer = new Timer(); timer.scheduleAtFixedRate(task, 0, 1000); ce bout de code sert à mettre un timer pour que le tour passe au suivant automatiquement
	//}
}
