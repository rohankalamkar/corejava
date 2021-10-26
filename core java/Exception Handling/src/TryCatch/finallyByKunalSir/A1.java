package TryCatch.finallyByKunalSir;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		System.out.println("Main --------start");
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Try---------Start");
			System.out.println("Enter Numberator: ");
			int x = sc.nextInt();
			System.out.println("Enter Denominator : ");
			int y = sc.nextInt();
			if (y == 0) {
				throw new ArithmeticException();
			}

			int div = x / y;

			System.out.println("Division is : " + div);
		}
//		catch(ArithmeticException e) {
//			System.out.println("Denominator cannot be Zero.");
//			System.out.println("It will Give you Infinite answer");
//		}
		finally {
			System.out.println("Finally Block is here..."); // It will always execute whatever there is any condition
			// if there is catch block or not..or after giving any exception
		}

		System.out.println("Main------End");


		
		
	}
	

}
