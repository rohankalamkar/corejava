package Map.ByKunalSir;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
	public static void main(String[] args) {
		// Interview Question
		// Return value of put method    
		// Answer : It return (Previous) String value : 
		
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		System.out.println(m.put(5, "Java"));   // null
		System.out.println(m.put(10, "Python")); // null
		System.out.println(m.put(15, "Spring")); // null
		
		System.out.println("Before Duplicate key "+m); // Before Duplicate key{5=Java, 10=Python, 15=Spring}
		
		System.out.println(m.put(5, "CJC"));  // Java  (Show Previous value)  similar to set(index, element) method in ListArray 
		       // and replacing Java by CJC
		System.out.println("After Duplicate Key : "+m);   // {5=CJC, 10=Python, 15=Spring}
		
		String s =m.get(5);
		System.out.println(s);   // CJC
	}

}
