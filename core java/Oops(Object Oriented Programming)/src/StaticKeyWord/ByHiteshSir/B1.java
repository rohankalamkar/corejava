package StaticKeyWord.ByHiteshSir;

public class B1 {

	static {
		System.out.println("Static---Block----B1");
	}
	{
		System.out.println("Non Static----Block----B1");
	}
	public B1() {
		System.out.println("Constructor -----B1");
	}
	A1 a = new A1();
	public static void main(String[] args) {
		System.out.println("Main-------Start.");
		B1 b = new B1();
		
		
	}

}
//Without extends : 
//Static---Block----B1
//Main-------Start.
//Non Static----Block----B1
//Static ---- Block ----A1
//Non static-------- Block ------- A1
//Constructor ------   A1
//Constructor -----B1


//With extends
//Static ---- Block ----A1
//Static---Block----B1
//Main-------Start.
//Non static-------- Block ------- A1
//Constructor ------   A1
//Non Static----Block----B1
//Non static-------- Block ------- A1
//Constructor ------   A1
//Constructor -----B1


