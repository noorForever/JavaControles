package cv1;

public class Ouvrier extends Employe{
	private int nu;

	public Ouvrier(String nom, String prenom, int age, int anne, int nu) {
		super(nom, prenom, age, anne);
		this.nu = nu;
	}

	@Override
	public double calculerSalaire() {
		return nu*5;
	}

	@Override
	public String toString() {
		return super.toString()+ "Ouvrier [nu=" + nu + "]";
	}

	}


