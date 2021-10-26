package Loops.LoopsByHiteshSir.Exercise;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// Armstrong number is sum of cube of all digit of number  = that number Ex. 153 = 1^3 + 5^3 + 3^3 = 153 
	// Some Armstrong Numbers are  153, 1634, 371,407,8208,9474 etc
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Program for Armstrong Number.");
	System.out.println("Enter the number to check : ");
	int num = sc.nextInt();
	int rem=0,rev=0;
	int arm = num;
	while(arm>0) {
		rem = arm%10;
		arm = arm/10;
		rev = (rem*rem*rem)+rev;
		
		
		
	}
	if(num == rev) {
		System.out.println("The Number You Have entered is Armstrong Number i.e. "+num);
		
	}
	else {
		System.out.println("The Number You Have entered is Not Armstrong Number i.e." + num
				
				
				+"\n It Gives output as : "+rev);
	}
	
	}

}
