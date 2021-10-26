package CollectionFrameWorkGeneric.ByKunalSir;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	
	public static void main(String[] args) {
		
		// Without Generic
		List l = new ArrayList();
		l.add(20);
		l.add(5);
		l.add(30);
		l.add("abc");  // No error
		
		System.out.println(l);   // [20, 5, 30, abc]   // Every index has its own id
		
		int x =(int)l.get(0);  // type cast required every time to get value of that index
		int y = (int)l.get(1);
		int z = (int)l.get(2);
		String s = (String)l.get(3);
		
		System.out.println(x+" "+y+" "+z+" "+ s);  // 20 5 30 abc
		
		// With Generic
		List<Integer> l1 = new ArrayList<>();
		l1.add(20);
		l1.add(5);
		l1.add(30);
		//l1.add("abc");  //Error : The method add(Integer) in the type List<Integer> is not applicable for the arguments (String) 
		
		int a = l1.get(0);   // Here no need to type cast
		int b = l1.get(1);
		int c = l1.get(2);
		//int d = l1.get(3);   // IndexOutOfBoundsException
		//String s1 = l1.get(1);  //Compilation Error:  Type mismatch: cannot convert from Integer to String
		// With generic , it overcome class cast exception problem
		
		System.out.println(a+" "+b+" "+c);  // 20 5 30
		
	}

}
