package CheckedAndUncheckedException;

import java.io.File;
import java.io.IOException;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;

public class A1 {
	public static void main(String[] args) {
		File f = new File("abc.txt");
		
		try {
			f.createNewFile();
			Class.forName("/Exception Handling/src/CheckedAndUncheckedException/A.java");
		} catch (IOException e) {
			System.out.println("asadfdff");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("HAPPY BIRTHDAY");
			//e.printStackTrace();
		}
		System.out.println("Main-----End");
		
		
	}

}
