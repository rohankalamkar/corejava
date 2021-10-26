package Conditions.SwitchCase;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Welcome-----------");
		System.out.println("1. SBI Bank");
		System.out.println("2. HDFC Bank");
		System.out.println("3. IDBI Bank");
		System.out.println("4. AXIS Bank");
		System.out.println("Enter Choice of Your Bank.");
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			System.out.println("You Have Selected SBI Bank ");
			break;
		case 2:
			System.out.println("You Have Selected HDFC Bank ");
			break;
		case 3:
			System.out.println("You Have Selected IDBI Bank ");
			break;
		case 4:
			System.out.println("You Have Selected AXIS Bank ");
			break;
		default:
			System.out.println("Wrong Choice--------");

		}

	}

}
