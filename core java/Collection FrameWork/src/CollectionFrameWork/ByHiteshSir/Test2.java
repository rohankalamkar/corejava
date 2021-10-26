package CollectionFrameWork.ByHiteshSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		List l = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Student.");
		int size = sc.nextInt();
		for(int i =0;i<size;i++) {
			System.out.println("Sr No : "+(i+1));
			System.out.println("Enter Roll Number : ");
			int rollno = sc.nextInt();
			System.out.println("Enter Name of Student : ");
			String name = sc.next();
			name+=sc.nextLine();
			Student1 stu = new Student1(rollno, name);
			l.add(stu);
		}
		System.out.println(l);
		//[Student Info : Roll no : 5 , Name : Rohan Kalamkar, Student Info : Roll no : 6 , Name : Nayan Sawai, Student Info : Roll no : 7 , Name : Kapil Jawade]
	
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			Student1 st=(Student1)itr.next();
			System.out.println(st);
		}
	}

}
