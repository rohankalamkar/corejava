package CollectionFrameWorkSorting.ByHiteshSir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiableList_1 {
	
	public static List<String> readOnly(){
		
		List<String> item = new ArrayList<String>();
		item.add("Orange");
		item.add("Apple");
		item.add("Grapes");
		item.add("Mango");
		item.add("Banana");
		
		Collections.unmodifiableList(item); // It is return method and returning List 
		                            // If it is void method then it might be possible to it 
		
		
		return item;
	}
	

}
