package Loops.LoopsByHiteshSir.Introduction;

import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int prime = sc.nextInt();
		int count = 0;
		for (int i = 1; i<=prime ; i++ ) {
			
			if(prime % i == 0 ) {
				count++;
			}
	
			
		}
		if(count==2) {
			System.out.println("Number You Have Entered is Prime Number : "+prime);
			return;
		}
		else {
			System.out.println("Number You Have Entered is Not Prime Number : "+prime);
		}
		
		
		
	}

}
