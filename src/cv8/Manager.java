package cv8;

public class Manager extends Employe{
	private double salairb;
	private double bonus;
	private String departement;
	
	

	public Manager(String nom, String matricule, int age, double salairb, double bonus, String departement) {
		super(nom, matricule, age);
		this.salairb = salairb;
		this.bonus = bonus;
		this.departement = departement;
	}
	
	public void infoSup() {
		System.out.println("departement"+departement);
	}

	@Override
	public String toString() {
		return super.toString()+ "Manager [salairb=" + salairb + ", bonus=" + bonus + ", departement=" + departement + "]";
	}



	@Override
	public double calculerSalaire() {
		return salairb*bonus;
	}

	@Override
	public void afficherType() {
		super.afficherType();
	}
	
	
	

}
