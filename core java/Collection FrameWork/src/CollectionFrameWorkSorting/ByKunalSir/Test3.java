package CollectionFrameWorkSorting.ByKunalSir;

import java.util.Comparator;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {

		Student3 s1 = new Student3();
		s1.setRollno(6);
		s1.setName("Akash");

		Student3 s2 = new Student3();
		s2.setRollno(4);
		s2.setName("Rohan");

		Student3 s3 = new Student3();
		s3.setRollno(10);
		s3.setName("Kunal");

		Student3 s4 = new Student3();
		s4.setRollno(14);
		s4.setName("Tushar");

		Set<Student3> college = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		System.out.println("1. Roll No wise sorted .");
		System.out.println("2. Name wise sorted .");
		int ch = sc.nextInt();

		if (ch == 1) {
			college = new TreeSet<>(new Cust_Rollno_Sort_3());
		} else if (ch == 2) {

			college = new TreeSet<Student3>(new Cust_Name_Sort_3());
		} else {
			System.out.println("Wrong Choice......");
		}

		college.add(s1);
		college.add(s2);
		college.add(s3);
		college.add(s4);

		for (Student3 stu : college) {
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
		}

	}

}
