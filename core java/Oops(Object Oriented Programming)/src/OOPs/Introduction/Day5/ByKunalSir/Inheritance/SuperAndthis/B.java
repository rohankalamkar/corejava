package OOPs.Introduction.Day5.ByKunalSir.Inheritance.SuperAndthis;

public class B {
	public B() {
		this(2,3);
		System.out.println("Constructor ----B---Default");
	}
	public B(int i) {
		this("Rohan");
		System.out.println("Constructor ----B ------int: "+i);
	}
	public B(int i,int j) {
		this(6);
		System.out.println("Constructor ----B---Double Parameter : int i : "+i+" , int j : "+j);
	}
	public B (String s) {
		System.out.println("Constructor ----B-----String : "+s);
	}

}
