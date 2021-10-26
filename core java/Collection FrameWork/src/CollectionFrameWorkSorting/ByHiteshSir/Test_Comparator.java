package CollectionFrameWorkSorting.ByHiteshSir;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test_Comparator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Comparator<Student> rollSort=new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getRollno()-o2.getRollno();
			}
		};
		
		Comparator<Student> nameSort = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};
		
		Set<Student> list = null;
		
		System.out.println("Enter Your Choice : ");
		System.out.println("1 . For Roll Number wise Sort ");
		System.out.println("2 . For Name Wise Sort ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1 :
			list = new TreeSet<Student>(rollSort);
			break;
		case 2 : 
			list = new TreeSet<Student>(nameSort);
			break;
			
			default:
				System.out.println("Wrong Choice . ");
				//list = new TreeSet<Student>();
		}
		
		
		Student s1 = new Student(12,"Sushrut","Wardha");
		Student s2 = new Student(16, "Akash", "Satara");
		Student s3 = new Student(23, "kapil", "Pune");
		
		if(list!=null) {
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(Student stu:list) {
			System.out.println(stu);
		}
		
		}
		System.out.println("Program ---------End");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
