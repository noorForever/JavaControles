package cv7;

public abstract class Animal implements Comparable<Animal>{
	private String nom;
	private int poids;
	private int age;
	
	public Animal(String nom, int poids, int age) {
		this.nom = nom;
		this.poids = poids;
		this.age = age;
	}
	
	public abstract void faireDeBruit();

	public String toString() {
		return "Animal [nom=" + nom + ", poids=" + poids + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Animal o) {
		return this.nom.compareTo(nom);
	}
	
	public abstract void afficherType();



}
