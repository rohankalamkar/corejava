package IteratorTypes.byHiteshSir;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		System.out.println(list);   // [100, 200, 300, 400, 500]
		ListIterator<Integer> itr=list.listIterator();  // Cursor at 0 position (By default position)
		
		System.out.println("--------Forward---------");
		while(itr.hasNext()) {   // Cursor at 0 position now  // It is checking towards 1 i.e.(0) index yes element present and entering into loop
		
			
			int x = itr.previous();  // now Cursor(0) to cursor(-1) and no element there so   // NoSuchElementException
		System.out.println("Previous Number : "+x);
		}
		
		
		// For this : 
		// Solution is : 
		// We have set the cursor for printing from reverse
		
		
		
	}

}
