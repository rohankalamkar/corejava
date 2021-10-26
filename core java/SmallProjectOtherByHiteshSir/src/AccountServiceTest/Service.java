package AccountServiceTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
	Scanner sc = new Scanner(System.in);
	List<Account> alist = new ArrayList<Account>();

	public void AddAccount() {

		System.out.println("Enter Number Of Accounts : ");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			Account ac = new Account();
			System.out.println("For : " + (i + 1) + " : Student");
			System.out.println("Enter Account Number : ");
			ac.setAcno(sc.nextInt());
			System.out.println("Enter Name of Account Holder :  ");
			ac.setName(sc.next());
			System.out.println("Enter Address of Account Holder : ");
			ac.setAddress(sc.next());
			System.out.println("Enter Account Pan Number : ");
			ac.setPan(sc.next());

			// System.out.println(ac.getAcno()+" : "+ac.getName());
			alist.add(ac);

		}
		System.out.println("\nList Created.......!!!\n");

		for (Account a : alist) {
			System.out.println(a);
			System.out.println("-------------------------------------------\n");
		}

	}

	public void updateAccount() {
		System.out.println("Enter Account Number : ");
		int acno = sc.nextInt();
		boolean flag = false;

		for (Account ac1 : alist) {

			if (acno == ac1.getAcno()) {
				flag = true;
				boolean c = true;
				while(c) {
				System.out.println("Enter Your Choice : ");
				System.out.println("1. Update Account Name :");
				System.out.println("2. Update Address :");
				System.out.println("3. Update Pan Number : ");
				System.out.println("4. Exit.");
				int ch = sc.nextInt();

				switch (ch) {
				case 1:
					System.out.println("Enter New Name : ");
					ac1.setName(sc.next());
					break;

				case 2:
					System.out.println("Enter New Address : ");
					ac1.setAddress(sc.next());
					break;
				case 3:
					System.out.println("Enter New Pan No : ");
					ac1.setPan(sc.next());
					break;
				case 4 : 
					c =false;
					break;
				default:
					System.out.println("Entered Wrong Choice");

				}
				}
			}

		}
		if (flag) {
			System.out.println("Account Updated....");
		} else {
			System.out.println("This Account Number Not found in Record....");
		}
	}

	public void viewList() {
		for (Account ac : alist) {
			System.out.println("-------------------------------------------");
			System.out.println(ac);
			
		}
	}

	public static void main(String[] args) {

		Service s = new Service();
		s.AddAccount();
		s.updateAccount();
		s.viewList();

	}

}
