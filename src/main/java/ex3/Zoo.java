package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	//private SavaneAfricaine savaneAfricaine;
	//private ZoneCarnivore zoneCarnivore;
	//private FermeReptile fermeReptile;
	//private Aquarium aquarium;
	private static ArrayList<Animaux> animauxList;
	
	public Zoo(String nom){
		this.nom = nom;
		animauxList = new ArrayList<Animaux>();
	}
	
	public void addAnimal(Animaux animal){
		/*
		if (Animaux.getType().toString().equals("MAMMIFERE") && Animaux.getComportementAlimentaire().toString().equals("CARNIVORE")){
			animauxList.add(animal);
			
		}
		else if (Animaux.getType().toString().equals("MAMMIFERE") && Animaux.getComportementAlimentaire().toString().equals("HERBIVORE")){
			animauxList.add(animal);
			
		}
		else if (Animaux.getType().toString().equals("REPTILE")){
			animauxList.add(animal);
			
		}
		else if (Animaux.getType().toString().equals("POISSON")){
			animauxList.add(animal);
			
		}
		*/
		System.out.println("anim: "+animal.toString());
		animauxList.add(animal);
	}
	
	public void afficherListeAnimaux(){
		System.out.println(">"+animauxList.size());
		for(Animaux animal : animauxList) {
			System.out.println("->"+animal.toString());
		}
		
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}