package PatternProject.Numbers.SameNumber;

import java.util.Scanner;

public class Square_Number {
	public void Same_Number_In_Single_row() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Same Number Printing 1 row in Square Shape  ");
		System.out.println("Enter Number for rows");
		int x = sc.nextInt();
		
		for(int i = 1;i<=x;i++) {
			for(int j = 1;j<=x;j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
			
		}
		
	}
	public void Ascending_Number_in_Single_Row() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ascending Number Printing 1 row in Square Shape  ");
		System.out.println("Enter Number for rows");
		int x = sc.nextInt();
		for(int i = 1;i<=x;i++) {
			for(int j = 1;j<=x;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}
	public void Same_Alphabets_in_Single_Row() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Same Alphabets Printing 1 row in Square Shape  ");
		System.out.println("Enter Number for rows : ");
		int x = sc.nextInt();
		for(int i = 1;i<=x;i++) {
			for(int j = 1;j<=x;j++) {
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
		
	}
	public void Asc_Alphabets_in_Single_Row() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ascending Alphabets Printing 1 row in Square Shape  ");
		System.out.println("Enter Number for rows : ");
		int x = sc.nextInt();
		for(int i = 1;i<=x;i++) {
			for(int j = 1;j<=x;j++) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
		
	}
	
	
	
	
	

}
