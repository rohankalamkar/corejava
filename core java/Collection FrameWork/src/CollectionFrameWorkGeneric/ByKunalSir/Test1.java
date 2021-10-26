package CollectionFrameWorkGeneric.ByKunalSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		System.out.println(l);   // [10, 20, 30, 50]
		// We have to iterate this list
		
		// First method to iterate
		Iterator<Integer> itr=l.iterator();
		
		while(itr.hasNext()) {
			int x = itr.next();
			
			System.out.println(x);
		}
		// Second method to iterate
		// By using enhance loop/ for each loop
		int count = 1;
		for(int num : l) {
			
			
			System.out.println(count+"   "+num);
			count++;
		}
		
		
		
		
		
	}

}
