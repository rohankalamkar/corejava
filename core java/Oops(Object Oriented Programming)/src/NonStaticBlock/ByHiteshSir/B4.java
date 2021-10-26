package NonStaticBlock.ByHiteshSir;

public class B4 {
	static {
		A4 a = new A4();
		System.out.println("static Block----B2");
	}
	public B4() {
		System.out.println("COnstructor ======== B2 ");
	}
	{
		System.out.println("Non Static Block----B2");
	}
	public static void main(String[] args) {
		System.out.println("Main ------------- Start");
		
		
		
	}

}
