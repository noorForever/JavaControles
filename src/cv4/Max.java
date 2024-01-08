package cv4;

public class Max {
	public static int max3(int a, int b, int c) {
		int d= Math.max(a,Math.max(b,c));
		return d;}
		
		public static void main(String arg[]) {
		int max = max3(91,54,2);
		System.out.println("Le max des entiers : " + max);

}}
