package RockPaperScissorGame;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGameFinal {
	static {
		System.out.println("!!-----!!-----Welcome To Rock , Paper , Scissor Game-----!!------!!");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int CompCount = 0;
		int UserCount = 0;
		int Count = 0;

		System.out.println("\nWhat is your Name ? ");
		String name = sc.nextLine();
		while(Count==0) {
		int CompChoice = 1 + rn.nextInt(3);

		System.out.println("Enter 1 for Rock , 2 for Paper , 3 for Scissor , 9 for close the game.");
		int UserChoice = sc.nextInt();
		
		if(CompChoice == UserChoice) {
			System.out.println("\n"+"It is a Tie... " + name + " and Computer Selects Same");
			System.out.println("No Points Will Awarded.\n");
		}
		else if(CompChoice == 1) {
			if(UserChoice==2) {
				System.out.println(name + " . You Won this Round.");
				System.out.println(name + " Selects Paper.");
				System.out.println("Computer Selects Rock.");
				UserCount++;
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
			}
			else if(UserChoice==3) {
				System.out.println("\n"+name + " . You Have Lost this Round and Computer Win");
				System.out.println(name + " Selects Scissor ");
				System.out.println("Computer Selects Rock ");
				CompCount++;
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
			}
		}
		else if(CompChoice ==2) {
			if(UserChoice==1) {
				System.out.println("\n"+name + " . You Have Lost this Round and Computer Win");
				System.out.println(name + " Selects Rock ");
				System.out.println("Computer Selects Paper ");
				CompCount++;
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
			}
			else if(UserChoice==3) {
				System.out.println("\n"+name + " Won this Round.");
				System.out.println(name + " Selects Scissor.");
				System.out.println("Computer Selects Paper.");
				UserCount++;
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
			}
		}
		else if(CompChoice ==3) {
			if(UserChoice==1) {
				System.out.println("\n"+name + " . You Won this Round.");
				System.out.println(name + " Selects Rock.");
				System.out.println("Computer Selects Scissor.");
				UserCount++;
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
			}
			else if(UserChoice==2) {
				System.out.println("\n"+name + " . You Have Lost this Round and Computer Win");
				System.out.println(name + " Selects Paper ");
				System.out.println("Computer Selects Scissor ");
				CompCount++;
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
			}
		}
		else {
			System.out.println("\nYou Have Entered Wrong Number....");
			System.out.println("Please Enter Valid Number\n");
		}
		if(UserChoice==9) {
			Count++;
		}
		if(UserCount==3) {
			System.out.println("Congratulation.. "+name+" . You Won this Game");
			Count++;
		}
		if(CompCount==3) {
			System.out.println("Sorry.. "+name+" . You Lost this game.");
			Count++;
		}

		}
		
		
		
		
	}

}
