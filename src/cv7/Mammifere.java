package cv7;

public class Mammifere extends Animal{
	
	
	public Mammifere(String nom, int poids, int age) {
		super(nom, poids, age);
	}

	@Override
	public void faireDeBruit() {
		System.out.println("Le mammifère émt un son");
	}
	
	@Override
	public void afficherType() {
		System.out.println("mammifere");
	}
	
	public void allaiter() {
		System.out.println("Le mammifère allaite ses petits");
	}

	@Override
	public String toString() {
		return super.toString() ;
	}
	
	

}
