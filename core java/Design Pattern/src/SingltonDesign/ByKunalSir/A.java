package SingltonDesign.ByKunalSir;

public class A {
	// Singltone Design pattern means Creating only single Memory throught the process
	// If we create different Object.. But create only single memory. it means Object share single memory
	// In factory pattern, For Different Object, they created different memory for them
	
	// Process For creating Singlton Object
	// step 1 : First make all constructors private : Which we cannot create Object oustide tha class
	// step 2 : Create private static class Object Globally, which can access within class only
	// step 3 : Create Static method(class return) which returning static class Object 
	
	private static A a = null;
	
	private A() {  // if constructor private then we cannot create object of class A outside the class
		
		
		
		
	}
	
	public static A m1() {   // static method class return type
		
		
		return a;   
	}
	
	
	public void m3() {
		System.out.println("m3----A---Singlton---PrivateConstructor.");
	}
	
	
	
}

class A_Main{
	
	public static void main(String[] args) {
		//A a = new A();  //Error : The constructor A() is not visible due to private
		
		A.m1();   // calling static method by using class name.
		
		A a1 = A.m1();  // Storing static method return value in A a1
		        // Now it becomes A a1 = null;    // returning null value
		
		System.out.println(a1.hashCode()); //NullpointerException  : You want to access null value.
		
		// Memory not allotted yet.. A a1 = null;
		// Memory allotted only by new A();  this format only
		// that is format should be A a1 = new A();
		
		//a1.m3();   // NullpointerException  : You want to access null value.
		
		
		
	}
	
	
}
	