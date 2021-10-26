package SingltonDesign.ByKunalSir;

public class A2 {
	
	// Singltone Design pattern means Creating only single Memory throught the process
			// If we create different Object.. But create only single memory. it means Object share single memory
			// In factory pattern, For Different Object, they created different memory for them
			
			// Process For creating Singlton Object
			// step 1 : First make all constructors private : Which we cannot create Object oustide tha class
			// step 2 : Create private static class Object Globally Which can be access within class
			// step 3 : Create Static method(class return) which returning static class Object 
		    // and returning object must be static reference
		
		// if returning object is non static reference it will Become factory Pattern..
		// return new A(); is not allowed here. because it will create different memory for every Object
		// It will always create new Memory for that like Factory pattern
		
		// Conclusion is :
		// Return object must be static class reference only
		// A1 a  = new A1();
		// here a is static reference
	
	
	private static A2 a = null;
	
	
	private A2() {
		
	}
	
	
	public static A2 m1() {   // here A2 a = null;
		
		if(a==null) {
			a=new A2();    // it becomes here A2 a = new A2();
		}
		
		return a; 
	}
	
	public void m3() {
		System.out.println("m3-----A2----void----non static");
		System.out.println("a:..in A2--- Hashcode : "+a.hashCode());
	}
	
	
	
	
	
	
	

}
