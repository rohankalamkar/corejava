package Checked.MethodAndConstructor;

import java.io.File;
import java.io.IOException;

public class A {
	
	public void m1() throws IOException {
		File f = new File("abc.txt");
		f.createNewFile();
	}
	
	
//	public A() throws IOException {
//		
//		File f = new File("abc.txt");
//		f.createNewFile();
//		
//	} // This will gives You an error : 
	// Default constructor cannot handle exception type IOException thrown by implicit super constructor. Must define 
	// an explicit constructor
	
	

}
