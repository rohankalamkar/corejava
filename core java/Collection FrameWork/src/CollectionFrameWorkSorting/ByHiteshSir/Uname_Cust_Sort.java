package CollectionFrameWorkSorting.ByHiteshSir;

import java.util.Comparator;

public class Uname_Cust_Sort implements Comparator<User_Cust>{

	@Override
	public int compare(User_Cust o1, User_Cust o2) {  // Here Requires getter method only
		int y =o1.getUname().compareToIgnoreCase(o2.getUname());  // For Ascending Order(String) compare String variable and returns int value
		int y1 = o2.getUname().compareToIgnoreCase(o1.getUname()); // For Descending Order(String) 
		
		return y;
	}

}
