package StaticKeyWord.ByHiteshSir;

public class A2 {
	static {
		System.out.println("Static ---- Block ----A2");
	}
	{
		System.out.println("Non static-------- Block ------- A2");
	}
	public A2() {
		System.out.println("Constructor ------   A2");
	}

}
