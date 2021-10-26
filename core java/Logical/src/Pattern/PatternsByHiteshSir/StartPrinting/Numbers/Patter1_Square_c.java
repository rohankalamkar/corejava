package Pattern.PatternsByHiteshSir.StartPrinting.Numbers;

import java.util.Scanner;

public class Patter1_Square_c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ascending Number Printing 1 row in Square Shape  ");
		System.out.println("Enter Number for rows");
		int x = sc.nextInt();
		int z = 1;
		for(int i = 1;i<=x;i++) {
			for(int j = 1;j<=x;j++) {
				System.out.print(z+" ");
				z++;
			}
			System.out.println("");
		}
		
		
		
	}

}
