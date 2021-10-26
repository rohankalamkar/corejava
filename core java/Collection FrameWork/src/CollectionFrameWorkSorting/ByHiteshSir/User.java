package CollectionFrameWorkSorting.ByHiteshSir;

import java.util.Comparator;

public class User implements Comparable<User> {
	private int uit;
	private String name;
	private String adress;
	public User(int uit, String name, String adress) {
	
		this.uit = uit;
		this.name = name;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "User Details : uit = " + uit + ", name = " + name + ", adress = " + adress ;
	}
	@Override
	public int compareTo(User o) {
		int x=this.uit-o.uit;  // For Ascending Order.(Integer)
		int x1= o.uit-this.uit;  // For Descending Order (Integer)
		System.out.println(x);
		
		int y = this.name.compareToIgnoreCase(o.name);  // For Ascending Order(String)
		int y1 = o.name.compareToIgnoreCase(this.name); // For Descending Order(String)
		
		int z = this.adress.compareToIgnoreCase(o.adress); // For Ascending Order(String)
		int z1= o.adress.compareTo(this.adress); // For Descending Oder(String) 
		
		return z;
		
		//return 0;  // this means returning 0 index from set 
	}
}
