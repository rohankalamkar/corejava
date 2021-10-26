package Conditions.ReturnTypeByKunalSir;

public class B {
	public void m2(A a1) {
		System.out.println(a1.x);
		a1.x = 200;    //Now From here  value of x  = 200 for future work
		System.out.println(a1.x);
	}

}
