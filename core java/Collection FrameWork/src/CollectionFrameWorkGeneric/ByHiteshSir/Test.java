package CollectionFrameWorkGeneric.ByHiteshSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		List<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Nagpur");
		mh.add("Mumbai");
		System.out.println(mh);   // [Pune, Nagpur, Mumbai]
		
		List<String> gj = new ArrayList<String>();
		
		gj.add("GnadhiNagar");
		gj.add("Ahmedabad");
		gj.add("Surat");
		System.out.println(gj);   // [GnadhiNagar, Ahmedabad, Surat]
		
		
		List<List<String>> india = new ArrayList<>();
		
		india.add(mh);
		india.add(gj);
		System.out.println(india);   // [[Pune, Nagpur, Mumbai], [GnadhiNagar, Ahmedabad, Surat]]
		
		List<String> texas = new ArrayList<String>();
		texas.add("Austin");
		texas.add("Houston");
		
		List<String> colorado = new ArrayList<String>();
		colorado.add("Denver");
		colorado.add("Aurora");
		
		List<List<String>> usa = new ArrayList<List<String>>();
		usa.add(texas);
		usa.add(colorado);
		
		System.out.println(usa);    // [[Austin, Houston], [Denver, Aurora]]
		
		
		List<List<List<String>>> world = new ArrayList<List<List<String>>>();
		world.add(india);
		world.add(usa);
		System.out.println(world);
		// [[[Pune, Nagpur, Mumbai], [GnadhiNagar, Ahmedabad, Surat]], [[Austin, Houston], [Denver, Aurora]]]
		
		Iterator<List<List<String>>> itr=world.iterator();
		
		while(itr.hasNext()) {
			List<List<String>> itrworld=itr.next();
			Iterator <List<String>> itrcountry=itrworld.iterator();
			while(itrcountry.hasNext()) {
				 List<String> itrstate=itrcountry.next();
				 Iterator<String> itrcity=itrstate.iterator();
				 while(itrcity.hasNext()) {
					 String s=itrcity.next();
					 System.out.println(s);
				 }
			}
		}
		System.out.println("1-------------------------------------------------------------------------");
		int count=1;
		for(List<List<String>> cntry : world) {  // It directly take// No need here iterator();
			for(List<String> state : cntry) {
				for(String city :state) {
					System.out.println(count+"  : "+city);
					count++;
				}
			}
		}
	}

}
