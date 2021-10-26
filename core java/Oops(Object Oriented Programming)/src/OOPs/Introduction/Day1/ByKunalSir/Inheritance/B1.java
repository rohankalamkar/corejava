package OOPs.Introduction.Day1.ByKunalSir.Inheritance;

public class B1 extends A1 {
	int z = 100;
	public void m2() {
		
		System.out.println("m2 method of ------- B1");
		System.out.println("Value of x of class A1 using directly without Object Creation in m2() method in B1 class "+x);
		m1();   // We can use directly m1() in class B without any object Creation.
		System.out.println("Value of z of class B1 in m2() method : "+z);
	}

}
