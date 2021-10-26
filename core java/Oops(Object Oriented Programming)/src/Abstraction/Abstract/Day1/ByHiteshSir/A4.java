package Abstraction.Abstract.Day1.ByHiteshSir;

public abstract class A4 implements I4{
	
	int x = 20;
	
	@Override
	public void start() {
	System.out.println("start----engine----A4");
	}
	@Override
	public abstract void m1();
	
	public void m2() {
		System.out.println("m2------A4");
	}

}
