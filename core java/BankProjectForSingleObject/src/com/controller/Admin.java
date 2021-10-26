package com.controller;

import java.util.Scanner;

import com.service.RBI;
import com.service.SBI;

public class Admin {
	public static void main(String[] args) {
		boolean b = true;
		RBI s = new SBI();
		Scanner sc1 = new Scanner(System.in);
		while(b) {
			try {
				
			
		System.out.println("\n-----------WELCOME TO STATE BANK OF INDIA-----------\n");
		System.out.println("1.Adding new Account.");
		System.out.println("2.Depositing Money.");
		System.out.println("3.Withdrawing Money.");
		System.out.println("4.View Account Balance.");
		System.out.println("5.View Account Details.");
		System.out.println("6.Update Account Details.");
		System.out.println("7.Transaction Details.");
		System.out.println("8.Exit.\n");
		System.out.println("Enter Your Choice : ");
		String choice = sc1.next();
		//choice +=sc1.nextLine();
		int ch =Integer.parseInt(choice);
		switch (ch) {
		case 1:
			s.addAccount();
			break;
		case 2:
			s.depositeMoney();
			break;
		case 3:
			s.WithdrawMoney();;
			break;
		case 4:
			s.viewBalance();
			break;
		case 5:
			s.viewAccountDetails();
			break;
		case 6:
			s.updateAccount();
			break;
		case 7:
			s.transactionDetails();
			break;
		case 8 :
			b=false;
			break;
		default:
				System.out.println("You Have Entered Wrong input...");
			
		}
			}
		catch(NumberFormatException e) {
			System.out.println("Please Enter valid .....");
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}

		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	s.addAccount();
	//	System.out.println(s.toString());
		
//		s.WithdrawMoney();
//		s.depositeMoney();
//		s.updateAccount();

	}

}
