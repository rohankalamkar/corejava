package OOPs.Introduction.Day3.ByKunalSir.Inheritance.CovarientReturnType;

public class Test {
	
	public A m1() {
		A a = new A();
		B b = new B();
		C c = new C();
		
		//return a;      // Valid
		//return b ;      // Valid
		return c ;      // Valid
	}
	
	public B m2() {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
	//	return a;   // Error: Cannot convert A to B
	//	return b ;   // Valid
		return c ;   // Valid
		
	}
	
	public C m3() {
		A a = new A();    
		B b = new B();
		C c = new C();
		
	//	return a;  // Error: Cannot convert A to C
	//	return b ; // Error: Cannot convert B to C
		return c ; // Valid 
		
	}
	
	

}
