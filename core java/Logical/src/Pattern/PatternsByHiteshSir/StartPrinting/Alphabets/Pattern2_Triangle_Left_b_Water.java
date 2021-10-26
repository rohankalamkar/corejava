package Pattern.PatternsByHiteshSir.StartPrinting.Alphabets;

import java.util.Scanner;

public class Pattern2_Triangle_Left_b_Water {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ascending Alphabet Printing  single row in Triangle from Left Side pathern_But water image.   ");
		System.out.println("Enter Number for rows");
		int x = sc.nextInt();
		int z;
		for(int i = 1;i<=x;i++) {
			z=1;
			for(int j=x;j>=i;j--) {
				System.out.print((char)(z+64)+" ");
				z++;
			}
			System.out.println();
		}
		
		
	}

}
