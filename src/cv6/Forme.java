package cv6;


public  abstract class Forme  implements Comparable {
  public abstract double calculerSurface();
  public abstract double calculerVolume();
@Override
public String toString() {
	return "Forme ";
}

 public void afficherInf() {
	System.out.println(this.getClass().getSimpleName()+"la surface"+this.calculerSurface()
+"le volume"+this.calculerVolume());
}

public int compareTo(Forme f) {
	return (int)(this.calculerSurface()-f.calculerSurface());
}
 

  

}
