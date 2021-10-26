package Loops.LoopsByHiteshSir.Exercise;

import java.util.Scanner;

public class TriangularSeries {
	public static void main(String[] args) {
		System.out.println("Program for Triangular Series.");
		Scanner sc = new Scanner(System.in);
		System.out.println("The Program will Start from 1.");
		System.out.println("Enter Last Number : ");
		int x = sc.nextInt();
		int sum = 1,num = 0,n=0,fnl = 0;
		System.out.println("The Triangular Series is as Follows :");
		while(true) {
			sum = num + (2*n+1);
			fnl = fnl + sum;
			if(fnl>=x) {
				break;
			}
			System.out.println(fnl + " ");
			n++;
			
		}
		
		
	}

}
