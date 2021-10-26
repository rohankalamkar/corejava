package Pattern.PatternsByHiteshSir.StartPrinting.Alphabets;

import java.util.Scanner;

public class Pattern3_Triangle_Right_a_Water {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Same Alphabet Printing Single row in Triangle Shape from Right But Water Image ");
	    System.out.println("Enter Number of Rows : ");
	    int x = sc.nextInt();
	    
	    for(int i=1;i<=x;i++) {   // Outer loop
	    	for(int j =1 ;j<i;j++) {  // Spacing Loop
	    		System.out.print("  ");
	    	}
	    	for(int k=x ;k>=i;k--) {
	    		System.out.print((char)(i+64)+" ");
	    	}
	    	System.out.println();
	    	
	    }
	    
		
		
	}

}
