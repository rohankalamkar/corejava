package OOPs.Introduction.Day1.ByHiteshSir.Polymorphism.Overloading.MethodOverloading.Narrowing;

public class Test3 {
	public void m1(A3 a) {
		System.out.println("m1-----A3 : "+a);
	}
	public void m1(B3 b) {
		System.out.println("m1-----B3 : "+b);
	}
	public void m1(C3 c) {
		System.out.println("m1-----C3 : "+c);
	}
	
	
	public static void main(String[] args) {
		
//		Test3 t = new Test3();
//	
//		B3 b = new B3();
//		t.m1(b);
//		
//		System.out.println("1.---------------------------------");
//		B3 b1 = new C3();
//		t.m1(b1);
//		System.out.println("2.---------------------------------");
		
		
		A3 a = new A3();
		a.m1(35);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		
		
	
	}

}
