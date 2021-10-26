package JDBCByMySQL;

import java.util.Scanner;

public class Admin {
	public static void main(String[] args) {
		RBI s = new SBI();
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		
		while(flag) {
		
		System.out.println("\n-----------------SBI Bank----------------\n");
		
		System.out.println("1. Add Account. ");
		System.out.println("2. View Single Account.");
		System.out.println("3. View All Accounts in Bank.");
		System.out.println("4. Withdraw Money");
		System.out.println("5. Deposite Money.");
		System.out.println("6. Update Account. ");
		System.out.println("7. Delete Account.");
		System.out.println("8. Exit From Bank portal.\n");
		System.out.println("Enter Your Choice : ");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			s.addAccount();
			break;
		case 2:
			s.viewAccount();
			break;
		case 3:
			s.viewAllAccount();
			break;
		case 4 :
			s.withdrawMoney();
			break;
		case 5:
			s.depositMoney();
			break;
		case 6:
			s.updateAccount();
			break;
		case 7:
			s.deleteAccount();
			break;
		case 8:
			flag=false;
			break;
		default:
			System.out.println("Wrong choice.");
		
		
		}
		
		
		
		}
		sc.close();
		
		
		
	}

}
