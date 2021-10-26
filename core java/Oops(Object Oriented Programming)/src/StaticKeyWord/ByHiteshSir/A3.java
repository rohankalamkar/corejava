package StaticKeyWord.ByHiteshSir;

public class A3 {
	static {
		System.out.println("Static ---- Block ----A3");
	}
	{
		System.out.println("Non static-------- Block ------- A3");
	}
	public A3() {
		System.out.println("Constructor ------   A3");
	}

}
