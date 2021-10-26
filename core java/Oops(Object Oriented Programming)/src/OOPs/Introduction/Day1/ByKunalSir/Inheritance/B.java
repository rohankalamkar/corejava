package OOPs.Introduction.Day1.ByKunalSir.Inheritance;

public class B {
	
	int z = 200;
	public void m2() {
		//m1(); // It will give you error.
		A a = new A();
		//m1();  // Again it will Gives you error;
		a.m1(); 
		//System.out.println("value of x from class A :"+x);   // It will Gives you error  
		System.out.println("value of x from class A :"+a.x);
		System.out.println("Value of z from class B "+z);
		System.out.println("m2 method of ------- B");
	}

}
