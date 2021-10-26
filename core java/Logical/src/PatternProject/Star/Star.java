package PatternProject.Star;

import java.util.Scanner;

public class Star {

	public void Star_Square () {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for Square pattern : ");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= x; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}
	
	public void Triangle_From_Left() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing Star Right Angle Triangle Pattern from left. ");
		System.out.println("Enter Value for Start Pattern : ");
		int x = sc.nextInt();
		
		for(int i = 1; i<=x;i++) {
			for(int j = 1 ;j<=i;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public void Triangle_From_Left_Water() {
		
		System.out.println("Printing star pattern From left side but Water Image .");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for rows : ");
		int x = sc.nextInt();
		for (int i = 1; i <=x; i++) {
			for (int j = x; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	public void Triangle_From_Right() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing Star Triangle(Right Angle Triangle) Pattern From Right");
		System.out.println("Enter a number of Rows : ");
		int x  = sc.nextInt();
		for (int i =1; i <=x; i++) {         // Outer Loop
			for(int j = x-1;j>=i;j--) {      // For Spacing
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {          // For Printing
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		
	}
	public void Triangle_From_Right_Water() {
		System.out.println("Printing star in Triangular pattern from Right But Water Image.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for rows : ");
		int x = sc.nextInt();
		for(int i = 1 ; i<=x;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int k =x;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
	
	
}
