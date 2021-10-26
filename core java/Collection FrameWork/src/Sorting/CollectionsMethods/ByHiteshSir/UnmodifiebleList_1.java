package Sorting.CollectionsMethods.ByHiteshSir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiebleList_1 {
	// Interview Question
	public static List<String> readOnly(){
		List<String> item = new ArrayList<>();
		item.add("Mango");
		item.add("Orange");
		item.add("Grapes");
		item.add("Apple");
		item.add("Banana");
		
		Collections.unmodifiableList(item);
		
		return item;
	}
	

}
