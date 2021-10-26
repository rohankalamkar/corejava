package NonStaticBlock.ByHiteshSir;

public class A2 {
	public A2() {
		System.out.println("Constructor of ------ A2");
	}
	static {
		System.out.println("Static ---Block----A2");
	}
	
	
	{
		System.out.println("Non Static ------Block..A2");
		
	}


}
