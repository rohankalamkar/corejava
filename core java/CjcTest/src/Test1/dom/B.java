package Test1.dom;
import Test1.A;

public class B extends A {
	protected void m1()
	{
	System.out.println("M1---B");
	}
	public static void main(String[] args) {
	A a=new A();
	//a.m1(); // not compiled
	B b=new B();
	b.m1();   // compiled
	A a1=new B();
	//a1.m1();  // not compiled
	 }

}
