package IteratorTypes.byHiteshSir;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_6 {
	public static void main(String[] args) {
		// Printing from Backward 
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		System.out.println(list);   // [100, 200, 300, 400, 500]
		//ListIterator<Integer> itr=list.listIterator(5);  // set cursor at(5) i.e. index 4
		
		// or use this
		ListIterator<Integer> itr=list.listIterator(list.size());
		
		while(itr.hasPrevious()) {  // cursor (5) means index 4 
			int x=itr.previous(); 
			System.out.println(x);
		}
		
		
		
		
		
		
	}

}
