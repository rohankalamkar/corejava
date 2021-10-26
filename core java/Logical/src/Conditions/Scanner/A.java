package Conditions.Scanner;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("Addition is : "+sum);
		
	}

}
