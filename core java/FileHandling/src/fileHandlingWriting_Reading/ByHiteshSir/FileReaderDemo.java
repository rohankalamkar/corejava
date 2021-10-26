package fileHandlingWriting_Reading.ByHiteshSir;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("abcPrintNew.txt");
		// If file not present in path/directory then It will not create new File and shows FileNotFoundException
		// It can read only already existing file 
		
		int x =fr.read();  // returns Unicode Value
//		System.out.println("1 : "+x);
//		x=fr.read();
//		System.out.println("2 : "+x);
//		int y = fr.read();
//		System.out.println("3 : "+y);
//		char ch = (char)fr.read();
//		System.out.println("4 : "+ch);
//		
//		ch = (char)fr.read();
//		System.out.println("5 : "+ch);
//		ch = (char)fr.read();
//		System.out.println("6 : "+ch); 
		
		// It reads index to index
//		System.out.println((char)-1);  //?  // It means No unicode Numbe of -ve(Negative) Numbers
//		System.out.println((char)-2);  //?
// 		System.out.println((char)-3);  //?
//		System.out.println((char)-4);  //?
		// -1 is Unicode Number of nothing 
		while(x!=-1) {
			System.out.print((char)x);
			x=fr.read();
		}
		// Here no need of flush method
		fr.close();
		
		
		
		
	}

}
