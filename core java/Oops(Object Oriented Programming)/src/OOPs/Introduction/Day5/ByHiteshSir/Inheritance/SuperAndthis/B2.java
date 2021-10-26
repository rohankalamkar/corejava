package OOPs.Introduction.Day5.ByHiteshSir.Inheritance.SuperAndthis;

public class B2 extends A2{
	public void m1() {
		int i = super.R1(40);
		System.out.println("m1----B2------R1(A2) : "+i);
		System.out.println("m1 of B2------Void-----Default");
	}
	public void m1(int i ) {
		System.out.println("m1 of B2------Void-----int : "+i);
	}
	public void m1(String s) {
		System.out.println("m1 of B2------Void-----String : "+s);
	}
	public int R1() {
		System.out.println("R1 of B2------Return---Default");
		return 20;
	}
	public int R1(int r) {
		int x = this.R1();
		System.out.println("R1---of B2---Return--R1(B2) : "+x);
		System.out.println("R1 of B2------Return----Int : "+r);
		return r;
	}
	public String R1(String s) {
		super.m1(100);
		
		System.out.println("R1 of B2------Return----String : "+s);
		return s;
	}

}
