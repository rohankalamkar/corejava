package TryCatchFinally.WithReturn;

import java.util.Scanner;

public class A3 {
	
	public void m1() {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int x = 10/2;
			System.out.println("Value : "+x);
		}
		catch(Exception e) {
			
			
			System.out.println("Catch -----Block");
		}
		finally {
			System.out.println("Finally -------- Block");
		}
		
		sc.close();   // Here Scanner class close successfully
		
		
	}
	public static void main(String[] args) {
		System.out.println("Main-------Start");
		A3 a = new A3();
		a.m1();
		System.out.println("Main-------End");
		
		
		
	}

}