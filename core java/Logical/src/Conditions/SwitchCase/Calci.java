package Conditions.SwitchCase;

import java.util.Scanner;

public class Calci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calci Function As Below : ");
		System.out.println("1 . Addition .");
		System.out.println("2 . Substraction . ");
		System.out.println("3 . Multiplication . ");
		System.out.println("4 . Division ");
		
		
		System.out.println("Enter Your Choice : ");
		int i = sc.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("Addition : ");
			System.out.println("Enter number 1 for addition : ");
			int a = sc.nextInt();
			System.out.println("Enter number 2 for addition : ");
			int b = sc.nextInt();
			int c = a+b;
			System.out.printf("Sum of number 1 = %d and number 2 = %d  is : %d  \n ",a,b,c);
			break;
		case 2:
			System.out.println("Substraction : ");
			System.out.println("Enter number 1 for Substraction : ");
			int d = sc.nextInt();
			System.out.println("Enter number 2 for Substraction : ");
			int e = sc.nextInt();
			int f = d-e;
			System.out.printf("Substraction of number 1 = %d and number 2 = %d  is : %d  \n ",d,e,f);
			break;
		case 3 :
			System.out.println("Multiplication : ");
			System.out.println("Enter number 1 for Multiplication : ");
			int g = sc.nextInt();
			System.out.println("Enter number 2 for Multiplication : ");
			int h = sc.nextInt();
			int k = g*h;
			System.out.printf("Multiplication of number 1 = %d and number 2 = %d  is : %d  \n ",g,h,k);
			break;
		case 4 :
			System.out.println("Division : ");
			System.out.println("Enter number 1 for Division : ");
			double m = sc.nextDouble();
			System.out.println("Enter number 2 for Division : ");
			double n = sc.nextDouble();
			double o = m/n;
			System.out.printf("Division of number 1 = %f and number 2 = %f  is : %f  \n ",m,n,o);
			break;
			
			default:
				System.out.println("You have entered Wrong Choice.");
		}
		System.out.println("ABCD");

}
}
