package CollectionFrameWorkSorting.ByHiteshSir;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Set<User> s = new TreeSet<User>();
		s.add(new User(5, "Rohan", "Wardha"));
		s.add(new User(3, "kapil", "Amravati"));
		s.add(new User(8, "Akhil","nagpur"));
		s.add(new User(7, "Shubham", "Satara"));
		// Without implementing Comparable in User
		//System.out.println(s);  // ClassCastException : Tree set sorting required implementing comparable or comparator
		
		// After Implementing Comparable in User // 
		System.out.println(s);
		// [User Details : uit = 3, name = kapil, adress = Amravati, User Details : uit = 5, name = Rohan, adress = Wardha, User Details : uit = 7, name = Shubham, adress = Satara, User Details : uit = 8, name = Akhil, adress = nagpur]
		
		for(User u:s) {
			System.out.println(u);
			System.out.println("-------------------------------------------");
		}
		System.out.println("*********************************");
		
		Iterator<User> itr=s.iterator();
		while(itr.hasNext()) {
			User u=itr.next();
			System.out.println(u);
			System.out.println("__________________________________________________");
		}
	}
}

