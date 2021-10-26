package Throws.byHiteshSir;

public class A {
	
	
	public void m1() throws ClassNotFoundException {
		m2();
	}
	public void m2() throws ClassNotFoundException {
		m3();
	}
	public void m3() throws ClassNotFoundException {
		Class.forName("/Exception Handling/src/Throws/byKunalSir/A.java");
	}
	public static void main(String[] args) throws ClassNotFoundException{
		
		A a = new A();
		a.m1();   // Here it will not give any compilation error but during Run it will give Exception
		
	}

}
