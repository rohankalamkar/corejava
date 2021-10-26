package CheckedAndUncheckedException.Overriding;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A1 {   // Checked Exception
	public void m1() throws IOException {
		FileReader fr = new FileReader("abc.txt");
	}
	

}
