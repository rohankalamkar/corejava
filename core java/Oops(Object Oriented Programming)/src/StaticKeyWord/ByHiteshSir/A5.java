package StaticKeyWord.ByHiteshSir;

public class A5 {
	static int x;
	static int x1;
	static String s;
	
	static {
		x =10;
		x1=40;
		s="ABC";
		
	}
	public static void main(String[] args) {
		System.out.println(x);
		System.out.println(x1);
		System.out.println(A5.s);
	}

}
