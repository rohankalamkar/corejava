package TryCatch.MultipleCatch;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main-----------Start");
		try {
		System.out.println("Try----------Start");
		A a = null;
		System.out.println(a.x);  // null pointer Exception
		
		
		
		int num = Integer.parseInt("abc");  // NumberFormatException
		
		System.out.println("Try-------End");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Arithmatic...---------e-------");
		
			
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("type only interger value ");
		}
		catch(NullPointerException e){
			System.out.println("You are accessing null value.");
			e.printStackTrace();
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Catch --------Block");
			
		}
		System.out.println("Main -------- End");
	
		
	}

}
