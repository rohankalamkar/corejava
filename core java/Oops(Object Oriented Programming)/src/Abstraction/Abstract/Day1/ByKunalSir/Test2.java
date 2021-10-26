package Abstraction.Abstract.Day1.ByKunalSir;

public class Test2 {
	public static void main(String[] args) {
		
		//A2 a1 = new A2();  // Cannot Instantiate the type A2
							// It means We cannot create Abstract class Object
		//B2 b1 = new B2();   // Cannot Instantiate the type B2
		A2 a = new C2();
		a.m1();
		a.m3();
		a.m2();
		System.out.println("1.------------------------------");
		
		B2 b = new C2();
		b.m1();
		b.m2();
		b.m3();
		System.out.println("2.-----------------------------");
		
		C2 c = new C2();
		c.m1();
		c.m2();
		c.m3();
		System.out.println("3.-----------------------------");
		
	}

}
