package FactoryDesign.ByKunalSir;

public class A2 implements I2 {

	@Override
	public void m1() {   
		System.out.println("m1-----A1----Void");
		
	}
// here I dont want to disclose my implemented class ,
	// for that we use Factory Pattern.
	// We create object through static  method(class return type)
	// In factory method: we can create different object with different memory(Hashcode)
}
