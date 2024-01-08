package cv8;

public class TravailleurHoraire extends Employe{
	private double salaireb;
	private int htravail;
	
	public TravailleurHoraire(String nom, String matricule, int age, double salaireb, int htravail) {
		super(nom, matricule, age);
		this.salaireb = salaireb;
		this.htravail = htravail;
	}

	@Override
	public double calculerSalaire() {
		return salaireb*htravail;
	}

	@Override
	public void afficherType() {
		super.afficherType();
	}

	@Override
	public String toString() {
		return super.toString()+ "TravailleurHoraire [salaireb=" + salaireb + ", htravail=" + htravail + "]";
	}
	
	


	}
	
	
	
	
	


