package OOPs.Introduction.Day5.ByHiteshSir.Inheritance.SuperAndthis;

public class B extends A {
	public void m1() {
		String s = super.m1("PQR");
		System.out.println(s);
		super.m1();
		System.out.println("m1-------B");
	}
	public void m2() {
		m1();
		this.m1();
		super.m1();
	}

}
