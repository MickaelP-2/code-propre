package ex3;
import java.util.ArrayList;
import java.util.List;

public class ZoneCarnivore extends Animaux{

	/*
	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	*/
	private ArrayList<Animaux> animauxList;
	
	public ZoneCarnivore() {
		super();
	}
	public ZoneCarnivore(String type, String nom,String comportement) {
		super(type,nom,comportement);
	}
	
	public void addAnimal(ZoneCarnivore carnivore) {
		/*
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
		*/
		animauxList.add(carnivore);
	}
	
	public void afficherListeAnimaux(){
		for (Animaux nom: animauxList){
			System.out.println(nom);
		}
	}
	
	public int compterAnimaux(){
		return animauxList.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return animauxList.size() * 10;
	}
	public String toString() {
		return this.getType()+" "+this.getNom()+" "+this.getComportementAlimentaire();
	}
}