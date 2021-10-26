package StaticKeyWord.ByHiteshSir;

public class B3 extends A3 {
	static {
		System.out.println("Static---Block----B3");
	}
	{
		System.out.println("Non Static----Block----B3");
	}
	public B3() {
		System.out.println("Constructor -----B3");
	}
	public static void main(String[] args) {
		System.out.println("Main -----------Start");
	
	
	
	}

}
