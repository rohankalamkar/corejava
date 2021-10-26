package Abstraction.Abstract.Day1.ByKunalSir;

abstract public class A {
	
	int x ;      // Instance Variable i.e. Global 
	
	public A() {    // Yes Abstract class contains constructor to initialize Global Instance Variable
		x = 10;
		System.out.println("Constructor of -------A");
	}
	
	void m1() {
		
	}
	// Abstract Class also known as Partial Abstraction
	// while Interface also known as 100% Abstraction
	
	
	//void m2();  // Method require body and once we apply body here, it converted to implemented class like m1() not an abstract class 
	
	
	//abstract void m1();   // Duplicate method
	
	abstract void m2();  //  Here it is a default void m2(); unimplemented
						// For creating unimplemented method, you have compulsory write abstract. Access modifier we can select here
	                     // Access modifier we can apply here according we need.
						// but in case of Interface, all unimplemented methods are bydefault public abstract void.
						//We cannot change there, not an access modifier,even not an non access modifier 
						// Access modifier are Public>Protected>Default>Private
						// Non Access modifier are static, final, abstract, strictfp
	
	public abstract void m3();
	
	public abstract void m3(int x); // Yes we can overload abstract method. i.e. Unimplemented method
	
	protected abstract void m4();
	
	//private abstract void m5();  //Error:  Modifier can change their places but before void
	
	// public final abstract void m6();  //Error: The abstract method m6 in type A can only set a visibility modifier, one of public or protected
	 
	// public static abstract void m7();  // Error : The abstract method m6 in type A can only set a visibility modifier, one of public or protected
	
	// static , final , private cannot be Overrided ..therefore they giving error here
	

	
	
	

}

//final abstract class  B{
	// Error : The class B can be either abstract or final, not both
	
	// in future there is abstract method in A class and for implementing this method we have to create child class 
	// of class but this is not possible final keyword hence we cannot declare abstract with final keyword
	
	// we cannot declare class final with abstract keyword
	
	
	
//}



//  See  A.class file
