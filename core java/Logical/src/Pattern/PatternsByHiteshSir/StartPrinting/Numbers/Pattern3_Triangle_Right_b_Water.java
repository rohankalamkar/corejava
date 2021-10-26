package Pattern.PatternsByHiteshSir.StartPrinting.Numbers;

import java.util.Scanner;

public class Pattern3_Triangle_Right_b_Water {
	public static void main(String[] args) {
		
		System.out.println("Printing Ascending Number in Single rows in Triangle From Right Side But Water Image ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for rows ");
		int x  = sc.nextInt();
		int z ;
		for(int i =1;i<=x;i++) {
			z=1;
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int k=x;k>=i;k--) {
				System.out.print(z+" ");
				z++;
			}
			System.out.println("");
			
		}
	
		
		
	}

}
