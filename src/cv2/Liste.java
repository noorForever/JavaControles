package cv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Liste {

	public static void main(String[] args) {
		Livre[] tabLivres= new Livre[4];
		tabLivres[0]= new Livre("Livre1","Auteur1",54.56, 456);
		tabLivres[1]= new Livre("Livre2","Auteur2",267.9, 309);
		tabLivres[2]= new Roman("Roman1","Auteur3",34, 440,"maison edition1",45);
		tabLivres[3]= new Roman("Roman2","Auteur4",20,780, "maison edition1",60);
		
		for(Livre liv : tabLivres) {
			System.out.println(liv.toString());
			liv.afficher();
		}
		
		Arrays.sort(tabLivres);
		
		System.out.println("tableau trier");
		for(Livre liv : tabLivres) {
			System.out.println(liv.toString());
			liv.afficher();
		}
		
		Livre l= new Livre("Livre0","Auteur0",12.98, 300);
		ArrayList<Livre> newListl= new ArrayList<Livre>(Arrays.asList(tabLivres));
		newListl.add(l);
		tabLivres= newListl.toArray(new Livre[newListl.size()]);
		
		System.out.println("tableau ajoute");
		for(Livre liv : tabLivres) {
			System.out.println(liv.toString());
			liv.afficher();;
		}
		
		ArrayList<Livre> nList= new ArrayList<Livre>(Arrays.asList(tabLivres));
		nList.remove(0);
		tabLivres= nList.toArray(new Livre[nList.size()]);
		
		System.out.println("tableau aprés suppression");
		for(Livre liv : tabLivres) {
			System.out.println(liv.toString());
			liv.afficher();;
		}
		
		Livre[] livrecopy =Arrays.copyOf(tabLivres, tabLivres.length);
		
		ArrayList<Livre> livreNew = new ArrayList<Livre>(Arrays.asList(tabLivres));
		Collections.reverse(livreNew);
		
		tabLivres= livreNew.toArray(new Livre[livreNew.size()]);
		
		System.out.println("tableau reverser");
		for(Livre liv : tabLivres) {
			System.out.println(l.toString());
			liv.afficher();;
		}

	}

}
