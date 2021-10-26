package Loops.LoopsByHiteshSir.Introduction;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		System.out.println("Enter a Number : ");
		int prime = sc.nextInt();
		//int count = 0;
		

	for(int j = 2 ;j<prime;j++) {
		if(prime % j == 0) {
		check = false;
		break;
		}
	
		
	}
if(check) {
	System.out.println(prime + " : Number is Prime.");
}
else {
	System.out.println(prime+ " : Number is Not a Prime.");
}
	
}
	

}
