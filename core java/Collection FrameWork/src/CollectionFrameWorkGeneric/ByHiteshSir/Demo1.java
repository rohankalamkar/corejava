package CollectionFrameWorkGeneric.ByHiteshSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		List <String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Nagpur");
		System.out.println(mh);
		List<List> india = new ArrayList<>();
		
		india.add(mh);
		System.out.println(india);
		
		Iterator<List> itr=india.iterator();
		
		while(itr.hasNext()) {
			List l=itr.next();
			Iterator s =l.iterator();
			while(s.hasNext()) {
				String name=(String)s.next();
				System.out.println(name);
			}
		}
		
	}

}
