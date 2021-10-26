package FactoryDesign.ByKunalSir;

public class Test2 {
	public static void main(String[] args) {
		// Here All Object has different memory
		// We make Utility class All this for just hiding implemented class(A2 here)
		// Factory Design
		//  All object has there Own Memory,
		
		
		Utility.m1();  // calling return method.
		
		I2 a = Utility.m1(); // Storing this object into I2 reference  // this is way of object creation
		                              // In this way we achieve Factory design pattern
		                 // Now it becomes I2 a = new A2();
		a.m1(); // Calling void method of m1();
		System.out.println("a : Hashcode : "+a.hashCode());
		
		A2 a1 =(A2)Utility.m1();  // Now it becomes
		a1.m1();                         // A2 a1 = new A2();
		System.out.println("a1 : haschod : "+a1.hashCode());
		
		I2 a2 = Utility.m1();  // I2 a2 = new A2();
		a2.m1();
		System.out.println("a2 : hashcode : "+a2.hashCode());
		
		
		
		
	}

}
