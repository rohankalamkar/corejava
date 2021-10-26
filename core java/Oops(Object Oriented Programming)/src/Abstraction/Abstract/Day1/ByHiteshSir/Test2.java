package Abstraction.Abstract.Day1.ByHiteshSir;

public class Test2 {
	public static void main(String[] args) {
		
		C2 a = new C2();
		System.out.println(a.hashCode());
		System.out.println(a);
		System.out.println("1.-----------------------------------------------");
		
		A2 a1 = new C2();
		System.out.println(a1.hashCode());
		System.out.println(a1);
		System.out.println("2.---------------------------------------------");
		
		B2 b1 = new C2();
		System.out.println(b1.hashCode());
		System.out.println(b1.toString());
		System.out.println("3.----------------------------------------------");
		
		
	}

}
