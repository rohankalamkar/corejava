package ToString.Override;

public class Test2 {
	public static void main(String[] args) {
		
		Address2 ad = new Address2();
		ad.city = "Wardha";
		ad.pin ="201455";
		
		Student2 s=new Student2();
		s.college="BD";
		s.name="Rohan";
		s.rollno=1;
		s.addr=ad;
		
		System.out.println(s);
		
		
		
	}

}
