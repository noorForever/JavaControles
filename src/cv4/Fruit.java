package cv4;

public class Fruit implements Comparable<Fruit>{
	private String nom;
	private String calories;
	
	public Fruit(String nom, String calories) {
		this.nom = nom;
		this.calories = calories;
	}
	
	public void afficher() {
		System.out.println(this.getClass().getSimpleName()+nom+calories);
	}


	public int compareTo(Fruit f) {
		return this.nom.compareTo(f.nom);
	}

	public String toString() {
		return "Fruit [nom=" + nom + ", calories=" + calories + "]";
	}

	@Override
	protected Fruit clone() throws CloneNotSupportedException {
		return (Fruit) super.clone();
	}
	
	
	

}
