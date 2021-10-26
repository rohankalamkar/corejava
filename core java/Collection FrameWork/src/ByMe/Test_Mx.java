package ByMe;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test_Mx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Comparator<Student_Mx> rollsort = new Comparator<Student_Mx>() {
			 // Anonymous inner type class formation
			// For override compare here we use this
			@Override
			public int compare(Student_Mx o1, Student_Mx o2) {
			
				return o1.getRollno()-o2.getRollno();
			}
		};    // end with ;, Therefore it is not an actual class 
		 
		Comparator<Student_Mx> nameSort = new Comparator<Student_Mx>() {
			
			@Override
			public int compare(Student_Mx o1, Student_Mx o2) {
				
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};
		
		Comparator<Student_Mx> marksSort = new Comparator<Student_Mx>() {
			
			@Override
			public int compare(Student_Mx o1, Student_Mx o2) {
				
				return o2.getMarks()-o1.getMarks();
			}
		};
		Set<Student_Mx> list = null;
		System.out.println("Enter Your choice ...");
		System.out.println("1. For RollNo Wise Sort.");
		System.out.println("2. For Name Wise Sort ");
		System.out.println("3. For Marks Wise Sort.");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1 : 
			list = new TreeSet<Student_Mx>(rollsort);
			break;
		case 2 : 
			list = new TreeSet<Student_Mx>(nameSort);
			break;
		case 3 : 
			list = new TreeSet<Student_Mx>(marksSort);
			break;
		default :
			System.out.println("Wrong Choice...");
		}
		
		list.add(new Student_Mx(13, "Kapil",60));
		list.add(new Student_Mx(24, "Rohan", 50));
		list.add(new Student_Mx(45, "Nayan", 70));
		list.add(new Student_Mx(35, "Akhil", 90));
		list.add(new Student_Mx(26, "Prashik", 45));
		
		Object[] sarry=list.toArray();  // Converting List to array
		// Here 1st You have to store in Object[] only compulsary
		
		// Then you can Cast into anybody
		
		for(int i =0;i<2;i++) {
			Student_Mx stu=(Student_Mx)sarry[i];
			System.out.println((i+1) + " : Topper :- Name = "+stu.getName()+" , Roll No : "+stu.getRollno()+" , Marks : "+stu.getMarks());
		}
		
	}

}
