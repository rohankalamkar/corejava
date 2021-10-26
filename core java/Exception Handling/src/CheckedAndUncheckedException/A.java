package CheckedAndUncheckedException;

import java.io.File;

public class A {
	public static void main(String[] args) {
		File f = new File("ABC.txt");
		
		//f.createNewFile(); // Error : Unhandled exception type IOException
		        // Exception which are KNOWN to compiler is Called as Checked Exception 
		
		String s1 = args[0]; // Exception which are UNKNOWN to compiler is called as Unchecked Exception
		
		
	}

}
