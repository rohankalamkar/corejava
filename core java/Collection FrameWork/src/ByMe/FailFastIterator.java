package ByMe;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {
	public static void main(String[] args) {
		ArrayList< Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		System.out.println(list);
		int count=0;
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext()) {
			int x =itr.next();
			count++;
			if(x==300) {
				//list.add(2, 900);
				list.remove(2);
				System.out.println(count+"  :  "+list);
				
			}
			System.out.println(count+"  :  " +x);
			
			
		}
		
		System.out.println(list);
		
		
		
		
		
	}

}
