package CheckedAndUncheckedException;

import java.io.File;

import java.io.IOException;

public class A2 {
	public static void main(String[] args) {
		
		File f = new File("abc.txt");
		
		
		try {
			System.out.println("Try ------start");
			f.createNewFile();
			Class.forName("Exception Handling/src/CheckedAndUncheckedException/A1.java");
			
		}
		catch(IOException | ClassNotFoundException |ArithmeticException e) {
			System.out.println("Catch------Block");
		}
		finally {
			System.out.println("finally -----Block");
		}
		
		
	}

}
