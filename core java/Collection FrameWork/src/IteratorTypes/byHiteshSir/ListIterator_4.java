package IteratorTypes.byHiteshSir;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_4 {
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
		System.out.println("-------Backward------");
		
		while(itr.hasPrevious()) {  // Not displaying because Cursor default position is 0 here 
			// hasPrevios method pointing towards -1 index and it is not present // It will skip this while loop without entering into it 
			int x=itr.previous();
			System.out.println(x);
		}
		
		
		
		
		
		
		
	}

}
