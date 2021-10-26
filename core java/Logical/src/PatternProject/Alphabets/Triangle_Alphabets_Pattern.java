package PatternProject.Alphabets;

import java.util.Scanner;

public class Triangle_Alphabets_Pattern {

	public void Square_Alphabets_Same() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Same Alphabet Printing in Single row in Square Shape  ");
		System.out.println("Enter Number for rows");
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			for(int j = 1;j<=x;j++){
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
		
		
	}
	public void Square_Alphabets_Ascending() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ascending Alphabet Printing 1 row in Square Shape  ");
		System.out.println("Enter Number for rows");
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			for(int j = 1;j<=x;j++){
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
	public void Triangle_Alphabets_Left_Same() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Same Alphabet Printing 1 row in Triangle Shape from Left  ");
		System.out.println("Enter Number for rows");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			for(int j = 1;j<=i;j++){
				System.out.print((char)(i+64)+" ");				
			}
			System.out.println();
		}
		
		
		
		
		
	}
	
	public void Triangle_Alphabets_Left_same_Water() {
		
		
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
	public void Triangle_Alphabets_Left_Asc() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ascending Alphabet Printing  single row in Triangle from Left Side pathern.   ");
		System.out.println("Enter Number for rows");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (i + 64) + " ");
			}
			System.out.println();
		}
		
	}
	public void Triangle_Alphabets_Left_Asc_Water() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ascending Alphabet Printing  single row in Triangle from Left Side pathern but Water image  ");
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
	public void Triangle_Alphabets_Right_Same() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Same Alphabet Printing Single row in Triangle Shape from Right ");
	    System.out.println("Enter Number of Rows : ");
	    int x = sc.nextInt();
	    
	    for(int i= 1;i<=x;i++) {   // Outer Loop
	    	for (int j =x-1; j >=i ; j--) {   // Loop for Spacing
	    		System.out.print("  ");
			}
	    	for(int k = 1;k<=i;k++) {   // Printing Loop
	    		System.out.print((char)(i+64)+" ");
	    	}
	    	System.out.println();
	    }
	
		
		
	}
	public void Triangle_Alphabets_Right_Same_Water() {
		
		
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
	
	public void Triangle_Alphabets_Right_Asc() {
		
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
	public void Triangle_Alphabets_Right_Asc_Water() {
		
		
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
