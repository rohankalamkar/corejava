package StaticKeyWord.ByHiteshSir;

public class B7 {
	static {
		System.out.println("Static -----B7-----Block");
	}
	A7 a = new A7();
	public static void main(String[] args) {
		System.out.println("main-----------Start");
		B7 b = new B7();
		
		
	}

}
//Output : After Comment : 
//Static -----B7-----Block
//main-----------Start

//Output : After Uncomment
//Static -----B7-----Block
//main-----------Start
//static-----A7----Block

