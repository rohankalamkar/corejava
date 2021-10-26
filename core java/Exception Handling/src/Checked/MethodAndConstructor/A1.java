package Checked.MethodAndConstructor;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A1 {
	
	public void m1() throws IOException {
		File f = new File("abc.txt");
		f.createNewFile();
	}
	
//	public A1() throws Exception {   
//		File f = new File("abc.txt");
//		f.createNewFile();
//		
//		// Writing it here is not recommendable
//	}
	
//	public A1() throws FileNotFoundException {
//	FileReader f = new FileReader("abc.txt");
//	}

}
