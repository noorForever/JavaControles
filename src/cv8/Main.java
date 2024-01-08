package cv8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
			Employe[] employes = new Employe[4];
			employes[0]= new Manager("employe1","E5R5Y",23,20000,4000,"dep1");
			employes[1]= new Manager("employe2","R6H7S",27,23000,6000,"dep2");
			employes[2]= new TravailleurHoraire("employe3","T5F8V",25,30000,23);
			employes[3]= new TravailleurHoraire("employe4","S4B5Y",29,27000,34);
			
			for(Employe e : employes) {
				System.out.println(e.toString()+e.calculerSalaire());
				e.afficherType();
				
				if(e instanceof Manager) {
					((Manager) e).infoSup();
				}
			}
			
			Arrays.sort(employes);
			
			System.out.println("tableau trier");
			for(Employe e : employes) {
				System.out.println(e.toString()+e.calculerSalaire());
				e.afficherType();
				
				if(e instanceof Manager) {
					((Manager) e).infoSup();
				}
			}
			
			Employe Employen= new Manager("employe5","T6D3S",25,21000,5000,"dep3");
			ArrayList<Employe> newEmp= new ArrayList<Employe>(Arrays.asList(employes));
			newEmp.add(Employen);
			employes= newEmp.toArray(new Employe[newEmp.size()]);
			
			System.out.println("tableau ajoute");
			for(Employe e : employes) {
				System.out.println(e.toString()+e.calculerSalaire());
				e.afficherType();
				
				if(e instanceof Manager) {
					((Manager) e).infoSup();
				}
			}
			
			ArrayList<Employe> nEmp= new ArrayList<Employe>(Arrays.asList(employes));
			nEmp.remove(0);
			employes= nEmp.toArray(new Employe[nEmp.size()]);
			
			System.out.println("tableau aprés suppression");
			for(Employe e : employes) {
				System.out.println(e.toString()+e.calculerSalaire());
				e.afficherType();
				
				if(e instanceof Manager) {
					((Manager) e).infoSup();
				}
			}
			
			Employe[] Empcopy =Arrays.copyOf(employes, employes.length);
			
			ArrayList<Employe> empNew = new ArrayList<Employe>(Arrays.asList(employes));
			Collections.reverse(empNew);
			
			employes= empNew.toArray(new Employe[empNew.size()]);
			
			System.out.println("tableau reverser");
			for(Employe e : employes) {
				System.out.println(e.toString()+e.calculerSalaire());
				e.afficherType();
				
				if(e instanceof Manager) {
					((Manager) e).infoSup();
				}
			}

	}}


