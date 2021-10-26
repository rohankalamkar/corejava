package fileHandlingWriting_Reading.ByHiteshSir;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("abcfileWriterDemo.txt");
		// If this file is not available in directory the FileWriter Create it. Not need to call createNewFile() method
		// if this file is already present in directory, Then FileWriter Creates that file 
	
		
		fw.write(10);
		fw.write("ABC");
		char []ch = {'P','Q','R','%'};
		fw.write(ch);
		fw.write("\n"); //Main Disadvantage : For Next line We have no methods, we have to write manually
		// To OverCome this Disadvantage We Use BufferedWriter to Write in file
		// Because BufferedWriter has inbuilt newLine() method to move on next line 
		
		
		
		fw.write("My Name is Rohan\n");
		fw.write("Happy Birthday");
		fw.flush();
		System.out.println("Data Added..");
		
		FileWriter fw1 = new FileWriter("abcfileWriterDemo.txt",true);
		// append is true here, default value of append is false
		// Meaning of true is keep old data and add new data in that,
	    // if append is false, old data got erased, and only new data printed every time
		
		
		
	}

}
