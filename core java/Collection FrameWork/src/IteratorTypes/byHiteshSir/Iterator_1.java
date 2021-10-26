package IteratorTypes.byHiteshSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_1 {
	public static void main(String[] args) {
		// 1 . Iterator() class 
		
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		Iterator<Integer> itr=list.iterator();
		// Since jdk 1.2
		
		while(itr.hasNext()) {
			int x =itr.next();    // Read
			if(x==300) {
				itr.remove();     // Remove
			}
			System.out.println(list);   // Internal looping  // all printing 
		}
		//outside loop : It removes element
		System.out.println("after : "+list);
		
		
		
		
	}

}
