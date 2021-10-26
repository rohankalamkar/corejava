package NonStaticBlock.ByHiteshSir;

public class B2 {
	//A2 a = new A2();
	static {
		System.out.println("static Block----B2");
	}
	
	//A2 a = new A2();
	public B2() {
		System.out.println("COnstructor ======== B2 ");
	}
	{
		System.out.println("Non Static Block----B2");
	}
	A2 a = new A2();
	public static void main(String[] args) {
		System.out.println("Main --------- Start");
		B2 b = new B2();
		
		
	}

}

// see next class A3 and B3 and A2 object positions     . And see B2.class file


//static Block----B2
//Main --------- Start
//Static ---Block----A2
//Non Static ------Block..
//Constructor of ------ A2
//Non Static Block----B2
//COnstructor ======== B2 