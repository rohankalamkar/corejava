package Encapsulation.Day1.ByKunalSir.Protected;

public class C extends A {
	// Within Same Package with extends 
	A a = new A();
	
	public void m2() {
		System.out.println(x);  // 10
		System.out.println(y);  // 20
		System.out.println(z);  // 30
		System.out.println(a.z); // yes... Within same Packages we can call by Parent object.
		                         //  But for outside the package, protected variables we can call through only Child class Object
	}

}
