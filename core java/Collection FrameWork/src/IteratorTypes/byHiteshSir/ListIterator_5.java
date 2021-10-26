package IteratorTypes.byHiteshSir;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_5 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		System.out.println(list);   // [100, 200, 300, 400, 500]
		ListIterator<Integer> itr=list.listIterator(3);  // set cursor at(3) i.e. index 2
		// Since jdk 1.2
		
		while(itr.hasPrevious()) {  // cursor (3) means index 2 
			int x=itr.previous(); 
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
