package CollectionFrameWorkGeneric.ByKunalSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {

		List<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		System.out.println(mh); // [Pune, Mumbai, Nagpur]
		for (String s : mh) { // Pune
			System.out.println(s); // Mumbai
		} // Nagpur

		List<String> jh = new ArrayList<String>();
		jh.add("Ranchi");
		jh.add("Lohardaga");
		System.out.println(jh); // [Ranchi, Lohardaga]
		for (String s1 : jh) { // Ranchi
			System.out.println(s1); // Lohardaga
		}

		List<List<String>> india = new ArrayList<List<String>>();
		india.add(mh);
		india.add(jh);
		System.out.println(india); // [[Pune, Mumbai, Nagpur], [Ranchi, Lohardaga]]
		for (List l : india) {
			System.out.println(l); // [Pune, Mumbai, Nagpur]

			// [Ranchi, Lohardaga]
		}

		System.out.println("1---------------------------------------------------");
		Iterator<List<String>> itr = india.iterator();
		while (itr.hasNext()) {
			List<String> itr1 = itr.next();
			Iterator<String> s1 = itr1.iterator();
			while (s1.hasNext()) {
				String x = s1.next();
				System.out.println(x);

			}
		}
		System.out.println("2----------------------------------------------------");
		for (List<String> lst : india) {
			for (String city : lst) {
				System.out.println(city);
			}
		}

	}

}
