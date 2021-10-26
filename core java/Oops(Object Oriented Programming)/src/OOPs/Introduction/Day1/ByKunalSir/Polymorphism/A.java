package OOPs.Introduction.Day1.ByKunalSir.Polymorphism;

public class A {
	
	
	// Narrowing Example
	
	
	
	
	char x ='A';   // It has default value =      // doesnt show anything
	public A(char a) {
		System.out.println("Constructor of character.....");
	}
	
	public A(String s) {
		System.out.println("Constructor of A---- String....");
	}
	public A(Object o) {
		System.out.println("Constructor of A---- Object");
	}
	public void m1(char A) {
		System.out.println("m1 method of A------Char : "+A);
	}
	public void m1(Object o) {
		System.out.println("m1 methof of A------Object");
	}
	public void m1(String s) {
		System.out.println("m1 method of A------String : "+s);
	}
	public static void main(String[] args) {
		
		A a = new A(null);   // Here String Constructor will print   // It means it will print child Constructor as well as child method
		System.out.println("1.--------------------------------------------");
		a.m1(null);       // Here String method will print   // It will print ChildMethod when passing default Argument
		System.out.println("2.--------------------------------------------");
		System.out.println(a.x);
	}
	

}
