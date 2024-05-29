package ex3;
/**
 * Classe animaux pour déterminer la classe mere des autres classe:
 * Aquarium,FermeReptile,SavaneAfricaine,ZoneCarnivore
 */
public class Animaux {
	private String type;
	private String nom; 
	private String comportementAlimentaire;
	
	/**
	 * constructeur sans argument de la classe mere
	 */
	public Animaux(){
		this.type = null;
		this.nom = null;
		this.comportementAlimentaire = null;
	}
	/**
	 * constructeur avec argument de la classe mere
	 */
	public Animaux(String type,String nom,String comportement){
		this.type = type;
		this.nom = nom;
		this.comportementAlimentaire = comportement;
	}
	//Setters et getters
	/**
	 * retourne le type de l'animal
	 * @return String type
	 */
	public String getType() {
		return type;
	}
	/**
	 * initialise la valeur type de l'animal
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * retourne le nom de l'animal
	 * @return string nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * initialise la valeur nom de l'animal
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * retourne la valeur du comportement alimentaire
	 * @return string comportementAlimentaire
	 */
	public String getComportementAlimentaire() {
		return comportementAlimentaire;
	}
	/**
	 * initialse la valeur du comportementAlimentaire
	 * @param comportementAlimentaire
	 */
	public void setComportementAlimentaire(String comportementAlimentaire) {
		this.comportementAlimentaire = comportementAlimentaire;
	}
	
	public String toString() {
		return "Animaux [type=" + this.getType() + ", nom=" + this.getNom() + ", comportementAlimentaire=" + this.getComportementAlimentaire() + "]";
	}
	
	
}
