package TypesOfVariable.ByHiteshSir.Day1;

public class A {
	int x;  //Global Variable
	
	public void m1() {
		System.out.println(x); 
		int y=20 ;   // Local Variable   : It destroy in method, local variable has no existence outside the method
		System.out.println(y);
	}
	public static void main(String[] args) {
	//	System.out.println(x);     //Cannot make a static reference to the non-static field x
		
		A a = new A();
		a.x = 10;
		a.m1();
		
	//	System.out.println(y);     //  y cannot be resolved to a variable
		
	//	System.out.println(a.y);     // y cannot be resolved or is not a field 
		
		
	}

}
