package TryCatchFinally.WithReturn;

import java.util.Scanner;

public class A5 {
	public static void m1() {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int x = 10/0;
			System.out.println("Value : "+x);
		}

		finally {
			System.out.println("Finally -------- Block");
		}
		
		sc.close();   // Here Scanner class not close ..because catch block is not present here and gives Exceptional error
		
		
	}
	public static void main(String[] args) {
		System.out.println("Main--------Start");
		m1();
		
		
	}

}
