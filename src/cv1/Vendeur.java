package cv1;

public class Vendeur extends Employe{
	private int ch;

	public Vendeur(String nom, String prenom, int age, int anne, int ch) {
		super(nom, prenom, age, anne);
		this.ch = ch;
	}

	@Override
	public double calculerSalaire() {
		return ch*0.2+400;
	}

	@Override
	public String toString() {
		return super.toString()+ "Vendeur [ch=" + ch + "]";
	}

}
