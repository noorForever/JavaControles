package cv1;

public abstract class Employe implements Comparable<Employe>{
	private String nom;
	private String prenom;
	private int age;
	private int anne;
	
	public Employe(String nom, String prenom, int age, int anne) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.anne = anne;
	}
	
	public abstract double calculerSalaire();
	
	public void getNom() {
			System.out.println("Type d'employe: "+ this.getClass().getSimpleName()+nom + prenom);
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", anne=" + anne + "]";
	}

	
	public int compareTo(Employe e) {
		return (int)(this.calculerSalaire()-e.calculerSalaire());
	}
	
	

}
