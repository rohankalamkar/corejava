package CollectionFrameWorkSorting.ByKunalSir;

public class Student2 implements Comparable<Student2>{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student2 o) {
		// for Sorting RollNo Wise(Integer)
		int x=this.rollno-o.rollno;  // For Ascending Order(Integer)
		System.out.println("1. x (Integer) Ascending : "+x);
		int x1 = o.rollno-this.rollno; // For Descending Order(Integer) 
		System.out.println("2. x1 (Integer) Descending : "+x1);
		
		// For Sorting Name Wise (String) 
		int y = this.name.compareTo(o.name);  // For Ascending Order(compareTo method convert String comparison result into integer value)
		System.out.println("3. y (String) Ascending : "+y);
		int y1 =o.name.compareTo(this.name);  // For Descending Order
		System.out.println("4. y1 (String) Descending : "+y1);
	
		return x;
	}
	

}
