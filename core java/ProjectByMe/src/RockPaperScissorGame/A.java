package RockPaperScissorGame;

import java.util.Random;
import java.util.Scanner;

public class A {

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
		String name = sc.next();
		
		
		

		

		while (Count>=0 && Count!=4) {

			int CompChoice = 1 + rn.nextInt(3);

			System.out.println("Hello " + name + " , Select 1 for Rock , 2 for Paper , 3 for Scissor .");
			int UserChoice = sc.nextInt();

			if (CompChoice == UserChoice) {
				System.out.println("\n"+"It is a Tie... " + name + " and Computer Selects Same");
				System.out.println("No Points Will Awarded.");
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);

			} else if (UserChoice == 1 && CompChoice == 2) {
				System.out.println("\n"+name + " . You Have Lost this Round and Computer Won");
				System.out.println(name + " Selects is Rock ");
				System.out.println("Computer Selects Paper ");
				CompCount++;
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
				
				Count=CompCount;

			} else if (UserChoice == 1 && CompChoice == 3) {
				System.out.println("\n"+name + " . You Won this Round.");
				System.out.println(name + " Selects Rock.");
				System.out.println("Computer Selects Scissor.");
				UserCount++;
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
				
				Count=CompCount;
			} else if (UserChoice == 2 && CompChoice == 1) {
				System.out.println(name + " . You Won this Round.");
				System.out.println(name + " Selects Paper.");
				System.out.println("Computer Selects Rock.");
				UserCount++;
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
				
				Count=CompCount;

			} else if (UserChoice == 2 && CompChoice == 3) {
				System.out.println("\n"+name + " . You Have Lost this Round and Computer Won");
				System.out.println(name + " Selects is Paper ");
				System.out.println("Computer Selects Scissor ");
				CompCount++;
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
				
				Count=CompCount;

			} else if (UserChoice == 3 && CompChoice == 1) {
				System.out.println("\n"+name + " . You Have Lost this Round and Computer Won");
				System.out.println(name + " Selects is Scissor ");
				System.out.println("Computer Selects Rock ");
				CompCount++;
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
				
				Count=CompCount;

			} else if (UserChoice == 3 && CompChoice == 2) {
				System.out.println("\n"+name + " Won this Round.");
				System.out.println(name + " Selects Scissor.");
				System.out.println("Computer Selects Paper.");
				UserCount++;
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
				
				Count=CompChoice;

			}
			else {
				System.out.println("\nYou Have Entered Wrong Number.");
				System.out.println("Select Valid Number...\n");
			}
			 if (UserCount == 3) {
				System.out.println("\nCongratulation " + name + " . You Won this Game");
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
				Count=4;
				

			}
		
			 if (CompCount == 3) {
				System.out.println("\nSorry " + name + " You have Lost this Complete Game");
				System.out.println(name + " Score is : " + UserCount);
				System.out.println("Computer Score is : " + CompCount);
				Count=4;
				

			}
			

		}

	}

}
