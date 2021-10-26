package FactoryDesign.ByKunalSir;

public class A1 {
	//A1 a = new A1();  // If we write Globally and After we create New Object.It will create Error: stackOverFlow
	// Design Pattern
	
	// Factory Design Pattern : 
	// Use : 1. less memory utilization(We achive this by making it static)
	//       2. And Code Will be optimized(It means we cannot disclose our implemented class)

	
	// In factory Method : 
	// here We create Object Through Static return method , return class object
	// Every Object has it's own Hashcode, Means Every Object Has different Hashcode
	
	public static A1 m1() {
		A1 c = new A1();
		System.out.println("m1----A1---static---Return");
		//return new A1();  //1st way. here We return class Constructor
		return c;     // 2ny way
		//return a;  // We cannot call non static context in static method
	}
	
	public void m3() {
		System.out.println("m3--------A1----Non Static---Void");
	}
	
}
