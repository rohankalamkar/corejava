package Abstraction.Abstract.Day1.ByHiteshSir;

public abstract class B1 extends A1 {

	@Override
	public void m1() {
		//super.m1();   // Cannot directly invoke the abstract method m1() for the type A1
		              // It means We cannot call unimplemented abstract method from Abstract class
		System.out.println("void-----m1-----B1");
		
	}

	@Override
	public void m1(int i) {
		System.out.println("Int -----m1-----B1 : "+i);
		
	}

	@Override
	public int m4() {
		
		return 100;
	}

}
