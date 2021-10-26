package OneToManyStudentIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class College {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		s1.setName("Rohan Kalamkar");
		s1.setRollno(12);
		s1.setMob(9975691028l);
		
		

		
		System.out.println(s1.getName()+" : "+s1.getRollno()+" : "+s1.getMob()+" : "+s1.getCourseList().get(0));
		// NullPointerException
		
	}

}
