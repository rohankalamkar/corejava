package SetterGetter.Day1.ByHiteshSir.SecondaryRef.NewTypeDefiningSecRef;



public class Test {
	public static void main(String[] args) {
		
	
	Address a = new Address();
	a.setAreaname("Hinjewadi Phase1");
	a.setCityname("Pune");
	
	Student s = new Student();
	s.setRollno(1);
	s.setName("Rohan Kalamkar");
	s.addr = a;
	
	System.out.println("Student Name : "+s.getName());
	System.out.println("Student Roll No : "+s.getRollno());
	System.out.println("Student Area Name : "+s.addr.getAreaname());
	System.out.println("Student CityName : "+s.addr.getCityname());
	
	}
}
