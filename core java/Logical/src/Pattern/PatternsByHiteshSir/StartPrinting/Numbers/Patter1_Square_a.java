package Pattern.PatternsByHiteshSir.StartPrinting.Numbers;

import java.util.Scanner;

public class Patter1_Square_a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Same Number Printing 1 row in Square Shape  ");
		System.out.println("Enter Number for rows");
		int x = sc.nextInt();
		
		for(int i = 1;i<=x;i++) {
			for(int j = 1;j<=x;j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
			
		}
		
		
	}

}
