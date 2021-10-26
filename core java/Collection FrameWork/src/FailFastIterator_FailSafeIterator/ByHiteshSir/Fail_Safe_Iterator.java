package FailFastIterator_FailSafeIterator.ByHiteshSir;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Fail_Safe_Iterator {
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		// CopyOnWriterArrayList is present in java.util.concurrent.*;
		// CopyOnWriterArrayList this class is synchronised 
		// Threfore It will not give ConcurrentModificationException
		
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		System.out.println("Before : "+list);  // Before : [40, 50, 60, 70, 80]
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext()) {
			int x = itr.next();
			if(x==50) {
				list.add(100);
				
			}
		}
		
		System.out.println("After : "+list);   // After : [40, 50, 60, 70, 80, 100]
		
		
		
	}

}
