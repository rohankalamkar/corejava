package CollectionFrameWorkGeneric.ByHiteshSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
	public static void main(String[] args) {
		
		// Use Generic
		// Create List for different sport like Cricket, Hockey , Football
		// Create List Sport and add all sports into that list
		// Iterate using iterator and for loop
		
		
		
		List<String> cricket = new ArrayList<String>();
		cricket.add("Bat");
		cricket.add("Ball");
		cricket.add("HandGloves");
		cricket.add("Stumps");
		
		List<String> hockey = new ArrayList<String>();
		hockey.add("Hockey Stickes");
		hockey.add("Hockey Ball");
		hockey.add("Hockey Pads");
		
		List<String> football = new ArrayList<String>();
		football.add("Football");
		football.add("Football Shoes");
		
		List<List<String>> sports = new ArrayList<List<String>>();
		sports.add(cricket);
		sports.add(hockey);
		sports.add(football);
		
		System.out.println(sports);
		//[[Bat, Ball, HandGloves, Stumps], [Hockey Stickes, Hockey Ball, Hockey Pads], [Football, Football Shoes]]
		String sname[]={"Cricket","Hockey","Football","null","null","null"};
		int count=0;
		// By using iterator();
		Iterator<List<String>> itr=sports.iterator();
		while(itr.hasNext()) {
			List<String> sprt=itr.next();
			Iterator<String> s =sprt.iterator();
			System.out.println("Ascessorries for :  "+sname[count]);
			count++;
			while(s.hasNext()) {
				
				String inst=s.next();
				System.out.println(inst);
				
			}
		}
		System.out.println("------------------------------------------------------------");
		count=0;
		for(List<String> sp : sports) {
			System.out.println("Ascessorries for :  "+sname[count]);
			count++;
			for(String asc : sp) {
				System.out.println(asc);
			}
		}
		
		
		
		
	}

}
