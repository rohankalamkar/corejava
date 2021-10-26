package CollectionFrameWorkSorting.ByKunalSir;

import java.util.Set;
import java.util.TreeSet;

public class Test1 {
	public static void main(String[] args) {
		// TreeSet 
		// here We do not implements comparable here yet
		Student1 s1 = new Student1();
		s1.setRollno(2);
		s1.setName("ccc");
		
		Student1 s2 = new Student1(); 
		s2.setName("aaa");
		s2.setRollno(1);
		
		Student1 s3 = new Student1(); 
		s3.setName("bbb");
		s3.setRollno(3);
		
		Set<Student1> s = new TreeSet<>();
		// TreeSet does not sort custom class(Student class here)
		// TressSet sorted Integer data, String data because Integer , String class implements Comparable interface 
		
		s.add(s1);   // ClassCastException   
		s.add(s2);   // ClassCastException
		s.add(s3);   // ClassCastException
		
		System.out.println(s);  // ClassCastException
	}

}
