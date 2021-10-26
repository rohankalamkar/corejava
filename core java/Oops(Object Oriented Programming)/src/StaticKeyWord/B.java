package StaticKeyWord;

public class B extends A {
	// y = 100;   // Error 
	int x = 250;
	static int y = 500;
	
	public static void main(String[] args) {
		
		
		
		System.out.println(y);
		System.out.println("1.-------------------------");
		
		y = 95;
		
		A a = new A();
		System.out.println(a.x + " "+ a.y);
		System.out.println("2.--------------------------");
		a.add();
		System.out.println("3.--------------------------");
		System.out.println(y);
		System.out.println(a.x + " "+ a.y);
		
	}

}