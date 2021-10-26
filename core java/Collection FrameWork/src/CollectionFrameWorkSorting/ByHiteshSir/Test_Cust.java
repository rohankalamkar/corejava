package CollectionFrameWorkSorting.ByHiteshSir;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test_Cust {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<User_Cust> set = null;

		
		System.out.println("Enter Your Choice : ");
		System.out.println("1. For User Id Wise Sorting");
		System.out.println("2. For User Name Wise Sorting");
		System.out.println("3. For Address Wise Sorting");
		
		int ch = sc.nextInt();
		
		
		switch (ch) {
		case 1:
			set = new TreeSet<User_Cust>(new Uid_Cust_Sort());
			break;
		case 2:
			set = new TreeSet<User_Cust>(new Uname_Cust_Sort());
			break;
		case 3:
			set = new TreeSet<User_Cust>(new Uaddress_Cust_Sort());
			break;
			
			default:
				System.out.println("Wrong Input....");
		}
		
		set.add(new User_Cust(15, "Samual", "California"));
		set.add(new User_Cust(20, "David", "Varanasi"));
		set.add(new User_Cust(10, "Ramu Kaka", "London"));
		set.add(new User_Cust(18, "KantaBai", "Texas")); 
		
		
		for(User_Cust u:set) {
			System.out.println(u);
			System.out.println("-----------------------------------------------");
		}
		
		
		
	}

}
