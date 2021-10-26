package Loops.LoopsByHiteshSir.Exercise;

import java.util.Scanner;

public class HappyUnhappy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program for Happy and Unhappy Number.");
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int z = num;
		int rem = 0 , sum = 0;
		int count = 0;
		while(sum != 1 && sum != 4) {   // Here we can replace num as sum
			sum = 0 ;
			while(num>0) {
				rem = num%10 ; 
				num = num / 10;
				sum = (rem * rem) + sum;
			}
			num = sum;
			count++;
		}
		if(sum == 1 ) {
			System.out.println(z + " : Number is HAPPY Number.");
			System.out.printf(z + " : Happy Number Found in %d iteration \n",count);
		}
		else if (sum == 4) {
			System.out.println(z + " : Number is UNHAPPY Number.");
			System.out.printf(z + " : UNHappy Number Found in %d iteration.\n",count);
		}
		
		
		
	}

}
