package Sorting.CollectionsMethods.ByHiteshSir;

import java.util.Collections;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		
		List<String> s=UnmodifiebleList_1.readOnly();
		
		System.out.println(s);   // [Mango, Orange, Grapes, Apple, Banana]
		
		s.add("DragonFruit");
		System.out.println(s);  // [Mango, Orange, Grapes, Apple, Banana, DragonFruit]
		
		// Why this list modifieng  after Collections.unmodifiableList(item); 
		
		// Answer : Because it is return type method and returning List.
		// If it is a Void method. Then it might be possible to Stop its execution
		
		// We have to store this value in List parameter and that parameter return into readOnly method
		
		// See 
	}

}
