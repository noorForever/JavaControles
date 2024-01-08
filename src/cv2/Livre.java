package cv2;

public class Livre implements Comparable<Livre>{
	private String titre;
	private String auteur;
	private double prix;
	private int nbrpage;
		
	public Livre(String titre, String auteur, double prix, int nbrpage) {
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.nbrpage = nbrpage;
	}

	@Override
	public int compareTo(Livre l) {
		return (int)(this.prix-l.prix);
	}
	
	public void afficher() {
		System.out.println(this.getClass().getSimpleName() +",Titre:"+ titre +",Auteur:"+ auteur +",prix:"+ prix +",nbre de page "+ nbrpage);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + ", nbrpage=" + nbrpage + "]";
	}

	
	
		


}
