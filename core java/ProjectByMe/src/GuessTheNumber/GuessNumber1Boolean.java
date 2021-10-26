package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber1Boolean {
	int num ;
	int comp;
	int count;
    public GuessNumber1Boolean() {
    	Random rand = new Random();
    	this.comp = rand.nextInt(100);
    	
    	
    }
    public void takeUserInput() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a Guessing number");
    	this.num = sc.nextInt();
    	
    }
    public boolean isCorrect() {
    	count++;
    	
    	if(num==comp) {
    		System.out.println("Congrats....You guess the correct number = "+num);
    		System.out.println("You Guess Correct Number in "+count+" Attempts");
    		return true;
    		  		
    	}
    	else if(num>comp) {
    		System.out.println("Number is Greater than Random Number.");
    		
    	}
    	else if(num<comp) {
    		System.out.println("Number is smaller than Random Number");
    	}
    	return false;
    }
	
	
	
	public static void main(String[] args) {
		GuessNumber1Boolean g = new GuessNumber1Boolean();
		
		boolean b = false;
		
		while(!b) {
			g.takeUserInput();
			b = g.isCorrect();
			
		}
		
		
		
	}

}
