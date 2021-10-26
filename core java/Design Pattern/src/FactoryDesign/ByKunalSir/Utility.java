package FactoryDesign.ByKunalSir;

public class Utility {
	public static I2 m1() {   // Here We create method (Intereface/class Return type) 
		//and returning there child class/or implemented classs
		// We all do this for Hiding implemented class (A2), I dont want to disclose A2.
		// Thats it.
		
		return new A2();  // Implemented class.
	}

}
