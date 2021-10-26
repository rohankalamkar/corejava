package NonStaticBlock.ByHiteshSir;

public class A1 {
	int x = 10;
	static {
		System.out.println("Static ---Block--A1");
	}
	{
		x = 20;
		System.out.println(x);
		System.out.println("Non Static Block--A1");
	}
	public A1() {
		x=30;
		System.out.println("Constructor-----A1");
	}
	public static void main(String[] args) {
		System.out.println("Main----------Start");
		A1 a = new A1();
		System.out.println(a.x);
		
		
	}

}
