package Pattern.PatternsByHiteshSir.StartPrinting.Numbers;

import java.util.Scanner;

public class Pattern2_Triangle_Left_a_Water {
	public static void main(String[] args) {
		System.out.println("Printing Same Numbers in single row in Triangle from Left But Water Image ");
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter a Number for row : ");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x ; i++) { // Outer loop or number of rows loop 
			for(int j=x;j>=i;j--) {    
				System.out.print(i+" ");
			}
			System.out.println();
			
			
		}
		
	}

}
