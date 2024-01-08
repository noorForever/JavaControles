package cv1;

import java.util.ArrayList;
import java.util.Arrays;

public class Salaire {

	public static void main(String[] args) {
		Employe[] tabEmp= new Employe[3];
		tabEmp[0]= new Vendeur("Samir","Ahmed", 28, 2012, 56000);
		tabEmp[1]= new Ouvrier("Salim","Riahi", 24, 2017, 56);
		tabEmp[2]= new OuvrierARisque("Monir","Sidki", 26, 2020, 50);
		
		for(Employe e : tabEmp) {
			System.out.println(e.toString());
			System.out.println(e.calculerSalaire());
		}
		 System.out.println("//////////////////////////////////////////");
		Arrays.sort(tabEmp);
		
		for(Employe e : tabEmp) {
			System.out.println(e.toString());
			System.out.println(e.calculerSalaire());
		}
		
		 System.out.println("//////////////////////////////////////////");
		
		Employe prof= new Vendeur("Reda","Ahmed",27,2015,56444);
		ArrayList<Employe> newList= new ArrayList<Employe>(Arrays.asList(tabEmp));
		newList.add(prof);
		tabEmp= newList.toArray(new Employe[newList.size()]);
		
		for(Employe e : tabEmp) {
			System.out.println(e.toString());
			System.out.println(e.calculerSalaire());
		}
		 System.out.println("//////////////////////////////////////////");
		
		ArrayList<Employe> newLists= new ArrayList<Employe>(Arrays.asList(tabEmp));
		newLists.remove(0);
		tabEmp= newLists.toArray(new Employe[newLists.size()]);
		
		for(Employe e : tabEmp) {
			System.out.println(e.toString());
			System.out.println(e.calculerSalaire());
		}

	}

}
