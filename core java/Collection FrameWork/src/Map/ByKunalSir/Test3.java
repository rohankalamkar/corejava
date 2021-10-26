package Map.ByKunalSir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
		// Communication of Collection interface and Map interface
		
		List<String> mh = new ArrayList<String>();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		List<String> jh = new ArrayList<String>();
		jh.add("Ranchi");
		jh.add("Lohardaga");
		jh.add("Bokaro");
		
		//Now 
		Map<String,List<String>> india = new HashMap<String, List<String>>();
		
		india.put("Maharashtra", mh);
		india.put("Jharkhand", jh);
		
		Set<String> country=india.keySet();  // {} convert to []
		
		for(String s:country) {
			
			System.out.println("State :  "+s);
			List<String> state=india.get(s);
			for(String city:state) {
				System.out.println("City Name : "+city);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
