package Abstraction.Interface.Day1.ByKunalSir;

public interface I1 {
	void m1();    //  It is bydefault public abstract void m1();
//	public abstract void m2() {
//		
//	}    // Error: Abstract method do not specify the body
	
	public abstract void m2();   // You have to write like this in interface
	
	abstract public void m3();   // abstract and public can change their place Both are modifier. abstract(modifier) and public(access modifier)
	
}
