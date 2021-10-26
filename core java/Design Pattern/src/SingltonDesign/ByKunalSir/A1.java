package SingltonDesign.ByKunalSir;

public class A1 {
	
	// Singltone Design pattern means Creating only single Memory throught the process
		// If we create different Object.. But create only single memory. it means Object share single memory
		// In factory pattern, For Different Object, they created different memory for them
		
		// Process For creating Singlton Object
		// step 1 : First make all constructors private : Which we cannot create Object oustide tha class
		// step 2 : Create private static class Object Globally which can access within class only
		// step 3 : Create Static method(class return) which returning static class Object 
	    // and returning object must be static reference
	
	// if returning object is non static reference it will Become factory Pattern..
	// return new A(); is not allowed here. because it will create different memory for every Object
	// It will always create new Memory for that like Factory pattern
	
	// Conclusion is :
	// Return object must be static class reference only
	// A1 a  = new A1();
	// here a is static reference
	
	
	private static A1 a = new A1();   // Step 2 : only Static method can access this object
	
	private A1 (){  //for not creating object outside the class
		// Step 1
	}
	
	
	
	public static A1 m1() {
		
		return a;   // Step 3 : Returning object must be static reference only
		// return new A1();  // Both are not same , It will create different Memory. It becomes Factory Object
	}
	
	
	public void m3() {
		System.out.println("a : Hashcode : "+a.hashCode());
		System.out.println("m1---non static---A1---return...");
		
	}
	
	
	
//	public static void main(String[] args) {
//		
//		System.out.println("a :static :   "+a.hashCode());  //  We can access a object.
	
	// static context in static method
//		
//	}
	

}

class A1_main{
	public static void main(String[] args) {
		
		A1.m1();   // calling static return type method
		
		A1 x = A1.m1();  // Storing return value in x reference
		// Now it becomes  A1 x = new A1();
		
		System.out.println("x: Hashcode : "+x.hashCode());
		x.m3();
		
		System.out.println("---------------------------------------------------");
		
		A1 y = A1.m1();
		System.out.println("y : Hashcode :  "+y.hashCode());
		y.m3();
		
		
		
		
		
		
		
	}
	
	
	
	
}



