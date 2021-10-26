package Encapsulation.Day1.ByKunalSir.Protected;

public class B {
	
	// Within Same Package  without Extending
	
	A a = new A();
	
	public void m1() {
		//System.out.println(x);  // Error : x cannot be resolved into Variable
		//System.out.println(y);  // Error : y cannot be resolved into Variable
		//System.out.println(z);  // Error : z cannot be resolved into Variable
		
		A a = new A();
		//System.out.println(x);  // Error : x cannot be resolved into Variable
		//System.out.println(y);  // Error : y cannot be resolved into Variable
		//System.out.println(z);  // Error : z cannot be resolved into Variable
		
		
		
	}

}
