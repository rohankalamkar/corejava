package Loops.LoopsByHiteshSir.Exercise;

import java.util.Scanner;

public class Palindrome {
	// Palindrome Number is number = reverse number Ex 121 = 121 is palindrome , 123 = 321 is not palindrome.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program To Check Given Number is Palindrome or Not.");
		int rem = 0 ,rev = 0;
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int pal = num;
		while(pal>0) {
			rem = pal%10;
			pal = pal/10;
			rev = (rev * 10)+rem ;
		}
		if(num == rev) {
			System.out.println("The number You Have entered is Palindrome Number i.e. "+num);
		}
		else {
			System.out.println("The Number You have entered is not a Palindrome Number i.e. "+num);
		}
		
	}

}
