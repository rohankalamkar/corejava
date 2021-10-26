package Abstraction.Interface.Day1.ByKunalSir;

public class A1 implements I1{
//	void m1() {                              // Error: Cannot reduce visibility of m1()
//		System.out.println("m1 ------A");    // Because in I1...m1() method is public(greater)  in here we write default(Weaker) not allowable
//	}
	
	
	// By implements I1    ... 
	// You have Compulsory to implement all abstract methods of I1 else it will gives you error
	public void m1() {
		System.out.println("m1--------A1");
	}
	public void m2() {
		System.out.println("m2--------A1");
	}
	public void m3() {
		System.out.println("m3--------A1");
	}


}
