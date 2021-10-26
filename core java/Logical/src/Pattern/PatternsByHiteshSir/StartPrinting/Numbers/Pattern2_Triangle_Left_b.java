package Pattern.PatternsByHiteshSir.StartPrinting.Numbers;

import java.util.Scanner;

public class Pattern2_Triangle_Left_b {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing number in Right angle Triangle from left with Ascending number in single row.");
		
		System.out.println("Enter a Number of rows : ");
		int x = sc.nextInt();
		
		for(int i =1;i<=x;i++ ) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
				
			}
			System.out.println("");
		
	}

	}
	
}
