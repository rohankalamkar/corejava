package ByMe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		System.out.println(list);       // [100, 200, 300, 400, 500]
		
		
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext()) {
			int x =itr.next();
			if(x==300) {
				list.add(900);
			}
		}
		System.out.println("After : "+list);   // [100, 200, 300, 400, 500, 900]
		
		
		
		
		
		
		
	}

}
