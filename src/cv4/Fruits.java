package cv4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Fruits {

	public static void main(String[] args) {
			Fruit[] tabFruits= new Fruit[4];
			tabFruits[0]= new Fruit("Fruit1","calories1");
			tabFruits[1]= new Fruit("Fruit2","calories2");
			tabFruits[2]= new Pomme("Pomme1","calories3","couleur1",12);
			tabFruits[3]= new Pomme("Pomme2","calories4","couleur2",13);
			
			for(Fruit f : tabFruits) {
				System.out.println(f.toString());
				f.afficher();
			}
			
			Arrays.sort(tabFruits);
			
			System.out.println("tableau trier");
			for(Fruit f : tabFruits) {
				System.out.println(f.toString());
				f.afficher();
			}
			
			Fruit frut = new Fruit("Fruitn","caloriesn");
			ArrayList<Fruit> newListv= new ArrayList<Fruit>(Arrays.asList(tabFruits));
			newListv.add(frut);
			tabFruits= newListv.toArray(new Fruit[newListv.size()]);
			
			System.out.println("tableau ajoute");
			for(Fruit f : tabFruits) {
				System.out.println(f.toString());
				f.afficher();
			}
			
			ArrayList<Fruit> fList= new ArrayList<Fruit>(Arrays.asList(tabFruits));
			fList.remove(0);
			tabFruits= fList.toArray(new Fruit[fList.size()]);
			
			System.out.println("tableau aprés suppression");
			for(Fruit f : tabFruits) {
				System.out.println(f.toString());
				f.afficher();
			}
			
			Fruit[] villescopy =Arrays.copyOf(tabFruits, tabFruits.length);
			
			ArrayList<Fruit> fruitsNew = new ArrayList<Fruit>(Arrays.asList(tabFruits));
			Collections.reverse(fruitsNew);
			
			tabFruits= fruitsNew.toArray(new Fruit[fruitsNew.size()]);
			
			System.out.println("tableau reverser");
			for(Fruit f : tabFruits) {
				System.out.println(f.toString());
				f.afficher();
			}

		}

}
