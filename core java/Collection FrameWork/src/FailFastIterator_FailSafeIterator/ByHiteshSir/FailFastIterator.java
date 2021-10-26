package FailFastIterator_FailSafeIterator.ByHiteshSir;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		//ArrayList present in java.util.*;
		// It is not concurrent (non sysnchronised)
		
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		System.out.println(list);
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext()) {
			int x =itr.next(); // ConcurrentModificationException
			if(x==50) {        // Because of Thread Cross Not allowed here
				               // ArrayList methods are non Sysnchronised (non concurrent)
				list.set(1, 110);  // It is possible 
				list.add(100);   // ConcurrentModificationException
				// It is not possible, this concept is only related with adding new element or removing existing element
			// Because ArrayList method is non synchronised
			
			}
		}
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
