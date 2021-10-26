package Unchecked.MethodAndConstructor;

import java.io.IOException;

public class B extends A {
	public void m1() {  // No error.   If you Inheritate it
		
	}
//	public B() throws RuntimeException{  // It will not gives you error
//		
//	}
//	public B() throws IOException {
//		
//	}
	
//	public B() throws Exception {
//		
//	}
//	public B() throws Throwable{
//		
//	}
	
	
// If in child has no constructor and if you throws Exception in Parent then
	// Default constructor cannot handle exception type Exception thrown by implicit super constructor. Must define an explicit 
	// constructor
}
