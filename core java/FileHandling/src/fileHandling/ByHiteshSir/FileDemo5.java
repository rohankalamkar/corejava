package fileHandling.ByHiteshSir;

import java.io.File;
import java.io.IOException;

public class FileDemo5 {
	public static void main(String[] args) throws IOException {
		// Other Methods in file.io
 		File f = new File("E:\\Eclipse Program CJC\\core java\\FileHandling\\Singham\\Singham Return\\Script.txt");
		System.out.println(".txt file created : "+f.createNewFile());  // True
		String parent = f.getParent();
		System.out.println("Parent method : "+parent);
		// Parent method : E:\Eclipse Program CJC\core java\FileHandling\Singham\Singham Return
		System.out.println("1.--------------------------------------------------------");
		File f2 =f.getParentFile();
		System.out.println("File Return methods : "+f2);
		//File Return methods : E:\Eclipse Program CJC\core java\FileHandling\Singham\Singham Return
System.out.println("2---------------------------------------------------------");
		String name = f.getName();
		System.out.println("Name method : "+name);
		//Name method : Script.txt
		System.out.println("3-------------------------------------------------");
		
		
		
		
		File f3 = new File("abxy.txt"); 
		System.out.println(f3.createNewFile());
		System.out.println("Can Read : "+f3.canRead());  // Can Read : true
		System.out.println("Can Write : "+f3.canWrite()); // Can Write : true
		System.out.println("Is Hidden : "+f3.isHidden()); // Is Hidden : false
		System.out.println("Is Exists : "+f3.exists() );  // Is Exists : true
		System.out.println("Absolute path : "+f3.getAbsolutePath());
		//Absolute path : E:\Eclipse Program CJC\core java\FileHandling\abxy.txt
		System.out.println("Conical Path : "+f3.getCanonicalPath());
		//Conical Path : E:\Eclipse Program CJC\core java\FileHandling\abxy.txt
		
		
		File f4 = new File("adobdd.pdf");
		System.out.println(f4.createNewFile());
		System.out.println("Can Read : "+f4.canRead());  // Can Read : true
		System.out.println("Can Write : "+f4.canWrite()); // Can Write : true
		System.out.println("Is Hidden : "+f4.isHidden()); // Is Hidden : false
		System.out.println("Is Exists : "+f4.exists() );  // Is Exists : true
		System.out.println("Absolute path : "+f4.getAbsolutePath());
		//Absolute path : E:\Eclipse Program CJC\core java\FileHandling\adobdd.pdf
		System.out.println("Conical Path : "+f4.getCanonicalPath());
		//Conical Path : E:\Eclipse Program CJC\core java\FileHandling\adobdd.pdf
		
		
		
	}

}
