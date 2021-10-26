package fileHandling.ByAkshayMankarSir;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1ByManjushaMam {
	public static void main(String[] args) throws Exception {
		
//		FileWriter fw = new FileWriter("xyz.java");  // It will Create new File if there is existance of file,  and Write in it
//	                         // It there is no such file filePresent it will create that new file and You can write in that file
//		
//		
//		fw.write("Time is money.."); // In this will not take you to next line, and no such method is present for that
//		fw.write("Happy Birthday.");
//		fw.write("\n");   // Here you have to write it manually
//		fw.write("Today is Wednesday.");
//		fw.write("\r");
//		fw.write("Super Sunday");
//		
//		fw.flush();// Above write method are meaning less without flush() method, flush method allows us to write in file
//		fw.close();// It closes file, it will not be leaking any data after close() method 
		
//		FileReader fr1 = new FileReader("pqr.java");  // FileNotFoundException // It is not present
		
		//FileReader fr2 = new FileReader("xyz.java");  // No error: Because it is already exist 
		// Limitation : It read the line character by character
		
		// All data is here in byte, so we use int
		//int x = fr2.read();  // 
		//System.out.println(x);  //84=unicode of T, if there is String character It will print unicode of String character else
		// else if there is any number present in that, it will print That particular number(Integer)
		
		//int x1 = fr2.read();
		//System.out.println(x1); // 105= unicode of = i
		// here we just reading data, so we no need to use flush method
//		while(x!=-1) {
//			System.out.println((char)x);
//			x=fr2.read();
//		}
		
		
		
		// BufferedWriter is not communicate with file directly so we have to use FileWriter
		FileWriter fw3 = new FileWriter("abc.java");
		//BufferedWriter bw4 = new BufferedWriter(fr1);  // You cannot pass FileReader reference into BufferedWriter
		
		BufferedWriter bw3 = new BufferedWriter(fw3);
		bw3.write(10);
		bw3.write("Hello Frnds");
		bw3.newLine();// Advantage. Void method for nextLine   , in filewriter it is not present
		bw3.write("Rainy Days");
		
		// for writing we need here flush method
		bw3.flush();
		
	//	BufferedReader bw4 = new BufferedReader(fw3);  // You cannot pass filwriter reference in BufferedReader
		// It should be same combination
		//FileReader - BufferedReader
		//FileWriter - BufferedWriter
		
		FileReader fr4 = new FileReader("abc.java");
		BufferedReader br4 = new  BufferedReader(fr4);
		// BufferedReader cannot communicate directly with file, so we need FileReader for that
		int x1 = br4.read();
		System.out.println(x1);
	    String s1 = br4.readLine();  // Advantage : It read complete Line, 
	   // System.out.println(s1);
	    
	    //String s2 = br4.readLine();  
	    //System.out.println(s2);
	    
//	    while(x1!=-1) {
//	    	System.out.println(x1);
//	    	x1 =br4.read();
//	    }
	    while(s1!=null) {
	    	System.out.println(s1);
	    	s1=br4.readLine();
	    }
	    
	    
		
		
		
		
		
		
		
		
	}

}
