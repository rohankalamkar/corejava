package Constructor.StackOverflowError.ByHiteshSir;

public class A1 {
	public A1() {
		System.out.println("Constructor------A1");
		A1 a = new A1();
	}
	public static void main(String[] args) {
		A1 a = new A1();
		
		
	}

}
// Output : Error

//Constructor------A1
//StackOverflowError