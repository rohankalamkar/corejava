package CollectionFrameWorkGeneric.ByHiteshSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> maharashtra = new ArrayList<>();
		maharashtra.add("Mumbai");
		maharashtra.add("Pune");
		maharashtra.add("Nagpur");
		System.out.println(maharashtra);  // [Mumbai, Pune, Nagpur]
		
		List<String> gujrat = new ArrayList<String>();
		gujrat.add("Ahmedabad");
		gujrat.add("GandhiNagar");
		System.out.println(gujrat); // [Ahmedabad, GandhiNagar]
		
		List<List<String>> india = new ArrayList<>();
		india.add(maharashtra);
		india.add(gujrat);
		System.out.println(india);  // [[Mumbai, Pune, Nagpur], [Ahmedabad, GandhiNagar]]
		
		List<String> california = new ArrayList<String>();
		california.add("HollyWood");
		california.add("Los Angeles");
		System.out.println(california); // [HollyWood, Los Angeles]
		
		List<String> florida = new ArrayList<String>();
		florida.add("Panama City");
		florida.add("Miami");
		System.out.println(florida);  // [Panama City, Miami]
		
		List<List<String>> USA = new ArrayList<List<String>>();
		USA.add(california);
		USA.add(florida);
		System.out.println(USA);  // [[HollyWood, Los Angeles], [Panama City, Miami]]
		
		List<List<List<String>>> World = new ArrayList<List<List<String>>>();
		World.add(india);
		World.add(USA);
		System.out.println(World);   // [[[Mumbai, Pune, Nagpur], [Ahmedabad, GandhiNagar]], [[HollyWood, Los Angeles], [Panama City, Miami]]]
		
		Iterator<List<List<String>>> globe=World.iterator();
		while (globe.hasNext()) {
			List<List<String>> country=globe.next();
			Iterator<List<String>>state =country.iterator();
			while(state.hasNext()) {
				List<String> city =state.next();
				Iterator<String> cityname=city.iterator();
				while(cityname.hasNext()) {
					String s = cityname.next();
					System.out.println(s);
				}
			}
		}
		System.out.println("1----------------------------------------------------------");
		for(List<List<String>> globe1 : World) {
			for(List<String> country1: globe1) {
				for(String state : country1) {
					System.out.println(state);
				}
			}
		}
		
	}

}
