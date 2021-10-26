package CollectionFrameWork.ByKunalSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test5 {
	
	// List ke andar List(inception of List)
	
	public static void main(String[] args) {
		
		List mh = new ArrayList();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		System.out.println(mh);   // [Pune, Mumbai, Nagpur]
		List jh = new ArrayList();
		jh.add("Ranchi");
		jh.add("Lohardaga");
		System.out.println(jh);  // [Ranchi, Lohardaga]
		
		List india = new ArrayList();
		india.add(mh);
		india.add(jh);
		
		System.out.println(india);  // [[Pune, Mumbai, Nagpur], [Ranchi, Lohardaga]]
		
		 Iterator itr=india.iterator();  // For india
		while(itr.hasNext()) {
			List I=(List)itr.next();
			Iterator itr1 = I.iterator();  // for mh and jh
			while(itr1.hasNext()) {
				String city=(String)itr1.next();
				System.out.println(city);
			}
			
			
		}
		
		
		
		
	}

}
