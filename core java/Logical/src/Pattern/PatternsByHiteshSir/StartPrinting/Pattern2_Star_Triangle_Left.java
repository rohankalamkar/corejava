package Pattern.PatternsByHiteshSir.StartPrinting;

import java.util.Scanner;

public class Pattern2_Star_Triangle_Left {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing Star Right Angle Triangle Pattern from left. ");
		System.out.println("Enter Value for Start Pattern : ");
		int x = sc.nextInt();
		
		for(int i = 1; i<=x;i++) {
			for(int j = 1 ;j<=i;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
