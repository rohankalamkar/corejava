package SetterGetter.Day1.ByHiteshSir.SecondaryRef.NewTypeDefiningSecRef;

public class Test1 {
	public static void main(String[] args) {
		Address1 a = new Address1("Pune","Hinjewadi Phase1");
		Student1 s = new Student1(12,"Akhil Kalmkar",a);
		
		
		
		System.out.println("Student Name : "+s.getName());
		System.out.println("Student Roll No : "+s.getRollno());
		System.out.println("Student Area Name : "+s.addr.getAreaname());
		System.out.println("Student CityName : "+s.addr.getCityname());
	
	
	}

}
