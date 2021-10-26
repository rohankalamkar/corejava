package OOPSTestByKunalSir;

import java.io.IOException;

public class B extends A{
	public B()throws RuntimeException {
		
	}
	public B(String s) {
		System.out.println("Constr...");
		
	}
	public B(Object o) {
		System.out.println("34514");
	}
	public void m2(Object o) {
		System.out.println("m2----B----Object");
		
	}
	public void m2(A a) {
		System.out.println("m2----B---A");
	}
	public void m2(String s) {
		System.out.println("M2----B----String");
	}
public static void main(String[] args) {
	B a = new B((Object)null);
	int i = 0;
	//a.m2(null);   // Ambiguity error
	
	a.m2((Object)null);
	a.m2((A)null);
	a.m2((String)null);
	
//	do {
//		System.out.println(i);
//		i++;
//	}while(i<5);
	
	
}
}
