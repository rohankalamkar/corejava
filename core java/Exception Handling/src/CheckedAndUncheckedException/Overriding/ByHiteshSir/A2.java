package CheckedAndUncheckedException.Overriding.ByHiteshSir;

import java.io.File;
import java.io.IOException;

public class A2 {

	
	public void m1() throws IOException  {
		System.out.println("M1------A2------Start");
		File f = new File("C://,abcdefsdgds.txt");
		f.createNewFile();
		System.out.println("M1------A2------End");
		
	}

}
