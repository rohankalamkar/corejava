package Abstraction.Interface.Day2.ByHiteshSir;

public class A implements I1 {
	public static void main(String[] args) {
		A a =new A();
		a.m1();
		a.m2();
		
		
	}

	@Override
	public void m2() {
		System.out.println("m2------A");
		
	}

	@Override
	public void m1() {
		System.out.println("m1------A");
		
	}

}
