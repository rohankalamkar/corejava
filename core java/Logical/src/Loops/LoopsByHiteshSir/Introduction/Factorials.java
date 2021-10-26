package Loops.LoopsByHiteshSir.Introduction;

import java.util.Scanner;

public class Factorials {
	
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number to Factorise : ");
		int x = sc.nextInt();
		int fact = 1;
		for(int i = x ; i>=1;i--) {
			fact =fact *i;
		}

		
		System.out.println("The Factorial of Given Number is : "+fact);
		
		
		
	}

}
