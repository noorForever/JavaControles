package cv5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercice {

	public static void main(String[] args) {
		Personne[] tabPers= new Personne[4];
		tabPers[0]= new Professeur("n1","p1","20/12/1994","PYTHON");
		tabPers[1]= new Professeur("n2","p1","14/09/1990","A.I");
		tabPers[2]= new Etudiant("n3","p1","02/04/2001","R1V47", 17.63);
		tabPers[3]= new Etudiant("n4","p1","13/11/2000","S8V31", 18.01);
		
		for(Personne p : tabPers) {
			System.out.println(p.toString());
			p.description();
		}
		
		Arrays.sort(tabPers);
		
		System.out.println("tableau trier");
		for(Personne p : tabPers) {
			System.out.println(p.toString());
			p.description();
		}
		
		Personne prof= new Professeur("new","prof","20/12/1994","ART");
		ArrayList<Personne> newList= new ArrayList<Personne>(Arrays.asList(tabPers));
		newList.add(prof);
		tabPers= newList.toArray(new Personne[newList.size()]);
		
		System.out.println("tableau ajoute");
		for(Personne p : tabPers) {
			System.out.println(p.toString());
			p.description();
		}
		
		ArrayList<Personne> nList= new ArrayList<Personne>(Arrays.asList(tabPers));
		nList.remove(0);
		tabPers= nList.toArray(new Personne[nList.size()]);
		
		System.out.println("tableau aprés suppression");
		for(Personne p : tabPers) {
			System.out.println(p.toString());
			p.description();
		}
		
		Personne[] perscopy =Arrays.copyOf(tabPers, tabPers.length);
		
		ArrayList<Personne> persNew = new ArrayList<Personne>(Arrays.asList(tabPers));
		Collections.reverse(persNew);
		
		tabPers= persNew.toArray(new Personne[persNew.size()]);
		
		System.out.println("tableau reverser");
		for(Personne p : tabPers) {
			System.out.println(p.toString());
			p.description();
		}

	}

}
