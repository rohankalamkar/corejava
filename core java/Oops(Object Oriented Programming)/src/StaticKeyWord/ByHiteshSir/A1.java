package StaticKeyWord.ByHiteshSir;

public class A1 {
	static {
		System.out.println("Static ---- Block ----A1");
	}
	{
		System.out.println("Non static-------- Block ------- A1");
	}
	public A1() {
		System.out.println("Constructor ------   A1");
	}
	

}
