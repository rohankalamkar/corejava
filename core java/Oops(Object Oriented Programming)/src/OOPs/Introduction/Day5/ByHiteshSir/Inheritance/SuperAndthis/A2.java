package OOPs.Introduction.Day5.ByHiteshSir.Inheritance.SuperAndthis;

public class A2 {
	public A2() {
		System.out.println("Constructor of A2-------Default.");
	}
	public void m1() {
		System.out.println("m1 method of A2-------Default");
	}
	public void m1(int i) {
		System.out.println("m1 method of A2 ----Void----int : "+i);
	}
	public void m1(String s) {
		System.out.println("m1 method of A2 ----Return----String : "+s);
	}
	public int R1(int r) {
		System.out.println("m1 method of A2 ----Return----Int : "+r);
		return r;
	}
	public int R1() {
		System.out.println("m1 method of A2 ----Return----No Arg : ");
		return 10;
	}
	public void add() {
		System.out.println("add method");
	}
	

}
