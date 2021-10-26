package Pattern.PatternsByHiteshSir.StartPrinting.Alphabets;

import java.util.Scanner;

public class Pattern3_Triangle_Right_c_Water {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Ascending Alphabet Printing in Triangle Shape from Right ");
	    System.out.println("Enter Number of Rows : ");
	    int x = sc.nextInt();
	    int y = 1;
	    for(int i=1;i<=x;i++) {
	    	
	    	for(int j=1;j<i;j++) {
	    		System.out.print("  ");
	    	}
	    	for(int k=x;k>=i;k--) {
	    		System.out.print((char)(y+64)+" ");
	    		y++;
	    	}
	    	System.out.println();
	    	
	    	
	    	
	    	
	    }
		
		
	}

}
