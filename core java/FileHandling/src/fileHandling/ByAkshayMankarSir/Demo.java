package fileHandling.ByAkshayMankarSir;

import java.io.File;
import java.io.IOException;

public class Demo {
	
	public static void main(String[] args) throws Exception {
		
	//	1. How to create New File
		
//		File f = new File("abc.java");
//		System.out.println(f.createNewFile());
//		f.createNewFile();
//		System.out.println(f.createNewFile());
		
		
		// 2. How to create new Folder
		File f1 = new File("New Folder");
		System.out.println(f1.mkdir());     // Make a directory or folder
		f1.mkdir();
		System.out.println(f1.mkdir());      // Make a directory or folder
		
//		3. How to create new file in new folder.
//		File f2=new File("ABC Folder");
//		System.out.println("f2 Befor : "+f2.mkdir());
//		f2.mkdir();
//		System.out.println("f2 after : "+f2.mkdir());
//		System.out.println("1-------------------------------");
//		File f3 = new File(f2,"abc.java");
//		System.out.println("Befor : "+f3.createNewFile());
//		f3.createNewFile();
//		System.out.println("After : "+f3.createNewFile());
		
//		4.How to create file in old Folder.
		
		File f4 = new File("E:\\java by harry\\HarryIsbest.java");
		System.out.println("Before : "+f4.createNewFile());
//		System.out.println("is.File Before: "+f4.isFile());
		System.out.println("is Directory : "+f4.isDirectory());
		System.out.println("exists : "+f4.exists());
//		f4.createNewFile();
//		System.out.println("After : "+f4.createNewFile());
//		System.out.println("is.File  After : "+f4.isFile());
		
//		File f5 = new File("C:\\Users\\ROHAN KALAMKAR\\OneDrive\\Documents\\Zoom\\abc.java");
//		System.out.println("before : exists() : "+f5.exists());
//		System.out.println("is.File Before: "+f5.isFile());
//		System.out.println("Before : "+f5.createNewFile());
//		System.out.println("After : "+f5.createNewFile());
//		System.out.println("Is.Directory : "+f5.isDirectory());
//		System.out.println("after : exists() : "+f5.exists());
		
		
		
//		File f6 = new File("E:\\CJC class materials day By day\\program");
//		String s[]=f6.list();
//		System.out.println("s array length : "+s.length);
//		for (int i = 0; i < s.length; i++) {
//			String string = s[i];
//			System.out.println(string);
//		}
		
		
//		File f7 = new File("Class Folder");
//		File f8 = new File(f7,"Student.java");
//		f7.mkdir();
//		f8.createNewFile();
		
		
		
		
	}

}
