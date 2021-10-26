package OOPs.Introduction.Day5.ByKunalSir.Inheritance.SuperAndthis.ValueCalling;

public class B extends A{
	int x = 20;
	public void m1() {
		int x = 30;
		System.out.println("Local Variable of method m1 of A : "+x);
		System.out.println("Global Varible of A : "+this.x);
		System.out.println("Global Variable of B : "+super.x);
	}

}
