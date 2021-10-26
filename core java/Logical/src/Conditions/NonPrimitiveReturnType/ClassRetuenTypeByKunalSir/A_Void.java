package Conditions.NonPrimitiveReturnType.ClassRetuenTypeByKunalSir;

public class A_Void {
	int x  = 10;
	public void m2 (A_Void a) {
		System.out.println("method A_Void----1. :  "+a.x);
		
		a.x = 500;
		System.out.println("method A_Void----2. :  "+a.x);
	}
	public static void main(String[] args) {
		
		A_Void a  = new A_Void();
		System.out.println("Normal : "+a.x);
		a.x = 100;
		System.out.println("Main Starting : "+a.x);
		
		
		a.m2(a);  // Void method Calling
		System.out.println("After Comes out of method value of x : "+a.x);
		
		
	}

}
