package cv2;

public class A {
	static int f (int n)
	{	q = n ; }
	void g (int n)
	{	q = n ;
	p = n ;
	}
	static private final int p = 20 ;
	private int q ;
	}
	public class EssaiA
	{	public static void main (String args[])
	{	A a = new A() ; int n = 5 ;
	a.g(n) ;
	a.f(n) ;
	f(n) ;
	}
}
	
//	1. la methode statique f() utilise une variable normale se qui est intérdit ;
//	2. p est declare comme variable statique ;
//	3. f(n) n’est pas definit dans la classe EssaiA ;
