package CollectionFrameWork.ByHiteshSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		
		
		
		List l = new ArrayList();
		l.add(new Student1(1, "Rohan Kalamkar"));// add(); method implements in some other class, which cannot be discolsed, but its parent is List interface
		l.add(50);
		l.add("XYZ");
		l.add(new Employee1(101,"Chetan Kalamkar"));	
		l.add("Kai po Che");
		l.add(new Student1(2,"Nayan Sawai"));
		l.add(new Employee1(110, "Akhil Kalamkar"));
		
		//System.out.println(l);
		//[Student Info : Roll no : 1 , Name : Rohan Kalamkar, 50, XYZ, Employee Info : Employee ID : 101 , Employee Name : Chetan Kalamkar, Kai po Che, Student Info : Roll no : 2 , Name : Nayan Sawai, Employee Info : Employee ID : 110 , Employee Name : Akhil Kalamkar]
		// By using toString Method
			
		//[CollectionFrameWork.ByHiteshSir.Student1@15db9742, 50, XYZ, CollectionFrameWork.ByHiteshSir.Employee1@6d06d69c, Kai po Che, CollectionFrameWork.ByHiteshSir.Student1@7852e922, CollectionFrameWork.ByHiteshSir.Employee1@4e25154f]
		//Without toString method
		
		// Now I have no idea whats in List ,
		// Task is how to retrieve data from list 
		// We have to iterate all data
		// iteration means Repeatation of process
		
		Iterator itr=l.iterator();   // iterator() method present in List interface.
		//iterator() method is Iterator interface return type, and present in List interface 
		// iterator() method is 
		// hasNext() , next() method present in Iterator interface 
	    // hasNext() boolean return  // present in Iterator interface
		//System.out.println(itr);     // java.util.ArrayList$Itr@15db9742
		while(itr.hasNext()) {
			Object o = itr.next();  // next() present Iterator interface 
			// next() returns Object. 
			if(o instanceof Integer) {
				int x=(int)o;
				System.out.println(x);
			}
			else if(o instanceof String) {
				String s =(String)o;
				System.out.println(s);
			}
			else if(o instanceof Student1) {
				Student1 stu=(Student1)o;
				System.out.println(stu);
			}
			else if(o instanceof Employee1) {
				Employee1 empl=(Employee1)o;
				System.out.println(empl);
			}
		}
	}
}
