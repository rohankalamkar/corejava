package OOPs.Introduction.Day1.ByKunalSir.Inheritance;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("class B1      (child class) extends class A1     (parent class) here :");
		
		B1 b  = new B1();
		System.out.println("Main Method value of z from B1 : "+b.z);
		System.out.println("Main Method value of x from A1 : "+b.x);  // We can use variable of A1 directly
		b.m2();  
		b.m1();   // m1() method is directly use in 
		
	}

}
