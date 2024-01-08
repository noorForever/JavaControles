package cv6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
	Forme[] forme = new Forme[4];
	forme[0]= new Cercle(3,4,3.0);
	forme[1]= new Cercle(6,5,4.0);
	forme[2]= new Cylindre(8,6,6.78,16);
	forme[3]= new Cylindre(5,14,12.49,13);
	
	for(Forme f : forme) {
		System.out.println(f.toString());
		f.afficherInf();
	}
	
	Arrays.sort(forme);
	
	System.out.println("tableau trier");
	for(Forme f : forme) {
		System.out.println(f.toString());
		f.afficherInf();
	}
	
	Forme formen= new Cercle(10,6,6.12);
	ArrayList<Forme> newform= new ArrayList<Forme>(Arrays.asList(forme));
	newform.add(formen);
	forme= newform.toArray(new Forme[newform.size()]);
	
	System.out.println("tableau ajoute");
	for(Forme f : forme) {
		System.out.println(f.toString());
		f.afficherInf();
	}
	
	ArrayList<Forme> nForm= new ArrayList<Forme>(Arrays.asList(forme));
	nForm.remove(0);
	forme= nForm.toArray(new Forme[nForm.size()]);
	
	System.out.println("tableau aprés suppression");
	for(Forme f : forme) {
		System.out.println(f.toString());
		f.afficherInf();
	}
	
	Forme[] formcopy =Arrays.copyOf(forme, forme.length);
	
	ArrayList<Forme> formNew = new ArrayList<Forme>(Arrays.asList(forme));
	Collections.reverse(formNew);
	
	forme= formNew.toArray(new Forme[formNew.size()]);
	
	System.out.println("tableau reverser");
	for(Forme f : forme) {
		System.out.println(f.toString());
		f.afficherInf();
	}
			

	}

}
