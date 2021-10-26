package OneToManyStudentIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class College2 {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		Student2 s1 = new Student2();
		s1.setName("Rohan Kalamkar");
		s1.setRollno(12);
		s1.setMob(9975691028L);
		
		//System.out.println(s1.getName()+" : "+s1.getRollno()+" : "+s1.getMob()+" : "+s1.getCourseList().get(0));
		// NullPointerException
		
		s1.getCourseList().add("Java ");
		System.out.println(s1.getName()+" : "+s1.getRollno()+" : "+s1.getMob()+" : "+s1.getCourseList().get(0));
		
		
		s1.getCourseList().add("C++");
		System.out.println(s1.getName()+" : "+s1.getRollno()+" : "+s1.getMob()+" : "+s1.getCourseList().get(1));
	
		s1.getCourseList().add("HTML");
		s1.getCourseList().add("Python");
	
		for(String s:s1.getCourseList()) {
			System.out.println(s);
		}
	}

}
