package NonStaticBlock.ByHiteshSir;

public class B5 {
	static {
		A5 a = new A5();
		System.out.println("static Block----B5");
	}
	public B5() {
		System.out.println("COnstructor ======== B5 ");
	}
	{
		System.out.println("Non Static Block----B5");
	}
	public static void main(String[] args) {
		System.out.println("Main--------------Start");
		
	}

}
//Output
//Non Static Block----B5
//COnstructor ======== B5 
//Static ----Block---A5
//Non-Static -----Block----A5
//Constructor of-----A5
//static Block----B5
//Main--------------Start