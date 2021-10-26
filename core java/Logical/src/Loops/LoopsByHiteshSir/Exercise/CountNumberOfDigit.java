package Loops.LoopsByHiteshSir.Exercise;

import java.util.Scanner;

public class CountNumberOfDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program for counting Unit Digits.");
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int count=0;
		
	while(num>0) {
		num= num/10;
		count++;
	}
	System.out.println("Total Number of Digit  : "+count);
		
		
	}

}
