package Checked.MethodAndConstructor;

import java.io.FileNotFoundException;
import java.io.IOException;

public class B1 extends A1 {
	
//	public B1() throws IOException{
//		
//	}
	
//	public B1() throws FileNotFoundException{   // Error
//		
//	}
	
	public B1() throws Exception {  // No error // Here requires parent only 
		
	}
	
	public void m1(){  // You have to write here only specific IOException
		//super.m1();       // All error Happens here because of super keyword
	}
	
//	public void m1() throws Exception {  // Why it is throwing error:
//		
//		// if there is not error  and you have to make more than 2 subclasses then It will gives error also
//		// thats why, in method overriding you can use its child class and not their parent class
//		
//		
//		
//	}

}
