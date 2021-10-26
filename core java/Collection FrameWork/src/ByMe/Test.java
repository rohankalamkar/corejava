package ByMe;

import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRollno(2);
		s1.setName("ccc");
		
		Student s2 = new Student(); 
		s2.setName("aaa");
		s2.setRollno(1);
		
		Student s3 = new Student(); 
		s3.setName("bbb");
		s3.setRollno(3);
		
		Set<Student> s = new TreeSet<Student>(new Student());
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		for(Student stu :s) {
			System.out.println(stu);
		}
		
		
	}

}
