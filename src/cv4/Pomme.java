package cv4;

public class Pomme extends Fruit{
	private String couleur;
	private int poids;
	
	public Pomme(String nom, String calories, String couleur, int poids) {
		super(nom, calories);
		this.couleur = couleur;
		this.poids = poids;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		super.afficher();
		System.out.println(couleur+ poids);
	}

	@Override
	protected Fruit clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
	
	

}
