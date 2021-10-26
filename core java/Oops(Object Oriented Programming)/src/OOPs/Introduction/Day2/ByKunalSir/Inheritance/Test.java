package OOPs.Introduction.Day2.ByKunalSir.Inheritance;

public class Test {
	public static void main(String[] args) {
		
		A a = new B();
		
		a.m1();     // m1-----B     // Method running rule is different in this case
		a.m2();     // m2 -----A
		
		//a.m3();    error
		
		System.out.println(a.a);   // 10
		System.out.println(a.b);   // 20
		 
	}

}
