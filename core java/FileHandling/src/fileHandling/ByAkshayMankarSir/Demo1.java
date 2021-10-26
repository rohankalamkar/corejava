package fileHandling.ByAkshayMankarSir;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		
	//	1. FileWriter     // You can Create file and Write in that particular file 
		
//		FileWriter fr = new FileWriter("Student.java");
//		
//		fr.write(10);     //Limitation You can write integer here it is present on that but not visible
//		fr.write("Name");
//		fr.write("\n");
//		fr.write("Roll\n");
//		fr.flush();    // Use of flush here is dont know in case of Write
//		fr.write("College");
//		fr.close();
		//fr.write("abc");  // IOexception // StreamClosed
		
		
//		2. FileReader
		
//		  FileReader fr1 = new FileReader("Student.java"); // Limitation : It read only single index(letter(It considered as Character) , number)
//		  int x = fr1.read();
//		  System.out.println("Int value : "+x);  //  value is invisible in Student.java
//		  // But it is present store on 1st line 
//		  int y = fr1.read();
//		  System.out.println(y);   // 78 is unicode number of (N) 
//		  
//		  char c1 = (char)fr1.read();
//		  System.out.println("Char c1 : "+c1);
//		  
//		  char c2 = (char)fr1.read();
//		  System.out.println("Char c2 : "+c2);
//		  
//		  char c3 = (char)fr1.read();
//		  System.out.println("Char c3 : "+c3);
//		  
//		  // for print whole line or anything you have to use loops.
		  
		
//		3. BufferedWriter
		//FileReader fr2 = new FileReader("ABCNew.java");  // It will give you FileNotFoundException
		// It means it doesnot create any new file. It only read existing file
		
		FileWriter fr3 = new FileWriter("DOOM.java");
		BufferedWriter br3 = new BufferedWriter(fr3);  // BufferedWriter do not work directly..it need reference
		
		br3.write("Rohan Kalamkar");
		br3.write(20);  // Que mark symbol  , Unicode pf 20
		br3.write("StudentofCJC");
		br3.write(50);  // 2 -It is unicode of 50 decimal // Again convert 50 to 2 
		br3.write("fdf");
		br3.newLine();
		br3.write("abcffsd");
		br3.flush();  // flush method is allowd file to write into file, Without it we cannot write any code
		br3.write("xyz");
		br3.newLine();
		br3.write(60);
		br3.close();  // close method is for closing the whole program 
		
		
		
		
		//BufferedWriter bf = new BufferedWriter("CJC.java");
		  
		//4. BufferedReader  
		FileReader fr4 = new FileReader("DOOM.java");
		BufferedReader br4 = new BufferedReader(fr4);  // Here again BufferedReader doesnt work directly, It need Reference of Object
		String s1 = br4.readLine(); // Here is the advantage of bufferedreader. It reads complete line.
		                // In case of FileReader it reads only single objects.
		System.out.println(s1);
		String s2 = br4.readLine();  
		System.out.println(s2);
		int x= br4.read();
		
		System.out.println("x: "+x);
		
		int y = br4.read();
		System.out.println("y: "+y);   // 
		//		
		// Limitation of buffered Reader:
		// 1. It reads only single line.
		// 2. It allows only String,int, character array to read data, we cannot write float,long,double,boolean
		// 3. for printing in next line here method is given name 
		// newLine()  method(void) it advantageous than filereader because in filereader
		// , there is no such method present in filereader, You have to add \n or \r 
		// but according to me it is a still disadvantage for us, 
		//bcoz for moving into next line we have to write every time nextLine() method
		
		// Advantage : It read Complete line by read() method(String return type)
		
		
		// 5. PrintWriter    // It is only for Writing, We cannot read by using print. 
		 
		PrintWriter pr5 = new PrintWriter("DOOM.java");
		char[] ch = {'D','E','F','G'};
		pr5.print(true);
		pr5.print(ch);
		pr5.print('z');
		pr5.print(10.15f);
		pr5.println("Salman Bhai...Radhe");
		pr5.println(ch);
		pr5.flush();  // Above printing are meaning less without flush method.
		// flush() method allowes file to write code
		pr5.close();  // For closing file, either there is chance of leaking data
		
		// Advantage : it always better than above 
		// it print/write all data,
		// println is always take you to next line
		
		
		
	}

}
