package IteratorTypes.byHiteshSir;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_1 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		System.out.println(list);   // [100, 200, 300, 400, 500]
		
		ListIterator<Integer> itr=list.listIterator();
		// ListIterator works only on List Interface classes
		// Not Working on set
		
		while(itr.hasNext()) {
			int x=itr.next();
			if(x==300) {  // Limitation : ListIterator  methods operates individually, No other methods from ListIterator perform on 
				//itr.add(900);  // It will add 900 at next to last index position
				//itr.remove();  // void method // Removes 300 from list
				itr.set(800);  // It will set at 300 positions
			}
			if(x>300 && x<=500) {
				//itr.remove();  // It remove all element 
				//itr.set(250);  // and Replacing positions of elements from 300 to 500
			}
			
			
		}
		System.out.println(list);   // [100, 200, 300, 900, 400, 500]
		
		// all methods You can use in condition ; and problem is you can perform only one operation at a single time
		// else it will give you  IllegalStateException

	}
}
