package Conditions.ReturnTypeByKunalSir;

public class A {
	int x;
	public static void main(String[] args) {
		
		A a = new A();
		a.x = 100;
		
		System.out.println(a.x);    // 100
		
		B b = new B();
		b.m2(a);        // 100
		                // 200 
		
		System.out.println(a.x);        // 200  Value of x changed in b.m2() method...
                                        //Now for further Program value of x = 200
		                                // Here we Worked with Object memory to Object object memory
		
		
	}

}
