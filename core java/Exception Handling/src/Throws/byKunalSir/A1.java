package Throws.byKunalSir;

public class A1 {
	public void m1() {   // 1st way to handle error
	try {
		Class.forName("/Exception Handling/src/Throws/byKunalSir/A.java");
	}
	catch(ClassNotFoundException e) {
		System.out.println("Exception-------");
	}
	}

}
