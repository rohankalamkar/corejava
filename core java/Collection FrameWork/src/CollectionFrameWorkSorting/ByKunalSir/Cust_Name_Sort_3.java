package CollectionFrameWorkSorting.ByKunalSir;

import java.util.Comparator;

public class Cust_Name_Sort_3 implements Comparator<Student3>{

	@Override
	public int compare(Student3 o1, Student3 o2) {
		int y =o1.getName().compareTo(o2.getName());
		int y1 =o2.getName().compareTo(o1.getName());
		return y;
	}
	

}
