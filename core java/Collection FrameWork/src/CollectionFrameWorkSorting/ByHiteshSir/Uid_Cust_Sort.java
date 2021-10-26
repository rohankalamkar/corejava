package CollectionFrameWorkSorting.ByHiteshSir;

import java.util.Comparator;

public class Uid_Cust_Sort implements Comparator<User_Cust>{

	@Override
	public int compare(User_Cust o1, User_Cust o2) {
		int x=o1.getUid()-o2.getUid();  // For Ascending Order (Integer)
		
		int x1 = o2.getUid()-o1.getUid(); // For Descending Order(Integer)
		return x;
	}
	

}
