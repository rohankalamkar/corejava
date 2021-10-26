package fileHandling.ByHiteshSir;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	
	//1. Creation of new file
	public static void main(String[] args) throws IOException {
		
		File f = new File("abc.txt");
		System.out.println("Before : "+f.createNewFile());  // true
		System.out.println("After : "+f.createNewFile());  // false : Because file already exist,
		                                        // so no new file created with abc.txt
		
		
		
		
		
		
		
		
		
		
		
	}

}
