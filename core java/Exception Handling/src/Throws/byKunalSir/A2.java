package Throws.byKunalSir;

public class A2 {  // 2nd way to handle exception by using throw keyword
	
	public void m1() throws ClassNotFoundException {
		Class.forName("/Exception Handling/src/Throws/byKunalSir/A.java");
	}
	public void m2() {
		try {
			m1();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
