package Pattern.PatternsByHiteshSir.StartPrinting.Alphabets;

import java.util.Scanner;

public class Pattern3_Triangle_Right_b {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Ascending Alphabet Printing Single row in Triangle Shape from Right ");
	    System.out.println("Enter Number of Rows : ");
	    int x = sc.nextInt();
	    int y = 1;
	    
	    for(int i= 1;i<=x;i++) {   // Outer Loop
	    	for (int j =x-1; j >=i ; j--) {   // Loop for Spacing
	    		System.out.print("  ");
	    		
			}
	    	for(int k = 1;k<=i;k++) {   // Printing Loop
	    		System.out.print((char)(k+64)+" ");
	    	}
	    	System.out.println();
	    }
	
	
	}

}
