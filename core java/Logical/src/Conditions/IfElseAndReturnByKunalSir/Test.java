package Conditions.IfElseAndReturnByKunalSir;

import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		System.out.println("-------Select------\n"+
							" 1. Addition \n"+
							" 2. Substraction  \n"+
							" 3. Multiply   \n"+
							" 4. Exit......");
		Scanner sc = new Scanner(System.in);
		
		while(true) {    // It means INFINITE LOOP need to break statement for exit
			
		System.out.println("Enter Your Choice......");
		int n = sc.nextInt();
		if(n==1) {
			int x = c.add(100,200);
			System.out.println("Addition......."+x);
		}
		else if(n==2) {
			int y = c.sub(1000, 200);
			System.out.println("Substraction......."+y);
		}
		else if(n==3) {
			int z = c.mult(30, 5);
			System.out.println("Multiplication........."+z);
		}
		else if (n==4) {
			System.out.println("Exit.....");
			break;      // With this Option we stop the loop. Else it will execute continuously(infinitely).
		}
		else {
			System.out.println("Wrong Choice.....");
		}
		}
		
		
	}

}
