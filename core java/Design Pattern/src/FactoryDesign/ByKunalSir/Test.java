package FactoryDesign.ByKunalSir;

public class Test {
	public static void main(String[] args) {
		
		// Normal Process We generally do for Creating calling Method By Creating Different Object.
		
		// Here HashCode Of All Object has Different memory 
		
		A a = new A();
		System.out.println("a  Hashcode: "+a.hashCode());
		a.m1();
		
		A a1 = new A();
		System.out.println("a1 Hashcode: "+a1.hashCode());
		a1.m1();
		
		A a2= new A();
		System.out.println("a2 Hashcode: "+a2.hashCode());
		a2.m1();
		
		
		
	}

}
