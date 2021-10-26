package AccountServiceTest;

import java.util.Scanner;

public class Test {
	 
	public static void main(String[] args) {
		System.out.println("---------Welcome---------\n");
		Scanner sc = new Scanner(System.in);
		Service s = new Service();
		boolean flag=true;
		
		while(flag) {
		System.out.println("Enter Your Choice :  \n");
		System.out.println("1. Add Account.");
		System.out.println("2. Update Account.");
		System.out.println("3. View Account List.");
		System.out.println("4. Exit.");
		
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1 : 
			s.AddAccount();
			break;
		
		case 2 : 
			s.updateAccount();
			break;
		case 3 :
			s.viewList();
			break;
		case 4 : 
			flag = false;
			break;
			
			default:
				System.out.println("Wrong Input...");
			
		}
		}
	}

}
