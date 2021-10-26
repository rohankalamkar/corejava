package ByMe;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import CollectionFrameWorkSorting.ByHiteshSir.User;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Student1> list = null;
		// We use set here because it do not allow duplicate value

		Comparator<Student1> roll_Sort = new Comparator<Student1>() {

			@Override
			public int compare(Student1 o1, Student1 o2) {

				return o1.getRollno() - o2.getRollno();
			}
		};

		Comparator<Student1> Name_Sort = new Comparator<Student1>() {

			@Override
			public int compare(Student1 o1, Student1 o2) {

				return o1.getName().compareTo(o2.getName());
			}
		};

		Comparator<Student1> Address_Sort = new Comparator<Student1>() {

			@Override
			public int compare(Student1 o1, Student1 o2) {

				return o1.getAddress().compareTo(o2.getAddress());
			}
		};

		System.out.println("Enter Your choice : ");
		System.out.println("1. Roll No wise sorting");
		System.out.println("2. Name Wise Sorting ");
		System.out.println("3. Address Wise. Sorting");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			list = new TreeSet<Student1>(roll_Sort);
			break;
		case 2:
			list = new TreeSet<Student1>(Name_Sort);
			break;
		case 3:
			list = new TreeSet<Student1>(Address_Sort);
			break;
		default:
			System.out.println("Wrong Choice.");
		}

		if (list != null) {
			list.add(new Student1(5, "Rohan", "Wardha"));
			list.add(new Student1(3, "kapil", "Amravati"));
			list.add(new Student1(8, "Akhil", "nagpur"));
			list.add(new Student1(7, "Shubham", "Satara"));
			
			for (Student1 stu : list) {
				System.out.println(stu);
			}
		}
		
		Student1 st = null;
		Object [] sarray=list.toArray();      // Converting set to array
		Student1 marks=(Student1)sarray[0];   
		System.out.println(sarray.length);    // 4
		for(int i =0;i<sarray.length;i++) {
			Student1 temp=(Student1)sarray[i];
			if(temp.getRollno()>marks.getRollno()) {
				temp=marks;
			}
		}
		
		
		System.out.println("Topper : "+marks.getRollno());
	
		System.out.println("Main-----------End");
	}

}
