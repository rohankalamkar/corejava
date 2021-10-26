package Map.ByHiteshSir;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		List<Account> list = new ArrayList<>();
		list.add(new Account(101, "Akash Chawhan", "Sevagram",30000));
		list.add(new Account(110, "Nayan Sawai ", "Arvi",70000));
		list.add(new Account(201, "Akhil Kalamkar", "Wardha",50000));
		list.add(new Account(214, "kapil Jawade", "Pune",80000));
		list.add(new Account(300, "Rohan kalamkar", "Pimpri",500));
		list.add(new Account(315, "xyz", "Pimpri",600));
		
		Object[] larray= list.toArray();	
		boolean flag = false;
		
		System.out.println("Enter Account Number : ");
		int num = sc.nextInt();
		Account neAcn=null;
		for(int i = 0;i<larray.length;i++) {
			Account acr = (Account)larray[i];
			if(num==acr.getAcno()) {
				neAcn=acr;
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println(neAcn);
		}
		else {
			System.out.println("This Account Number is Not found in record.");
		}
		
		
	}

}
