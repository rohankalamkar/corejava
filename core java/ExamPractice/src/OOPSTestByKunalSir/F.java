package OOPSTestByKunalSir;

public class F implements E{
	int x = 50;
	public  void m1() {
		System.out.println(x);
		System.out.println(E.x);
	}
	public static void main(String[] args) {
		F f = new F();
		f.m1();
	}

}
