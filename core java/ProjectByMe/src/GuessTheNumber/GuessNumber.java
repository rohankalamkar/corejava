package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		System.out.println("-------Guess The Number---------");
		System.out.println("You have to Guess the Number in 5 attempt.");

		Random rand = new Random();
		int ComNumber = 0 + rand.nextInt(100);
		Scanner sc = new Scanner(System.in);
		int count = 0;

		boolean b = true;

		while (b) {
			System.out.println("Enter Your Guessing Number in range 0 to 100 : ");
			int userNumber = sc.nextInt();
			int diff = Math.abs(ComNumber - userNumber);

			if (userNumber > ComNumber) {

				if (diff >= 3) {
					System.out.println("The Number You have entered is too larger than Random Number");
					count++;
				}

				else if (diff < 3) {
					System.out.println("The Number You have entered is too Close to  Random Number");
					count++;
				}

			} else if (userNumber < ComNumber) {
				if (diff >= 3) {
					System.out.println("The Number You have entered is too Smaller than Random Number");
					count++;
				}

				else if (diff < 3) {
					System.out.println("The Number You have entered is too Close to  Random Number");
					count++;
				}

			} else if (userNumber == ComNumber) {
				System.out.println("Congratulation...!!...You Guess Correct Number.");
				System.out.println("You Guess the Correct Number in " + count + " Attempt.");
				b = false;
			}else {
				System.out.println("You Have Enter Wrong Number..Please Enter Valid Number (from 0-100)");
			}
		    if(count==5) {
				System.out.println("Sorry...Your attempts have Finished.");
				b=false;
			}
			
			System.out.println("Attempt Remaining : "+(5-count));
		}

	}

}
