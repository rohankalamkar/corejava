package Loops.LoopsByHiteshSir.Introduction;

import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Main-----Start");
		int age =  20;
		int count = 0;
		while(age>=18) {
			
			System.out.println("Enter Your Age : ");
			age = sc.nextInt();
			System.out.println("Your Age is Valid : ");
			count++;
			
		}
		
		System.out.println("Your Age is Invalid, While Loop Executed in "+count+" number of times");
		
		System.out.println("Main-----End");
		
	}

}
