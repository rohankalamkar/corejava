package Constructor.StackOverflowError.ByHiteshSir;

public class A2 {
	public A2() {
		System.out.println("Constructor of------A2");
		A2 a = new A2();
	}

}
