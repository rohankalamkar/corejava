package Map.ByKunalSir;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		  // Map is interface in java.util package
		  // Collection interface also present in java.util package
		  // Both are different But they can communicate because of same package
		m.put(5, "Java");
		m.put(10,"Python");
		m.put(15, "Spring");
		
		System.out.println(m);   // {5=Java, 10=Python, 15=Spring}   // Insertion order no mainatained here
		
		String value = m.get(10);
		
		System.out.println(value);  // Python
		
		
		
		
	}

}
