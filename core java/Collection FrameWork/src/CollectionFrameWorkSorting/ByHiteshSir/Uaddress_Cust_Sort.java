package CollectionFrameWorkSorting.ByHiteshSir;

import java.util.Comparator;

public class Uaddress_Cust_Sort implements Comparator<User_Cust> {

	@Override
	public int compare(User_Cust o1, User_Cust o2) {
		int z =o1.getAdress().compareToIgnoreCase(o2.getAdress()); // For Ascending(String)
		int z1 =o2.getAdress().compareToIgnoreCase(o1.getAdress()); // For Descending(String)
		
		
		return z;
	}
	
	
	

}
