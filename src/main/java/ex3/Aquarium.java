package ex3;
import java.util.ArrayList;
import java.util.List;

public class Aquarium extends Animaux{

	/*
	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	*/
	/**
	 * Pour re-utiliser la liste , mais composée de type dérivés de animaux
	 */
	private ArrayList<Animaux> animauxList;
	/**
	 * constructeur sans argument de la classe Aquarium
	 * dérivée de Animaux
	 */
	public Aquarium() {
		super();
	}
	public Aquarium(String type, String nom,String comportement) {
		super(type,nom,comportement);
	}
	/**
	 * ajoute un animal de type aquarium dans la liste aquariumList
	 * @param aquarium
	 */
	public void addAnimal(Aquarium aquarium) {
		/*
		types.add(aquarium.getType());
		noms.add(aquarium.getNom());
		comportements.add(aquarium.getComportementAlimentaire());
		*/
		animauxList.add(aquarium);
	}
	/**
	 * Pour afficher la listes de animaux de l'aquarium
	 */
	public void afficherListeAnimaux(){
		for (Animaux nom: animauxList){
			System.out.println(nom);
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return animauxList.size() * 0.2;
	}
	/**
	 * retourne les valeurs de la liste des animaux de l'aquarium
	 * @return
	 */
	public int compterAnimaux() {
		return animauxList.size();
	}
	
	public String toString() {
		return this.getType()+" "+this.getNom()+" "+this.getComportementAlimentaire();
	}

	

	
	
}