package cv5;

public abstract class Personne implements Comparable<Personne>{
	private String nom;
	private String prenom;
	private String dateNaissance;
	public Personne(String nom, String prenom, String dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	
	public abstract void description();

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "]";
	}

	@Override
	public int compareTo(Personne p) {
		return this.nom.compareTo(p.nom);
	}

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	
	
	

}
