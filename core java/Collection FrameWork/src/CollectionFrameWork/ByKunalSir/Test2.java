package CollectionFrameWork.ByKunalSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		
		List al = new ArrayList();
		
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		System.out.println(al);  // [AAA, BBB, CCC, DDD, EEE]
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {  // hasNext() is boolean return type method // hasNext() method just checking Next index is present is or not.
			String s=(String)itr.next();    // next() is Object return type method
			         // next() method returning current index +(&) Shifting towards next index  
			System.out.println(s);
		}
		
		
		
		
	}

}
