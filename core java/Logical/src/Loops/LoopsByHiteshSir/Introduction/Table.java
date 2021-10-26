package Loops.LoopsByHiteshSir.Introduction;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int x = sc.nextInt();
		
		for (int i = 1; i<=10;i++) {
			int a = x*i;
			System.out.printf("Multiplication of %d and %d is : %d",x,i,a);
			System.out.println();
		}
		
	}

}
