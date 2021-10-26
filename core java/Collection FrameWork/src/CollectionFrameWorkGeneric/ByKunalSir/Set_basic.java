package CollectionFrameWorkGeneric.ByKunalSir;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_basic {
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<>();
		s.add("aaa");
		s.add("bbb");
		s.add("aaa");  // Duplicate not allowed
		// It will add but not stored in set
		s.add("ccc");
		
		System.out.println(s);   // [aaa, ccc, bbb]   // It doesnot follow index pattern
		              // It randomly saved into set
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			String s1=itr.next();
			System.out.println(s1);
			
		}
		System.out.println("1----------------------------------------------------");
		
		for(String val : s) {
			System.out.println(val);
		}
		
	}

}
