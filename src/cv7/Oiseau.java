package cv7;

public class Oiseau extends Animal{

	public Oiseau(String nom, int poids, int age) {
		super(nom, poids, age);
	}

	@Override
	public void faireDeBruit() {
		System.out.println("L'oiseau chante mélodieusement");
	}

	public void voler() {
		System.out.println("L'oiseau deploie ses ailes et s'envole");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void afficherType() {
		System.out.println("Oiseau");
		
	}
	
	
	
	

}
