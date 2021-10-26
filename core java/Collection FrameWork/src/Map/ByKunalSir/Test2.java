package Map.ByKunalSir;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		
		m.put(5, "Java");
		m.put(10, "Python");
		m.put(15, "Spring");
		
		System.out.println(m);   // {5=Java, 10=Python, 15=Spring}
		
		Set<Integer> ke=m.keySet();   // It similar to iterator method
		for(int key:ke) {
			System.out.println(key);
			String value=m.get(key);
			System.out.println(value);
			System.out.println("--------------");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
