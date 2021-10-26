package Sorting.CollectionsMethods.ByHiteshSir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiebleList_2 {
	public static List<String> readOnly(){
		List<String> item = new ArrayList<>();
		item.add("Mango");
		item.add("Orange");
		item.add("Grapes");
		item.add("Apple");
		item.add("Banana");
		
		List<String> m_item=Collections.unmodifiableList(item);
		
		return m_item;
	}

}
