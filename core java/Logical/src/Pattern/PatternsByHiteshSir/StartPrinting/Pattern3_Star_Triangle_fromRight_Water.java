package Pattern.PatternsByHiteshSir.StartPrinting;

import java.util.Scanner;

public class Pattern3_Star_Triangle_fromRight_Water {
	public static void main(String[] args) {
		System.out.println("Printing star in Triangular pattern from Right But Water Image.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for rows : ");
		int x = sc.nextInt();
		for(int i = 1 ; i<=x;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int k =x;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
