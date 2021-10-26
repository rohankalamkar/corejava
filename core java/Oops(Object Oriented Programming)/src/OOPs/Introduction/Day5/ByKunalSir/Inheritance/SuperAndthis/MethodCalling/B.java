package OOPs.Introduction.Day5.ByKunalSir.Inheritance.SuperAndthis.MethodCalling;

public class B extends A{
	
	public void m1() {
		super.m1();
		System.out.println("m1-------B");
	}
	public void m2() {
		this.m1();
		System.out.println("1.----------------------------");
		m1();
		System.out.println("2.----------------------------");
		super.m1();
		System.out.println("3.----------------------------");
		System.out.println("m2-------B");
	}

}
