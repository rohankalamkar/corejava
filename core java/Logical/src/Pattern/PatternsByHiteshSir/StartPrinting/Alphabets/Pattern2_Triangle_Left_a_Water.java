package Pattern.PatternsByHiteshSir.StartPrinting.Alphabets;

import java.util.Scanner;

public class Pattern2_Triangle_Left_a_Water {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Same Alphabet Printing 1 row in Triangle Shape from Left but water image  ");
		System.out.println("Enter Number for rows");
		int x = sc.nextInt();
		
		for(int i = 1;i<=x;i++) {
			for(int j =x ;j>=i;j--) {
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
			
		}
		
	}

}
