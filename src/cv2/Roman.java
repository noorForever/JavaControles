package cv2;

public class Roman extends Livre{
	private String medition;
	private int nbrexmpl;
	
	public Roman(String titre, String auteur, double prix, int nbrpage, String medition, int nbrexmpl) {
		super(titre, auteur, prix, nbrpage);
		this.medition = medition;
		this.nbrexmpl = nbrexmpl;
	}

	@Override
	public String toString() {
		return "Roman [medition=" + medition + ", nbrexmpl=" + nbrexmpl + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}

	@Override
	public void afficher() {
		super.afficher();
		System.out.println("maison edition"+medition+"nbrexmpl"+nbrexmpl);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
	
	
	

}
