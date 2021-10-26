package fileHandling.ByAkshayMankarSir;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import sun.swing.FilePane;

public class Demo2Task {
	public static void main(String[] args) throws IOException {
		
		//PrintWriter fw = new PrintWriter("Task.java"); 
		
		FileReader fr =new FileReader("Input.java");
		BufferedWriter pw = BufferedWriter(fr); 
		
		pw.write("I am Number 4\n");
		pw.write("Happy Birthday...");
		pw.write("Salman Bhai----Radhe..");
		
		FileWriter fr1 = new FileWriter("Output.java");
		FileReader fr2= new FileReader("Input.java");
	
		
		
		
		
		
		//PrintWriter pw1 = new PrintWriter("Output.java");
		
		
		
		
		
		System.out.println("2.Added Successfully...");
		pw.flush();
		
		
		
		
		
	}

	private static BufferedWriter BufferedWriter(FileReader fr) {
		// TODO Auto-generated method stub
		return null;
	}

}
