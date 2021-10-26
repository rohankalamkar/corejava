package Map.ByHiteshSir;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class University {
	public static void main(String[] args) {
		Map<String,Student> stu=College.getStudInfo();
		
		Set<String> set=stu.keySet();
		Iterator<String> itr=set.iterator();
		System.out.println("By Normal Iterator: Step 1 ");
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println("Key : "+s+" : "+stu.get(s));
		}
		System.out.println("1_________________________________________________________________");
		
		// By EntryIterator 
		System.out.println("By Using Entry Set---------Iterator---------------");
		Set<Entry<String, Student>> entrySet = stu.entrySet();
		Iterator<Entry<String, Student>> itr1 = entrySet.iterator();
		while(itr1.hasNext()) {
			Entry<String, Student> ad = itr1.next();
			System.out.println("Key : "+ad+" : "+stu.get(ad));
		}
		
		System.out.println("2____________________________________________________________________");
		System.out.println("By Using Entry Set---------ForEach/Enhanced---------------");
		
		for(Entry<String,Student> es:entrySet) {
			System.out.println("Key : "+es+" : "+stu.get(es));
		}
		
		System.out.println("3_____________________________________________________________________");
		
		for(String s1:set) {
			System.out.println("Key : "+s1+" : "+stu.get(s1));
		}
		System.out.println("4_____________________________________________________________________");
		
		System.out.println("By Iterating Without using Iterator.");
		// You cannot iterator Set / Map elemenets without using iterator/foreach
		// Reason : set are not following index pattern (Insersion order) not maintained here 
		// List Maintained Index pattern so We can iterate without Iterator/foreach
		// In Map get() method available Bu
		for(int i = 0;i<set.size();i++) {
			
			System.out.println(set);
		}
		
		
		
		
		
		
	}

}
