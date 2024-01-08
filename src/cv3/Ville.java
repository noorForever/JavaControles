package cv3;

public class Ville implements Comparable<Ville>{
	private String nom;
	private int superficie;
	private int nbHabitant;
	
	public Ville(String nom, int superficie) {
		this.nom = nom;
		this.superficie = superficie;
	}
	
	public Ville(String nom, int superficie, int nbHabitant) {
		this.nom = nom;
		this.superficie = superficie;
		this.nbHabitant = nbHabitant;
	}

	@Override
	public int compareTo(Ville v) {
		return this.nom.compareTo(nom);
	}

	@Override
	protected Ville clone() throws CloneNotSupportedException {
		return (Ville) super.clone();
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", superficie=" + superficie + ", nbHabitant=" + nbHabitant + "]";
	}

	
	
	
	
	
	
	
	

}
