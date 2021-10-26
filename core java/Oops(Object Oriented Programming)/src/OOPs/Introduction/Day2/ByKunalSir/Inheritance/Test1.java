package OOPs.Introduction.Day2.ByKunalSir.Inheritance;

public class Test1 {
	public static void main(String[] args) {
		B1 b = new C1();
		b.m1();     // m1-----B1
		b.m2();     // m2-------C1     // Method Printing from Constructor class(Right Side)
		b.m3();     // m3-----C1
		b.m5();     // m5--------C1
		System.out.println(b.a);      // 30  // Variable printing from Reference Class and their Parent Class
		System.out.println(b.b);      // 20
		System.out.println(b.c);      // 40  // Variable printing from Reference Class and their Parent Class
		System.out.println("-------------------------------------------------------");
		A1 a = new C1();
		a.m1();      // m1-------B1
		a.m2();      // m2-------C1
		a.m5();      // m5--------C1
		System.out.println(a.a);      // 10
System.out.println(a.b);              // 20
		// System.out.println(a.c);   // error
System.out.println("-----------------------------------------------------");

		A1 c = new B1();
		c.m1();        // m1-------B1
		c.m2();        // m2---------A1
		c.m5();        // m5--------B1
		System.out.println(c.a);     // 10
		System.out.println(c.b);     // 20
		System.out.println("---------------------------------------------------------");
		
		C1 c1 = new D1();
		c1.m1();
		
		
		
// 		C1 d = new B1();   // It will gives you error
	
		// C1 d = new A1();  // It will Gives you error
		
		
	}

}
