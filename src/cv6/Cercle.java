package cv6;

public class Cercle extends Forme{
	private int x;
	private int y;
	private double r;
	
	public Cercle(int x, int y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public double calculerSurface() {
		return 2*Math.PI*r;
	}

	@Override
	public double calculerVolume() {
		return Math.PI*r*r;
	}

	@Override
	public String toString() {
		return super.toString()+ "Cercle [x=" + x + ", y=" + y + ", r=" + r + "]";
	}

	
	
	
	
}
