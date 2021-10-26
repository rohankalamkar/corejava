package fileHandling.ByHiteshSir;

import java.io.File;

public class FileDemo2 {
	
	
	public static void main(String[] args) {
		// 2. Creation of New Folder
		//mkdir();  doesnt throws any exception
		// while createNewFile throws IOExceptio
		File f = new File("Classic Folder");
		System.out.println("Before : "+f.mkdir()); // true
		System.out.println("After : "+f.mkdir());  // false : Because Folder is already created
		
		// 2. Creation of multiple New folder 
		File f1 = new File("Singham","Singham Return");
		// Singham(Main Folder) --> Singham Return(Sub Folder) 
		
		System.out.println("Before : "+f1.mkdirs());
		System.out.println("After : "+f1.mkdirs());
	
	}

}
