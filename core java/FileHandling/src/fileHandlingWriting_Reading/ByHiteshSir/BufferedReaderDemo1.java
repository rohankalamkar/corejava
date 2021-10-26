package fileHandlingWriting_Reading.ByHiteshSir;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo1 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("abcPrintNew.txt"));
		
		String s = br.readLine();
		while(s!=null) {
			System.out.println(s);
			s=br.readLine();
			}
		br.close();
		
	}

}
