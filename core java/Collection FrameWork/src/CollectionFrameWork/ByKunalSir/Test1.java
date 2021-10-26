package CollectionFrameWork.ByKunalSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List al = new ArrayList();  // List is interface and ArrayList is class
		
		
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(80);
		al.add(111);
		System.out.println(al);   // [10, 30, 50, 80, 111]
		
		Iterator itr = al.iterator();   // Iterator is interface , iterator() is method
		
		while(itr.hasNext()) {  //Boolean return type. Just checking the next element in the iteration is present or not.
			int x = (int)itr.next();  //next() method works:Calling current index And Shifting current index to next index
		    // next() is Object return type method
			System.out.println(x);
			
		}
		
		
		
		
		
	}

}
