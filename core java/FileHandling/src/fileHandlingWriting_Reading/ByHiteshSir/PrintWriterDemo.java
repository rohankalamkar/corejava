package fileHandlingWriting_Reading.ByHiteshSir;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("abcPrint.txt");
		// If File not Present it will create that new file 
		// or Will write in existing file
		
		//PrintWriter pw1 = new PrintWriter("abc.txt",true);
		// append option is not available in PrintWriter
		
		// So jugaad is 
		PrintWriter pw2 = new PrintWriter(new FileWriter("abcPrintNew.txt",true));
		pw2.println("I am Rohan");
		pw2.println(10);
		pw2.println("ARS Venture");
		
		pw2.flush();  // It also requires here
		
		// For Writing : We use PrintWriter class is best
        // For Reading : BufferedReader class is best		
		
	}

}
