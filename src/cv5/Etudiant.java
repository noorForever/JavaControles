package cv5;

public class Etudiant extends Personne{
	private String cne;
	private double noteFinale;
	
	public Etudiant(String nom, String prenom, String dateNaissance, String cne, double noteFinale) {
		super(nom, prenom, dateNaissance);
		this.cne = cne;
		this.noteFinale = noteFinale;
	}

	@Override
	public void description() {
		System.out.println(this.getClass().getSimpleName());
		
	}

	@Override
	public String toString() {
		return super.toString()+ "Etudiant [ cne: "+ cne +" / note Finale: "+ noteFinale+"]";
	}
	
	

}
