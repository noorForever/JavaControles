package cv1;

public class OuvrierARisque extends Employe implements Risque{
	private int nu;

	public OuvrierARisque(String nom, String prenom, int age, int anne, int nu) {
		super(nom, prenom, age, anne);
		this.nu = nu;
	}

	@Override
	public double calculerSalaire() {
		return nu*5+PRIME;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
