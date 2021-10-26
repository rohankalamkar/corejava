package Override.Methods;

public class B extends A{
	@Override
	public void m1() {
		System.out.println("m1-----B---Default---Overrided");
	}
	
	@Override
	public int i1(int i) {
		System.out.println("m1-----B---Int---Overrided");
		return 10;
	}
	@Override
	public String s1(String s) {
		System.out.println("m1-----B----String----Overrided");
		return "XYZ";
	}
	@Override
	public B a(A a) {    // Class return type with child name but parameters are same  ...therefore Overrided
		return new B();
	}
	
	
	//@Override  // Error 
	public B a(B a) {
		return new B();
	}
	// Without Override it will also throws you error.
	//@Override   // Error : Cannot reduce the visibility of methods from A.m2    Public>Protected>Default>Private
//	protected void m2() {   // Error because visibility shifting from public to protected (i.e. Higher to Weaker) which is not allowable
	
//		
//	}
	@Override      // Here Override occurs due to visibility shifting from protected to public....(weaker to Higher) 
	public void m2(int i ) {
		
	}
	int p1(int i) {
		return i;
	}
	//@Override
	public void p2(int i) {
	
	}
	
	
	

}
