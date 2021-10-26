package NonStaticBlock.ByHiteshSir;

public class A5 {
	static {
		//B5 b = new B5();
		System.out.println("Static ----Block---A5");
	}
	public A5() {
		B5 b = new B5();
		System.out.println("Constructor of-----A5");
	}
	{
		System.out.println("Non-Static -----Block----A5");
	}
	

}
