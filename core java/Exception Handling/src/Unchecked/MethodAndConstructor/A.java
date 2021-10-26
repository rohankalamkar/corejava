package Unchecked.MethodAndConstructor;

public class A {
	
	public void m1() {
		System.out.println(10/0);
	}
	public A() throws ArithmeticException {
		
	}
	
//	public A() throws RuntimeException{
//		
//	}
	
//	public A() throws Exception {
//		
//	}
	

}


// Here We consider fully Unchecked Class Exceptions only Runntime, and Arithmetic

// Exception Class is Partially Unchecked and Partially Checked. So We Cannot considered here
// It will follows Heirarchy..parent child n all
