package Loops.LoopsByHiteshSir.Introduction;

import java.util.Scanner;

public class FibonacciSeries1 {
public static void main(String[] args) {

	//The Fibonacci Sequence is the series of numbers:

	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... (Number is sum of previous two numbers) 
			
			Scanner sc = new Scanner(System.in);
			
			int num1 = 0;
			int num2 = 1 ;
			int result;
			System.out.println("Enter a number : ");
			int range = sc.nextInt();
			for(int i = 1;i<=range;i++) {
				result = num1 +num2;
				if(result>=range) {
					break;
				}
				num1 = num2;
				num2 = result;
			
			System.out.print(" "+result);
			
			}
			
			
			

}
	

}
