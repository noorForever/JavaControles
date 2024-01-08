package cv3;

public class Test {

	public static boolean equal(int T1[], int T2[]) {
		if(T1.length != T2.length) {
		return false;
		}
		for(int i=0; i<T1.length;i++ ) {
		if(T1[i] != T2[i])
		return false;
		}
		return true;
		}
		public static void main(String arg[]) {
		 int[] T1= {4,5,7,3};
		 int[] T2= {4,5,21,3};
		 
		 boolean e = equal(T1, T2);
		 System.out.println("Résultat : " + e);
		}

}
