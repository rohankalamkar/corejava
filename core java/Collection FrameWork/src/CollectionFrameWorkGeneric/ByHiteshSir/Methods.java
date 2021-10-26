package CollectionFrameWorkGeneric.ByHiteshSir;

import java.util.ArrayList;
import java.util.List;

public class Methods {
	public static void main(String[] args) throws InterruptedException {
		
		List <Integer> l = new ArrayList<>();
		
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(30);
		
		System.out.println("First : "+l);  // [20, 30, 50, 70, 80, 90, 30]
		
		l.add(3, 100);
		
		System.out.println("After adding:  "+l);  // [20, 30, 50, 100, 70, 80, 90, 30] // Index increased by 1
		
		System.out.println("Contains : "+l.contains(50));  // true
		System.out.println("Contains : "+l.contains(150)); // false
		
		l.add(110);
		System.out.println(l);  // [20, 30, 50, 100, 70, 80, 90, 30, 110]
		System.out.println("LastIndexOf : "+l.lastIndexOf(30));   // 7
		System.out.println("indexOf : "+l.indexOf(30));   // 1
		System.out.println(l.lastIndexOf(50));   // 2
		
		//l.remove(Object o); //If you put object here It will consider as index 
		//System.out.println("Remove Object : "+l.remove(80));  // IndexOutOfBoundsException
		// It will consider 80 as index number.
		// So Observation : for removing any entity, You have to pass index number only
		 
		// Jugad for that   // If we dont know index number then use this technique
		Integer i = new Integer(80);
		System.out.println("Indirectly creating index : "+l.remove(i));  // true
		System.out.println(l);  // [20, 30, 50, 100, 70, 90, 30, 110]
		// or directly pass
		System.out.println(" Directly index "+l.remove(2));  // directly use index number
		System.out.println(l);  // [20, 30, 100, 70, 90, 30, 110]
		
		
		System.out.println("Set at 1 index:  "+l.set(1,35));  // 30 (it means replacing this element)
		System.out.println(l);
		
		System.out.println("Before : "+l);
		//List<Integer> subl = l.subList(4, 1);  // IllegalArgumentException
		List<Integer> subl = l.subList(2,5);
		System.out.println("1. After : "+subl);
		subl = l.subList(2,l.size());
		System.out.println("2. After : "+subl);
		System.out.println("Before Clear : "+l);
		l.sort(null);
		System.out.println(l); // sort whole list as ascending order
		l.clear();
		System.out.println("After Clear : "+l);
		System.out.println("is empty : "+l.isEmpty());
		l.add(500);
		l.add(600);
		l.add(700);
		System.out.println(l);
		
		System.out.println(l.isEmpty());
		
		
		
		
	}

}
