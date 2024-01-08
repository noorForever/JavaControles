package cv3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class paye {

	public static void main(String[] args) {
		Ville[] tabVilles= new Ville[4];
		tabVilles[0]= new Ville("Ville1",400,12067400);
		tabVilles[1]= new Ville("Ville2",600,18908890);
		tabVilles[2]= new Capitale("Capitale1",378,2000000,"paye1");
		tabVilles[3]= new Capitale("Capitale2",230,8798456,"paye2");
		
		for(Ville v : tabVilles) {
			System.out.println(v.toString());
		}
		
		Arrays.sort(tabVilles);
		
		System.out.println("tableau trier");
		for(Ville v : tabVilles) {
			System.out.println(v.toString());
		}
		
		Ville vil = new Ville("Ville New",546,1365756);
		ArrayList<Ville> newListv= new ArrayList<Ville>(Arrays.asList(tabVilles));
		newListv.add(vil);
		tabVilles= newListv.toArray(new Ville[newListv.size()]);
		
		System.out.println("tableau ajoute");
		for(Ville v : tabVilles) {
			System.out.println(v.toString());
		}
		
		ArrayList<Ville> vList= new ArrayList<Ville>(Arrays.asList(tabVilles));
		vList.remove(0);
		tabVilles= vList.toArray(new Ville[vList.size()]);
		
		System.out.println("tableau aprés suppression");
		for(Ville v : tabVilles) {
			System.out.println(v.toString());
		}
		
		Ville[] villescopy =Arrays.copyOf(tabVilles, tabVilles.length);
		
		ArrayList<Ville> villesNew = new ArrayList<Ville>(Arrays.asList(tabVilles));
		Collections.reverse(villesNew);
		
		tabVilles= villesNew.toArray(new Ville[villesNew.size()]);
		
		System.out.println("tableau reverser");
		for(Ville v : tabVilles) {
			System.out.println(v.toString());
		}

	}

}
