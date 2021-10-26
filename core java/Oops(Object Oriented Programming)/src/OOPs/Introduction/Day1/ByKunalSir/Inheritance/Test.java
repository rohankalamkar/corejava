package OOPs.Introduction.Day1.ByKunalSir.Inheritance;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test method with class A and class B without extends");
		
		B b = new B();
		b.m2();
	//	b.m1(); // m1() method from class A is calling directly from class B object  // Gives you error
	//	System.out.println("x value from class A directly calling from class B Object in main method  : "+b.x);  // It will Gives you error
		System.out.println("y value from class B is Directly calling in main method : "+b.z);
		
	}

}
