package fileHandling.ByHiteshSir;

import java.io.File;

public class FileDemo6 {
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\ROHAN KALAMKAR\\OneDrive\\Desktop\\program");
		
		long l = f.length();
		System.out.println("Total Files in Folder including subFiles: "+l);
		//Total Files in Folder including subFiles: 24576
		// length() method counts subfolders+files+photoes also all entities
		
		String s[] = f.list();
		System.out.println("Total Files in Folder List : "+s.length);
		//Total Files in Folder List : 42
		// list() method counts only File+folder present in that folder only
		// It doesnt count sub Folder
		
		
		File arrayFolder [] =f.listFiles();
		System.out.println("arrayFolder Length : "+arrayFolder.length );
		//arrayFolder Length : 42
		

// For printing all files and folders		
//		for (int i = 0; i < s.length; i++) {
//			System.out.println((i+1)+" : "+s[i]);
//			}
		
		for (int i = 0; i < s.length; i++) {
		
//			if(s[i]) {
//				// s[i].ifFile is not available for this 
//				// so we using listFiles  this contains isFile folder
//			}
			
			
		}
		
		for (int i = 0; i < arrayFolder.length; i++) {
			if(arrayFolder[i].isFile()) {
				System.out.println(" : "+arrayFolder[i].getName());
			}
//			else {
//				System.out.println(arrayFolder[i].getName());
//			}
		}
		for (int i = 0; i < arrayFolder.length; i++) {
			if(arrayFolder[i].isFile()) {
				continue;
			}
			else {
				System.out.println(arrayFolder[i].getName());
			}
		}
	

			
			
			
		}
	
		
	}


