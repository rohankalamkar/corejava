package CollectionFrameWorkSorting.ByKunalSir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
	public static void main(String[] args) {
		
		Student2 s1 = new Student2();
		s1.setRollno(6);
		s1.setName("Akash");
		
		Student2 s2 = new Student2();
		s2.setRollno(4);
		s2.setName("Rohan");
		
		Student2 s3 = new Student2();
		s3.setRollno(10);
		s3.setName("Kunal");
		
		Student2 s4 = new Student2();
		s4.setRollno(14);
		s4.setName("Tushar");
		
		Set<Student2> college = new TreeSet<>();
		college.add(s1);
		college.add(s2);
		college.add(s3);
		college.add(s4);
		// Here TreeSet sorted 
		
		System.out.println("***************************************************");
		System.out.println(college.toString());
		// [@15db9742, @6d06d69c, @7852e922 , @4e25154f]
		
		for(Student2 stu : college) {
			System.out.println("Roll No :  "+stu.getRollno());
			System.out.println("Name : "+stu.getName());
			System.out.println("----------------------------------------------");
		}
		
	}

}
