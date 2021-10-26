package Pattern.PatternsByHiteshSir.StartPrinting.Numbers;

import java.util.Scanner;

public class Pattern2_Triangle_Left_c_Water {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Printing number in Right angle Triangle from left_But Water Image with Ascending number.");
	System.out.println("Enter a number for rows : ");
	int x = sc.nextInt();
	int z = 1;
	for(int i = 1;i<=x;i++) {
		for(int j=i;j<=x;j++ ) {
			System.out.print(z+"  ");
			z++;
		}
		System.out.println();
	}
}
}
