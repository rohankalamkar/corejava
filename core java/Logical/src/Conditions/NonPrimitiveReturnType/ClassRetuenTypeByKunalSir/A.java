package Conditions.NonPrimitiveReturnType.ClassRetuenTypeByKunalSir;

public class A {
	int x = 10;
	public A() {
		System.out.println("Constructor of A-------");
	}
	public void sum(A a) {
		System.out.println(a.x);  // 200
		a.x = 500;  
		System.out.println(a.x);   // 500
		
	}
public static void main(String[] args) {
	A a = new A();
	System.out.println(a.x);   // 10
	a.x = 200;
	System.out.println(a.x);  // 200
	
	a.sum(a);
	
	System.out.println(a.x);   // 500
	
}
}
