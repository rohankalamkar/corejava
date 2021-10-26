package Pattern.PatternsByHiteshSir.StartPrinting;

import java.util.Scanner;

public class Pattern2_Star_Triangle_Left_Water {
	public static void main(String[] args) {
		System.out.println("Printing star pattern From left side but Water Image .");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for rows : ");
		int x = sc.nextInt();
		for (int i = 1; i <=x; i++) {
			for (int j = x; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
