package NonStaticBlock.ByHiteshSir;

public class A3 {
	static {
		System.out.println("Static ----Block---A3");
	}
	public A3() {
		System.out.println("Constructor of-----A3");
	}
	{
		System.out.println("Non-Static -----Block----A3");
	}

}
