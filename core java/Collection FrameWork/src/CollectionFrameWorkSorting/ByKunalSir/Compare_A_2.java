package CollectionFrameWorkSorting.ByKunalSir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Compare_A_2 {
	public static void main(String[] args) {
		// How to sort list elements 
		
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(3);
		l.add(4);
		l.add(6);
		l.add(5);
		l.add(3);
		l.add(9);
		l.add(2);
		
		System.out.println(l);  // [5, 3, 4, 6, 5, 3, 9, 2]
		
		Set<Integer> s = new TreeSet<>(l);
		System.out.println(s);  // [2, 3, 4, 5, 6, 9]
		
		// Here Duplicate Values remove
		// But we dont want that, We want sorting with duplicate value
		
		
		
		// Solution For this.
		
		// Collection  = is interface
		// Collections = is class
		
		
		Collections.sort(l);
		int t = Collections.min(l);
		System.out.println("Min Value : "+t);
		int m=Collections.max(l);
		System.out.println("Max Value : "+m);
		System.out.println(l);  // [2, 3, 3, 4, 5, 5, 6, 9]
		
		
		
	}

}
