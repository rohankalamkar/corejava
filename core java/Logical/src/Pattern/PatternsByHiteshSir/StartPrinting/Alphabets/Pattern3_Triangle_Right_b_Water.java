package Pattern.PatternsByHiteshSir.StartPrinting.Alphabets;

import java.util.Scanner;

public class Pattern3_Triangle_Right_b_Water {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Ascending Alphabet Printing Single row in Triangle Shape from Right but Water Image ");
	    System.out.println("Enter Number of Rows : ");
	    int x = sc.nextInt();
	    int z;
	    for(int i=1;i<=x;i++) {
	    	z=1;
	    	for(int j=1;j<i;j++) {
	    		System.out.print("  ");
	    	}
	    	for(int k=x;k>=i;k--) {
	    		System.out.print((char)(z+64)+" ");
	    		z++;
	    	}
	    	System.out.println();
	    	
	    	
	    	
	    	
	    }
	    
	}

}
