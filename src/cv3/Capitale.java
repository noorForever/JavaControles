package cv3;

public class Capitale extends Ville{
	private String paye;

	public Capitale(String nom, int superficie,int nbHabitant, String paye) {
		super(nom, superficie,nbHabitant);
		this.paye = paye;}
	
	public Capitale(String nom, int superficie, String paye) {
		super(nom, superficie);
		this.paye = paye;
	}
	
	

	@Override
	protected Ville clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
