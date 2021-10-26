package StaticKeyWord.ByKunalSir;

public class A2 {
	static {
		System.out.println("Static -------- Block  -------");
	}
	public static void main(String[] args) {
		
		A2 a = new A2();
		A2 a1 = new A2();
		A2 a2 = new A2();
		
	}

}
// output : Static -------- Block  -------

// static method execute only one time when object declared