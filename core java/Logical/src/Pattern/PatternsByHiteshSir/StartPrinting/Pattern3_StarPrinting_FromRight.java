package Pattern.PatternsByHiteshSir.StartPrinting;

import java.util.Scanner;

public class Pattern3_StarPrinting_FromRight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing Star Triangle(Right Angle Triangle) Pattern From Right");
		System.out.println("Enter a number of Rows : ");
		int x  = sc.nextInt();
		for (int i =1; i <=x; i++) {         // Outer Loop
			for(int j = x-1;j>=i;j--) {      // For Spacing
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {          // For Printing
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		
		
	}

}
