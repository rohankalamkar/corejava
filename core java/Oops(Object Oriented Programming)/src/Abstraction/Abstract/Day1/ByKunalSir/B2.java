package Abstraction.Abstract.Day1.ByKunalSir;

abstract public class B2 extends A2 {
   // If we dont want to execute m2() form A2. 
	// solution : Then we make B2 class as abstract class and after that we extends B2 class in normal class 
	@Override
	public void m1() {
		System.out.println("m1-------B2");
		
	}



}
