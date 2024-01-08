package cv7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import cv6.Forme;

public class Test {

	public static void main(String[] args) {
		Animal[] anime = new Animal[4];
		anime[0] = new Mammifere("m1",12,5);
		anime[1] = new Mammifere("m2",12,6);
		anime[2] = new Oiseau("O1",12,4);
		anime[3] = new Oiseau("O2",12,3);
		
		for(Animal a : anime) {
			a.afficherType();
			System.out.println(a.toString());
			
			a.faireDeBruit();
			if(a instanceof Mammifere) {
				((Mammifere) a).allaiter();
			}else {
				((Oiseau) a).voler();
			}
		}
		
		Arrays.sort(anime);
		
		for(Animal a : anime) {
			a.afficherType();
			System.out.println(a.toString());
			
			a.faireDeBruit();
			if(a instanceof Mammifere) {
				((Mammifere) a).allaiter();
			}else {
				((Oiseau) a).voler();
			}
		}
		
		Animal anim= new Oiseau("O3",15, 5);
		ArrayList<Animal> animales= new ArrayList<Animal>(Arrays.asList(anime));
		animales.add(anim);
		anime= animales.toArray(new Animal[animales.size()]);
		
		System.out.println("tableau ajoute");
		for(Animal a : anime) {
			a.afficherType();
			System.out.println(a.toString());
			
			a.faireDeBruit();
			if(a instanceof Mammifere) {
				((Mammifere) a).allaiter();
			}else {
				((Oiseau) a).voler();
			}
		}
		
		ArrayList<Animal> animalsupprime= new ArrayList<Animal>(Arrays.asList(anime));
		animalsupprime.remove(0);
		anime= animalsupprime.toArray(new Animal[animalsupprime.size()]);
		
		System.out.println("tableau aprés suppression");
		for(Animal a : anime) {
			a.afficherType();
			System.out.println(a.toString());
			
			a.faireDeBruit();
			if(a instanceof Mammifere) {
				((Mammifere) a).allaiter();
			}else {
				((Oiseau) a).voler();
			}
		}
		
		Animal[] animecopy =Arrays.copyOf(anime, anime.length);
		
		ArrayList<Animal> animalNew = new ArrayList<Animal>(Arrays.asList(anime));
		Collections.reverse(animalNew);
		
		anime= animalNew.toArray(new Animal[animalNew.size()]);
		
		System.out.println("tableau reverser");
		for(Animal a : anime) {
			a.afficherType();
			System.out.println(a.toString());
			
			a.faireDeBruit();
			if(a instanceof Mammifere) {
				((Mammifere) a).allaiter();
			}else {
				((Oiseau) a).voler();
			}
		}

	}

}
