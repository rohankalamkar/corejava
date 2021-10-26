package CollectionFrameWork.ByHiteshSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 {
	// List inside List
	public static void main(String[] args) {
		List mh = new ArrayList();
		mh.add("Pune");
		mh.add("Wardha");
		mh.add("Nagpur");
		
		List gj = new ArrayList();
		gj.add("AhmedNagar");
		gj.add("Vadodara");
		gj.add("Surat");
		
		List mp = new ArrayList();
		mp.add("Indore");
		mp.add("Gwalior");
		mp.add("Jabalpur");
		mp.add("AmarKantak");
		
		List india = new ArrayList();
		india.add(mh);
		india.add(gj);
		india.add(mp);
		
		System.out.println(india);
		//[[Pune, Wardha, Nagpur], [AhmedNagar, Vadodara, Surat], [Indore, Gwalior, Jabalpur, AmarKantak]]
		
		Iterator itr1=india.iterator();  // [0,1,2]  // For india Iteration(Repeatation)
		while(itr1.hasNext()) {
				List state=(List)itr1.next();
				Iterator itr2=state.iterator();  // For state Iteration(Repeatation)
				while(itr2.hasNext()) {
					String city=(String)itr2.next();
					System.out.println(city);
				}
			
			
			
			
		}
		
		
		
	}

}
