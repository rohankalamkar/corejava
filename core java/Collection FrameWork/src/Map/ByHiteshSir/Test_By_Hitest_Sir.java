package Map.ByHiteshSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test_By_Hitest_Sir {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		List<Account> list = new ArrayList<>();
		list.add(new Account(101, "Akash Chawhan", "Sevagram",30000));
		list.add(new Account(110, "Nayan Sawai ", "Arvi",70000));
		list.add(new Account(201, "Akhil Kalamkar", "Wardha",50000));
		list.add(new Account(214, "kapil Jawade", "Pune",80000));
		list.add(new Account(300, "Rohan kalamkar", "Pimpri",500));
		list.add(new Account(315, "xyz", "Pimpri",600));
		
		
		// 1 : By Using For Loop in List
		System.out.println("1.By Using for lopp in list  (Without Iterator)----------------------");
		boolean flag = false;
		System.out.println("Enter Account Number : ");
		Account getcn=null;
		int num = sc.nextInt();
		for(int i = 0;i<list.size();i++) {
			if(list.get(i).getAcno()==num) {
				getcn=list.get(i);
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println(getcn);
		}
		else {
			System.out.println("This Account Number Not Available on Record.");
		}
		
		System.out.println("----------------------------------------------------------");
		// 2 :  By Using iterator in Loop  // Sir Explain in Class
		System.out.println("By Using Iterator-------------------------");
		Account newac = null;
		boolean sys = false;
		Iterator<Account> itr=list.iterator();
		System.out.println("Enter Account Number : ");
		int num1 = sc.nextInt();
		while(itr.hasNext()) {
			Account ac=itr.next();
			if(ac.getAcno()==num1) {
				newac=ac;
				sys=true;
				break;
			}
		}
		if(sys) {
		System.out.println(newac);
		}
		else {
			System.out.println("This Account Number Not Present in record.");
		}
		System.out.println("----------------------------------------------------");
		// By Using For-Each Loop or Enhanced For Loop
		System.out.println("3. By Using For-Each Loop/Enhanced For Loop.------------------");
		
		System.out.println("Enter Account Number  : ");
		int num2 = sc.nextInt();
		Account acnew=null;
		boolean foreach=false;
		for(Account ac:list) {
			if(ac.getAcno()==num2) {
				acnew=ac;
				foreach=true;
				break;
			}
		}
		if(foreach) {
			System.out.println(acnew);
		}
		else {
			System.out.println("This Account Number is not Available in record...");
		}
		
		
		System.out.println("-----------------------------------------------------------");
		//"4. By Converting List into array.---------My Method----------"
		System.out.println("4. By Converting List into array.---------My Method----------");
		System.out.println("Enter Account Number : ");
		int arnum=sc.nextInt();
		Object[] sarray=list.toArray();
		Account strarry=null;
		boolean arryflag=false;
		for(int i = 0;i<list.size();i++) {
			Account ar=(Account)sarray[i];
			if(ar.getAcno()==arnum) {
				strarry=ar;
				arryflag=true;
				break;
			}
		}
		if(arryflag) {
		System.out.println(strarry);
		}
		else {
			System.out.println("This Account is not present in record.");
		}
		
		
		
		
		
		
		
		
	}

}
