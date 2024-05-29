package ex3;
import java.util.ArrayList;
import java.util.List;

public class FermeReptile extends Animaux{

	/*
	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	*/
	private ArrayList<Animaux> animauxList;
	
	public FermeReptile() {
		super();
	}
	public FermeReptile(String type,String nom,String comportement) {
		super(type,nom,comportement);
	}
	public void addAnimal(FermeReptile reptile) {
		/*
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
		*/
		animauxList.add(reptile);
		
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
		return animauxList.size() * 0.1;
	}
	public String toString() {
		return this.getType()+" "+this.getNom()+" "+this.getComportementAlimentaire();
	}
}