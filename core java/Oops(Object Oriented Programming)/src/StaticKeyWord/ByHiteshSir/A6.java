package StaticKeyWord.ByHiteshSir;

public class A6 {
	static {
		System.out.println("Static ----- Block 1");
	}

	public static void main(String[] args) {
		System.out.println("Main------start.");
		A6 a = new A6();
		a.m1();

	}
	static {
		System.out.println("Static-------Block2");
		
	}
	public void m1() {
		System.out.println("m1 method-------A6");
	}
	static {
		System.out.println("Static ------Block3");
	}
	
	
	
}
