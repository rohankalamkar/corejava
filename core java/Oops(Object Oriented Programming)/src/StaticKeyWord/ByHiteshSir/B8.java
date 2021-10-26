package StaticKeyWord.ByHiteshSir;

public class B8 {
	static {
		System.out.println("Static-----Block-----B8");
	}
	public void m1() {
		A8 a = new A8();
		
	}
	public static void main(String[] args) {
		System.out.println("Main-------------Start");
		
		
//		B8 b = new B8();      //
//		b.m1();               //
//		A8 a = new A8();      //
		
		
	}

}
//Output : After comment
//Static-----Block-----B8
//Main-------------Start

//Output : After Uncomment 
//Static-----Block-----B8
//Main-------------Start
//static------Block-----A8

