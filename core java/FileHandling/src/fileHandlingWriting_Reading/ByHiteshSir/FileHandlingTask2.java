package fileHandlingWriting_Reading.ByHiteshSir;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileHandlingTask2 {
	public static void main(String[] args) throws Exception {
		
		// Task 2 : 
		// first_2.txt (Some data written there)
		// Second_2.txt (Some data written there)
		// We have to merge data of first_2.txt and second_2.txt in Third_2.txt
		// third_2.txt = first_2.txt+Second_2.txt
		
		
		PrintWriter pw1 = new PrintWriter(new FileWriter("First_2.txt",true)); // If file not present, writer will create it
		PrintWriter pw2 = new PrintWriter(new FileWriter("Second_2.txt",true));
		
		// Task is We have to print First_2.txt data + Second_2.txt data in Third_2.txt
		// for that first we need to Read that data.
		// for reading for BufferedReader is best.
		
		BufferedReader bw1 = new BufferedReader(new FileReader("First_2.txt"));
		BufferedReader bw2 = new BufferedReader(new FileReader("Second_2.txt"));
		String s1 =bw1.readLine();
		String s2 =bw2.readLine();
		// We have print/Write this reading data in Third_2.txt
		// For Writing : PrintWriter is best 
		
		PrintWriter pw3 = new PrintWriter(new FileWriter("Third_2.txt"));
		//pw3.println(s1);
		//pw3.println(s2);
		
		
		// For Printing/Writing  1st line of First + 1st Line of Second = (1+2)line of third 
//		while(s1!=null && s2!=null) {
//			pw3.println(s1);
//			pw3.println(s2);
//			s1=bw1.readLine();
//			s2=bw2.readLine();
//			
//		}
		
		// For Printing/Writing Complete All data of first_2.txt + then Complete all data of second_2.txt = in Third_2.txt
		
		while(s1!=null) {
			pw3.println(s1);
			s1=bw1.readLine();
			
		}
		while(s2!=null) {
			pw3.println(s2);
			s2=bw2.readLine();
		}
		
		
		
		
		
		
		
		pw3.flush(); // In PrintWriter : flush() position matters
		pw3.close();
		bw1.close();
		bw2.close();
		// while in FileWriter and BufferedWriter flush() position doesnt matter
		
	}

}
