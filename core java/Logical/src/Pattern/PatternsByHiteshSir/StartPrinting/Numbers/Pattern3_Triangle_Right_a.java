package Pattern.PatternsByHiteshSir.StartPrinting.Numbers;

import java.util.Scanner;

public class Pattern3_Triangle_Right_a {
	public static void main(String[] args) {
		System.out.println("Printing same Number in rows in Triangle From Right Side ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for rows ");
		int x  = sc.nextInt();
		
		for(int i = 1;i<=x;i++) {    // Outer Loop
			for(int j = x-1;j>=i;j--) {  // Spacing Loop
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {       // Printing Loop
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
