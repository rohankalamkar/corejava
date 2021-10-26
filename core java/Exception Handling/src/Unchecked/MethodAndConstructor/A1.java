package Unchecked.MethodAndConstructor;

public class A1 {
	public void m1() throws ArithmeticException {
		System.out.println(10/0);
	}
//	public void m2() throws ArithmeticException {
//		System.out.println(50/0);
//	}
	public void m3() throws Exception {
		System.out.println(60/0);
	}
//	public void m4() throws ArithmeticException {
//		System.out.println(80/0);
//	}
	
	
	public A1() throws ArithmeticException {
		
	}
	

}
