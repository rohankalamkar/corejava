package CollectionFrameWorkSorting.ByKunalSir;

import java.util.Comparator;

public class Cust_Rollno_Sort_3 implements Comparator<Student3> {
	// For Custom sorting
	//  According to our Requirement(like rollno, name),we design parameter
	// We have to customize it individually according to our requirement
	// We do not implement anything in Parent(Student here) class
	// Step 1 : Create Cust class (here Roll no (Integer type))
	// Step 2 : class implement Comparator interface
	// We use Comparator for custom class only
	// Step 3 : implements its abstract method Compare
	@Override
	public int compare(Student3 o1, Student3 o2) {
		int x =o1.getRollno()-o2.getRollno();   // For Ascending
		int x1=o2.getRollno()-o1.getRollno();   // For Descending(Reverse)
		return x;
	}
	



}
