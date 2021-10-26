package Pattern.PatternsByHiteshSir.StartPrinting.Numbers;

import java.util.Scanner;

public class Pattern3_Triangle_Right_a_Water {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing same Number in single rows in Triangle From Right Side but Water Image ");
		System.out.println("Enter a number for rows : ");
		int x = sc.nextInt();
		for(int i =1;i<=x;i++) {    // for Outer loop
			for(int j=1 ;j<i;j++) {   // for spacing loop
				System.out.print("  ");
			}
			for(int k=x;k>=i;k--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
