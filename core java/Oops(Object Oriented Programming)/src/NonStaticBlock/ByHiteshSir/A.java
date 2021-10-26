package NonStaticBlock.ByHiteshSir;

public class A {
	
	public A() {
		System.out.println("Constructor of ------ A");
	}
	static {
		System.out.println("Static ---Block----A");
	}
	
	
	{
		System.out.println("Non Static ------Block..");
		
	}

	public static void main(String[] args) {
		System.out.println("Main----------- Start");
		
		A a = new A();
	}
	

}
