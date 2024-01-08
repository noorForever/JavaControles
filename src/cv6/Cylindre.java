package cv6;

public class Cylindre  extends Cercle {
	 private double h;

	public Cylindre(int x, int y, double r, double h) {
		super(x, y, r);
		this.h = h;
	}
	@Override
	public  double calculerSurface() {
		
		return this.calculerSurface()*2;
	}
	@Override 
	  public  double calculerVolume() {
		
		return this.calculerVolume()*h;
	}
	@Override
	public String toString() {
		return "Cylindre [h=" + h + ", toString()=" + super.toString() +"]" ;
	}

}
