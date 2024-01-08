package cv5;

public class Professeur extends Personne{
	private String coursEnseigne;

	public Professeur(String nom, String prenom, String dateNaissance, String coursEnseigne) {
		super(nom, prenom, dateNaissance);
		this.coursEnseigne = coursEnseigne;
	}

	@Override
	public void description() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
				return super.toString()+ "Professeur [ cours Enseigne: "+ coursEnseigne + "]";
	}


	
	

}
