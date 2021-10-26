package OOPs.Introduction.Day5.ByHiteshSir.Inheritance.SuperAndthis;

public class B3 extends A3 {
	
	int x = 20;
	
	
	public void m1() {
		int x = 30;
		
		System.out.println(x);       // 30  : Local variable of same class
		System.out.println(this.x);  // 20  : Global Variable of same class   (this keyword is used for Global variable of same class)
		System.out.println(super.x); // 10  : Global Variable of Parent Class (super keyword is used for Glabal variable for Parent Class)
	}
	public static void main(String[] args) {
		
		//System.out.println(x); // We cannot access non-static x  in static method  
		//System.out.println(this.x); // We cannot use this keyword in static context 
		//System.out.println(super.x); // We cannot use super keyword in static context
		
		
		B3 b = new B3();
		b.m1();
	}

}
