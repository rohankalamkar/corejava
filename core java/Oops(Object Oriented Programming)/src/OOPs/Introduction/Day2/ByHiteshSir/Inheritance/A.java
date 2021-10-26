package OOPs.Introduction.Day2.ByHiteshSir.Inheritance;

public class A {
	public A m1() {
		A a = new A();
		return a;
	}
	public static void main(String[] args) {
		A a = new A();
		A b = a.m1();
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
