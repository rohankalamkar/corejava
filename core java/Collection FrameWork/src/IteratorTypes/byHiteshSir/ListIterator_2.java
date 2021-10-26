package IteratorTypes.byHiteshSir;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		System.out.println(list);   // [100, 200, 300, 400, 500]
		
		ListIterator<Integer> itr=list.listIterator();  //  Cursor Default position is 0 position and previos position is -1
		System.out.println("-------Forward-------");
		while(itr.hasNext()) {
			int x=itr.next();  // 0 1 2 3 4 (index)  // 1 2 3 4 5 (Cursor) Position
			int num = itr.nextIndex();// 1 2 3 4 5   // Default index(Curser) at 0 position so Next Index position is 0 
			
			System.out.println("Current : "+x);
			System.out.println("Next Index : "+num);
		}
		
		System.out.println("-------Backward--------");
		while(itr.hasPrevious()) {   // Now Cursor at 5 position
			
			int num2 = itr.previousIndex();  // 4 3 2 1 0
			int y=itr.previous(); // 4 3 2 1 0 
			
			System.out.println("Current : "+y);
			System.out.println("Previous Index : "+num2);
		}
		
	}

}
