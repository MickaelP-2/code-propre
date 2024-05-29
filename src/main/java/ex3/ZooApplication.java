package ex3;
/**
 * Utiliser une classe Animaux en classe mere pour les différents type d'animaux et de zone du zoo
 */

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new SavaneAfricaine("Gazelle", "MAMMIFERE", "HERBIVORE"));
		//System.out.println(new SavaneAfricaine("Gazelle", "MAMMIFERE", "HERBIVORE"));
		
		zoo.addAnimal(new SavaneAfricaine("Zèbre", "MAMIFERE", "HERBIVORE"));//Mamifere??
		//System.out.println(new SavaneAfricaine("Zèbre", "MAMIFERE", "HERBIVORE"));
		
		zoo.addAnimal(new SavaneAfricaine("Lion", "MAMMIFERE", "HERBIVORE"));
		//System.out.println(new SavaneAfricaine("Lion", "MAMMIFERE", "HERBIVORE"));
		
		zoo.addAnimal(new SavaneAfricaine("Panthère", "MAMMIFERE", "CARNIVORE"));
		//System.out.println(new SavaneAfricaine("Panthère", "MAMMIFERE", "CARNIVORE"));
		
		zoo.addAnimal(new Aquarium("Requin blanc", "POISSON", "HERBIVORE"));//herbivore??
		//System.out.println(new Aquarium("Requin blanc", "POISSON", "HERBIVORE"));
		
		zoo.addAnimal(new Aquarium("Truite dorée", "POISSON", "HERBIVORE"));
		//System.out.println(new Aquarium("Truite dorée", "POISSON", "HERBIVORE"));
		
		zoo.addAnimal(new FermeReptile("Boa constrictor", "SERPENT", "CARNIVORE"));
		//System.out.println(new FermeReptile("Boa constrictor", "SERPENT", "CARNIVORE"));
		
		zoo.addAnimal(new FermeReptile("Python", "SERPENT", "CARNIVORE"));
		//System.out.println(new FermeReptile("Python", "SERPENT", "CARNIVORE"));
		zoo.addAnimal(new FermeReptile("Varant", "SERPENT", "CARNIVORE"));
		zoo.afficherListeAnimaux();
	}

}