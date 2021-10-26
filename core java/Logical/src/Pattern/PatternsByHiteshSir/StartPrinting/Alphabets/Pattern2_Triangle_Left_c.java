package Pattern.PatternsByHiteshSir.StartPrinting.Alphabets;

import java.util.Scanner;

public class Pattern2_Triangle_Left_c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ascending Alphabet Printing  in Triangle from Right Side pathern.  ");
		System.out.println("Enter Number for rows");
		int x = sc.nextInt();
		int z = 1;
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (z + 64) + " ");
				z++;
			}
			System.out.println();
		}
		
	}

}
