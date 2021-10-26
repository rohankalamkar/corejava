package Pattern.PatternsByHiteshSir.StartPrinting.Alphabets;

import java.util.Scanner;

public class Pattern2_Triangle_Left_b {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ascending Alphabet Printing  single row in Triangle from Left Side pathern.   ");
		System.out.println("Enter Number for rows");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (i + 64) + " ");
			}
			System.out.println();
		}
	}
}
