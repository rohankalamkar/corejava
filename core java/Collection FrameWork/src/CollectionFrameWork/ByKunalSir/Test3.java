package CollectionFrameWork.ByKunalSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		// If List Contains Mixed Elements, How to retrieve them.
		List i = new ArrayList();
		i.add(20);
		i.add("aaa");
		i.add(50);
		i.add("bbb");
		i.add(80);
		i.add("ccc");
		
		System.out.println(i);   // [20, aaa, 50, bbb, 80, ccc]
		
		Iterator itr=i.iterator();
		
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer) {
				int x = (int)o;
				System.out.println(x);
			}
			else if(o instanceof String) {
				String s=(String)o;
				System.out.println(s);
			}
				
		}
		
		
		
		
	}

}
