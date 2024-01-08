package cv8;

public abstract class Employe implements Comparable<Employe>{
	private String nom;
	private String matricule;
	private int age;
	
	public Employe(String nom, String matricule, int age) {
		this.nom = nom;
		this.matricule = matricule;
		this.age = age;
	}
	
	public abstract double calculerSalaire();
	
	public void afficherType() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", matricule=" + matricule + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employe e) {
		return (int)(this.calculerSalaire()-e.calculerSalaire());
	}
	
	

}
