package NonStaticBlock.ByHiteshSir;

public class A4 {
	static {
		System.out.println("Static ----Block---A4");
	}
	public A4() {
		System.out.println("Constructor of-----A4");
	}
	{
		System.out.println("Non-Static -----Block----A4");
	}

}
