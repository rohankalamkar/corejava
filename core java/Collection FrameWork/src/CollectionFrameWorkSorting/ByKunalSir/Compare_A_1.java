package CollectionFrameWorkSorting.ByKunalSir;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Compare_A_1 {
	public static void main(String[] args) {
		// Removing Duplicate values and Maintaining Insertion order
		
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
		
		Set<Integer> s = new HashSet<Integer>(l);
		System.out.println(s);  // [2, 3, 4, 5, 6, 9]
		
		
		// Here Hashset remove duplicate value  but
		// Insertion order will not maintained here
		Set<Integer> lhs = new LinkedHashSet<Integer>(l);
		System.out.println(lhs);  // [5, 3, 4, 6, 9, 2]
		// LinkedHashSet removes duplicate element and maintaining Insertion order also
	}

}
