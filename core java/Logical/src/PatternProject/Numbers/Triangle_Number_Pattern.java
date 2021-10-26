package PatternProject.Numbers;

import java.util.Scanner;

public class Triangle_Number_Pattern {
	public void Triangle_Number_From_Left() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Printing number in Right angle Triangle from left with same number in single row.");
	
	System.out.println("Enter a Number of rows : ");
	int x = sc.nextInt();
	
	for(int i =1;i<=x;i++ ) {
		for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
			
		}
		System.out.println("");
	}
	}
	public void Triangle_Number_From_Left_Water() {
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
	public void Asce_Triangle_Number_From_Left_() {
		System.out.println("Printing number in Right angle Triangle from left with Ascending number in single row.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number of rows : ");
		int x = sc.nextInt();
		
		for(int i =1;i<=x;i++ ) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
				
			}
			System.out.println("");
		
	}

	}
	public void Asce_Triangle_Number_From_Left_Water_() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing number in Right angle Triangle from left but Water Image  with Ascending number in single row.");
		
		System.out.println("Enter a Number of rows : ");
		int x = sc.nextInt();
		
		for(int i = 1; i<=x;i++ ) {
			int z = 1;
			for(int j=i;j<=x;j++) {
			    
				System.out.print(z+" ");
				z++;
			}
			System.out.println();
		}

	}
	
	public void Triangle_Number_From_Right() {
		System.out.println("Printing same Number in rows in Triangle From Right Side ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for rows ");
		int x  = sc.nextInt();
		
		for(int i = 1;i<=x;i++) {    // Outer Loop
			for(int j = x-1;j>=i;j--) {  // Spacing Loop
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {       // Printing Loop
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
		
		
		
	}
	public void Triangle_Number_From_Right_Water() {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing same Number in single rows in Triangle From Right Side but Water Image ");
		System.out.println("Enter a number for rows : ");
		int x = sc.nextInt();
		for(int i =1;i<=x;i++) {    // for Outer loop
			for(int j=1 ;j<i;j++) {   // for spacing loop
				System.out.print("  ");
			}
			for(int k=x;k>=i;k--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
	public void Triangle_Number_From_Right_Ascending() {
		
	
	System.out.println("Printing Ascending Number in Single rows in Triangle From Right Side ");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number for rows ");
	int x  = sc.nextInt();
	
	for(int i = 1;i<=x;i++) {
		for(int j = x-1;j>=i;j--) {
			System.out.print("  ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(k+" ");
			
		}
		System.out.println();
	}
	
	
	
	
	}
	public void Triangle_Number_From_Right_Ascending_Water() {
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
