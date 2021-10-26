package fileHandlingWriting_Reading.ByHiteshSir;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileHandlingTask1 {
	
	public static void main(String[] args) throws Exception {
		// Task is some line already Written in First.txt file
		// We Have to Print First.txt data in Second.txt  with append
		
		//step 1 : First we have to Write in First.txt
		
		PrintWriter pw = new PrintWriter(new FileWriter("first.txt"));
		pw.println("Happy Birthday...");
		pw.println("Smoking is injurious to health.");
		pw.println("Hows you doing..");
		pw.println("Dont be fool..");
		pw.flush();
		
		FileReader fr = new FileReader("first.txt");
		BufferedReader br = new BufferedReader(fr);
		
		BufferedWriter bwn = new BufferedWriter(new FileWriter("Second.txt",true));
		
		String s = br.readLine();  // Reading line of First.txt and storing into String 
		                      // This String pass into Second.txt write() method to write in Second.txt
		while(s!=null) {
			bwn.write(s);  // Writing first.txt line in Second.txt file  // This Step is important
			bwn.newLine();
			s=br.readLine();
		}
		bwn.flush();
		
	}

}
