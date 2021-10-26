package StaticKeyWord.ByHiteshSir;

public class B2 extends A2 {
	static {
		System.out.println("Static---Block----B2");
	}
	{
		System.out.println("Non Static----Block----B2");
	}
	public B2() {
		System.out.println("Constructor -----B2");
	}
	public static void main(String[] args) {
		System.out.println("Main-----------Start");
		B2 b = new B2();
		
		
	}

}
//Without extends
//Static---Block----B2
//Main-----------Start
//Non Static----Block----B2
//Constructor -----B2

//With extends 
//Static ---- Block ----A2    (because of super keyword in static block)
//Static---Block----B2
//Main-----------Start
//Non static-------- Block ------- A2
//Constructor ------   A2
//Non Static----Block----B2
//Constructor -----B2