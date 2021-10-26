package Sorting.CollectionsMethods.ByHiteshSir;

import java.util.List;

public class Test_2 {
	public static void main(String[] args) {
		List<String> it=UnmodifiebleList_2.readOnly();
		System.out.println(it);  // [Mango, Orange, Grapes, Apple, Banana]
		
		it.add("Dragon Fruit");   // UnsupportedOperationException
		// Now we cannot add anything. It becomes Rock now
		
		System.out.println(it);
		
		
		
	}

}
