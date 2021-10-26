package Pattern.PatternsByHiteshSir.StartPrinting.Numbers;

import java.util.Scanner;

public class Pattern3_Triangle_Right_c {
	public static void main(String[] args) {
		
		
			System.out.println("Printing Ascending Number in rows in Triangle From Right Side ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number for rows ");
			int x  = sc.nextInt();
			int z = 1;
			for(int i = 1;i<=x;i++) {
				for(int j = x-1;j>=i;j--) {
					System.out.print("  ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print(z+" ");
					z++;
				}
				System.out.println();
			}
			
	}

}
