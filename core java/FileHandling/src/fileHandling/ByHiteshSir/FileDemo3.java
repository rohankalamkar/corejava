package fileHandling.ByHiteshSir;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
	
	public static void main(String[] args) throws IOException {
		
		//3. Creation of New File in New Folder(Path/Directory)
		
		File f = new File("Radhe Movie");
		File f1 = new File(f,"Logical Scrpit.txt");
		//System.out.println("Before : "+f1.createNewFile());
		// IOException: The system cannot find the path specified
		// Because Folder(Radhe Movie) Not created yet
		
		File f2 = new File("Tenet");
		File f3 = new File("Inception Movie","Logical Script.txt");
		//System.out.println("Before : "+f3.createNewFile());
		//IOException: The system cannot find the path specified
		//Because Inception Movie folder not created yet
		
		//Solution : You have to create Folder first then only you can create file in that folder
		
		File f4 = new File("Radhe Movie","Torturing Script.txt");
		//System.out.println("Creating Folder.: "+f4.mkdir());  // false : Wrong Input
		//System.out.println("First Folder Createde "+f4.mkdir()+" . Second File Created : "+f4.createNewFile() );
		////IOException: The system cannot find the path specified
		
		
		
//		File f5 = new File("Radhe Movie Folder");
//		System.out.println("Creating Folder : "+f5.mkdir());   // true
//		
//		File f6 = new File(f5,"Illogical Script.txt");
//		System.out.println("Creating file : "+f6.createNewFile());  // true
		
		File f7 = new File("Bhai ki Movie folder");
		//File f8 = new File(f7.mkdir()," abc.txt");  // Error : This is not possible
		// boolean,String constructor is not present
		
		
		
		
		
		
		
		
		
	}

}
