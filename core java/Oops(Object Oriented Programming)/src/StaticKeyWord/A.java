package StaticKeyWord;

public class A {
	int x =10;
	static int y =10;
	
	public void add() {
		y = 15;
		System.out.println("add method of A ");
	}
	
	public static void main(String[] args) {
		//System.out.println(x);
		System.out.println(y);
		System.out.println("1.------------------");
		y=20;
		System.out.println(y);
		System.out.println("2.------------------");
		A a = new A();
		System.out.println(a.x + " "+ y);
		a.x=50;
		System.out.println(a.x + " "+ y);
		System.out.println(a.x + " "+ a.y);
		System.out.println("3.-------------------");
		
		
		A a1 = new A();
		System.out.println(a1.x + " "+ y);
		a1.x=100;
		System.out.println(a1.x + " "+ y);
		y = 30;
		System.out.println(a1.x + " "+ a.y);
		System.out.println("4.-------------------");
		
		A a2 = new A();
		
		System.out.println(a2.x + " "+ y);
		a2.x=200;
		
		y = 65;  // or you can set like a2.y = 65 
		System.out.println(a2.x + " "+ y);
		a.y= 90;
		System.out.println(a2.x + " "+ a2.y);
		System.out.println("5.-------------------");
		
		
	}
	

}
