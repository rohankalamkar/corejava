package fileHandlingWriting_Reading.ByHiteshSir;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterfile {
	public static void main(String[] args) throws IOException {
		
		
	//	BufferedWriter bw = new BufferedWriter("abc.txt");  //Error:The constructor BufferedWriter(String) is undefined
		// BufferedWriter cannot communicate directly with file 
		// So BufferedWriter need Reference of FileWriter
		
		
		FileWriter fw = new FileWriter("abcWirter.txt",true); 
		// It is equals to // FileWriter fw = new FileWriter("abcWirter.txt");
		
		// If this file is not available in directory the FileWriter Create it. Not need to call createNewFile() method
		// if this file is already present in directory, Then FileWriter Creates that file
		BufferedWriter bw = new BufferedWriter(fw);  // Compulsary to pass FileWriter Reference in BufferedWriter
		
		//or
		
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("abcWirter.txt",true));
		
		// Both are same
		bw1.write(10);
		bw1.write("ABC");
		bw1.newLine(); //Main Advantageous than FileWriter.. it simile to bw1.write("\n")
		// Inbuilt method present in BufferedWriter for moving on next line
		bw1.write("I am NOOB Coder");
		char ch[]= {'X','Y','Z'};
		bw1.newLine();
		bw1.write(ch);
		bw1.flush();  // It allows File to write 
		// Without flush() method, write method is meaning less
		
		System.out.println("Data Added.");
		
		
		
		
	}

}
