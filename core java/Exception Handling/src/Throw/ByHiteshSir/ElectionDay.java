package Throw.ByHiteshSir;

import java.util.Scanner;

public class ElectionDay {
	public static void main(String[] args) {
		
		System.out.println("Main-----Start");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int x = sc.nextInt();
		try {
		if(x<18) {
			throw new ElectionException("You are not eligible to do vote.");
			}
		if(x<=0) {
			throw new ElectionException("Age Cannot be zero or negative.");
		}
		if(x>80) {
			throw new ElectionException("How can you Alive till now??..Your entered your age is "+x);
		}
		System.out.println("Your age is Valid to do Vote..");
		
		}
		catch(ElectionException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main------End");
		
		
		
		
		
		
		
		
	}

}
