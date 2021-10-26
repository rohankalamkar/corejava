package FactoryDesign.ByKunalSir;

public class Test1 {
	public static void main(String[] args) {
		A1 a = new A1();  // Normal Object Creation
		
		System.out.println("Normal a : Hashcode : "+a.hashCode());
		a.m1();
		A1 ab = a.m1();
		ab.m3();
		System.out.println("ab : Normal : Hashcode."+ab.hashCode());
		System.out.println("1.----------------------------------------------");
		A1 x =A1.m1();  // Factory Object Creation   // It becomes A1 x = new A1();
		System.out.println("Factory Object x = Hashcode : "+x.hashCode());
		x.m3();
		System.out.println("1___________________________________________________");
		
		
		
		A1 a1 = new A1();  // Normal Object Creation
		System.out.println("Normal a1 : Hashcode : "+a1.hashCode());
		A1 a1b =a1.m1();
		System.out.println("a1b : Normal : Hashcode. : "+a1b.hashCode());
		System.out.println("2.-----------------------------------------------");
		A1 y=A1.m1();  // Factory Object Creation   // it becomes A1 y = new A1();
		System.out.println("Factory Object y : Hashcode : "+y.hashCode());
		y.m3();
		System.out.println("2___________________________________________________");
		
		
		A1 a2 = new A1();  // Normal Object Creation
		System.out.println("Normal a2 : Hashcode : "+a2.hashCode());
		a2.m1();
		System.out.println("3.----------------------------------------------------");
		
		A1 z = A1.m1();   // Factory Object Creation   // It becomes A1 z = new A1();
		System.out.println("Factory Object z = Hashcode : "+z.hashCode());
		z.m3();
		System.out.println("3._____________________________________________________");
		
		
	}

}
