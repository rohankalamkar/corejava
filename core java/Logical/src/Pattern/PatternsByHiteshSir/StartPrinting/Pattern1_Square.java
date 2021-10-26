package Pattern.PatternsByHiteshSir.StartPrinting;

import java.util.Scanner;

public class Pattern1_Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for Square pattern : ");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}
