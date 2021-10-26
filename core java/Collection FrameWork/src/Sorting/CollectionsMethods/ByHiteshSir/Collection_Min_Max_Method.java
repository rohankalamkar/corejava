package Sorting.CollectionsMethods.ByHiteshSir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_Min_Max_Method {
	public static void main(String[] args) {
		
		List<String> item = new ArrayList<>();
		item.add("Mango");
		item.add("Orange");
		item.add("Grapes");
		item.add("Apple");
		item.add("Banana");
		
		
	
		String s_min=Collections.min(item);
		System.out.println(s_min);   // Apple   // Sorting according to Alphbetical
		
		String s_max=Collections.max(item);
		System.out.println(s_max);  // Orange
		
	}

}
