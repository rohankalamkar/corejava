package fileHandlingWriting_Reading.ByHiteshSir;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("abcPrintNew.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		//or
		
		BufferedReader br1 = new BufferedReader(new FileReader("abcPrint.txt"));
	
	
//	    int x =br.read();
//	    System.out.println("1: "+x);   // 73   // It Count Single Index 
//	    x = br.read();  // 
//	    System.out.println("2: "+x);   // 32
//	    x= br.read();
//	    System.out.println("3: "+x);   // 97
//	    x = br.read();  // 
//	    System.out.println("4: "+x);   // 109
	    
	    // -1 is unicode of nothing(?) 
	
	    String s = br.readLine();   // It reads completes Single Line
	    // It is TrumpCard of BufferedReader method.
	    // therefore it is best in Reading
	    System.out.println(s);
	    s=br.readLine();
	    System.out.println(s);
	    s=br.readLine();
	    System.out.println(s);
	    s=br.readLine();
	    System.out.println(s);
	    s=br.readLine();
	    System.out.println(s);
	    s=br.readLine();
	    System.out.println(s);
	    s=br.readLine();
	    System.out.println(s);
	    s=br.readLine();
	    System.out.println(s);
	    s=br.readLine();
	    System.out.println(s);
	    s=br.readLine();
	    System.out.println(s);
	    s=br.readLine();
	    System.out.println(s);
	}

}
