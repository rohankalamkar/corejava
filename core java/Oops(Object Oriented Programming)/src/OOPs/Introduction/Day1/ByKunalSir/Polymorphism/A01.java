package OOPs.Introduction.Day1.ByKunalSir.Polymorphism;

public class A01 {
	// Why we call method Overloading as Compile time polymorphism
	
	public void m1() {
		System.out.println("m1 of A01 ----Default");
		
	}
	public void m1(int i) {
		System.out.println("m1 of A01 -----Arg---Int : "+i);
	}
	public void m1(String s) {
		add();
		System.out.println("m1 of A01------Arg---String : "+s);
		System.out.println(10);
	}
	public static void add() {
	//	m1(); // cannot make non static reference in static reference
		System.out.println("static method of A01-----Add-----Default");
	}
	
	public static void main(String[] args) {
		
		A01 a = new A01();
		add();
		a.m1();
		a.m1(10);
		a.m1("XYZ");
	//	a.m1(20,30);  // It shows error. Because no such combination(int,int) method is present in class A01, Which is decided By COMPILER. 
		              // Therefore method Overloading is called as Compile time Polymorphism.
		
	}
	

}
