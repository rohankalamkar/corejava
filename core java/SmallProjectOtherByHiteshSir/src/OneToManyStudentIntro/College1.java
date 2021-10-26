package OneToManyStudentIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class College1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student1 s1 = new Student1();
		s1.setName("Rohan Kalamkar");
		s1.setRollno(12);
		s1.setMob(9975691028L);
		
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		
		s1.setCourseList(list);
		
		System.out.println(s1.getName()+" : "+s1.getRollno()+" : "+s1.getMob()+" : "+s1.getCourseList().get(0));
		
		
		
		
		
	}

}
