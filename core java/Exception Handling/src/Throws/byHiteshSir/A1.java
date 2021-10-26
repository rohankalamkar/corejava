package Throws.byHiteshSir;

import java.io.IOException;

public class A1 {
	public A1() throws ClassNotFoundException ,IOException{
		
	}

	
	public void m1() {
		m2();
	}
	public void m2() {
		m3();
	}
	public void m3() {
		//Class.forName("/Exception Handling/src/Throws/byKunalSir/A.java");
	}

}
