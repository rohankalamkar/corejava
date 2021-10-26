package fileHandling.ByHiteshSir;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
	public static void main(String[] args) throws IOException {
		
		// 4. creating new File in Existing Folder(path/directory)
		
		File f = new File("E:\\Eclipse Program CJC\\core java\\FileHandling\\Radhe Movie Folder");
		//E:\Eclipse Program CJC\core java\FileHandling\Radhe Movie Folder
		
		File f1 = new File(f,"Bhai Ki Script.txt");
		//System.out.println("Before : "+f1.createNewFile());  // true
		
		// Second way
		// By Giving Directly Existing path
		File f2 = new File("E:\\Eclipse Program CJC\\core java\\FileHandling\\Singham\\Singham Return","Rohit Shetty Script.txt");
		//System.out.println("Before : "+f2.createNewFile());  // true
		
		
		
		
		
		
	}

}
