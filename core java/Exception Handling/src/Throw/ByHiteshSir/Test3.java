package Throw.ByHiteshSir;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Main-------Start");
		Student s = new Student();
		
		try {
			System.out.println("Enter Roll Number : ");
			int rollno = sc.nextInt();
			if(rollno<=0) {
				throw new InvalidNameException("Roll Number should not less than or equal to zero ");
			}
			s.setRollNo(rollno);
			System.out.println("Enter your Name : ");
			String name= sc.next();
			name = name+sc.nextLine();  // Yes it is necessary to add here
			if(name.charAt(0)=='M' && name.charAt(1)=='r') {
				s.setName(name);
			}
			else {
				throw new InvalidNameException("Start Your Name with Mr ");
			}
			
			System.out.println("Enter your Address : ");
			String ad = sc.nextLine();
			s.setAddress(ad);
			
		}
		catch(InvalidNameException e) {
			System.out.println("Catch---Block.. : "+e.getMessage());
		}
		System.out.println(s.getRollNo()+"  "+s.getName()+"  "+s.getAddress());
		System.out.println("Main------End");
		
		
		
		
		
	}

}
