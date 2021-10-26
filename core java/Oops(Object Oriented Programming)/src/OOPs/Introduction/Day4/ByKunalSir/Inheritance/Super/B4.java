package OOPs.Introduction.Day4.ByKunalSir.Inheritance.Super;

public class B4 extends A4 {
	public B4() {
		System.out.println("No arg Constructor of A4");
	}
	public B4(int i) {
		super(i);
		System.out.println("Arg Constructor of B4 ------int : "+i);
	}
	
	public B4(String s) {
		super(s);
		System.out.println("Arg Constructor of B4 ------String : "+s);
	}

}
