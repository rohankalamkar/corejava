package Pattern.PatternsByHiteshSir.StartPrinting.Numbers;

import java.util.Scanner;

public class Pattern2_Triangle_Left_b_Water {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing number in Right angle Triangle from left but Water Image  with Ascending number in single row.");
		
		System.out.println("Enter a Number of rows : ");
		int x = sc.nextInt();
		
		for(int i = 1; i<=x;i++ ) {
			int z = 1;
			for(int j=i;j<=x;j++) {
			    
				System.out.print(z+" ");
				z++;
			}
			System.out.println();
		}
	}

}
