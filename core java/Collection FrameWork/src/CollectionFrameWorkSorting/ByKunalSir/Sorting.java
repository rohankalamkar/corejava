package CollectionFrameWorkSorting.ByKunalSir;

import java.util.Set;
import java.util.TreeSet;

public class Sorting {
	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<>();
		s.add(4);
		s.add(2);
		s.add(6);
		s.add(5);
		s.add(1);
		
		System.out.println(s);  // [1, 2, 4, 5, 6]
		// TreeSet class already gives you sorted elements
		
		
		Set<String> s1 = new TreeSet<>();
		s1.add("bbb");
		s1.add("ccc");
		s1.add("aaa");
		s1.add("ddd");
		
		System.out.println(s1); // [aaa, bbb, ccc, ddd]
		
		// TreeSet Sorting directly because in class or their parent class implements Comparable or comparator
		
		
		// Therefore they giving us directly sorted elements
		
		
		
		
		
		
		
		
		
	}

}
