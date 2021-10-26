package OOPSTestByKunalSir;

public class Test {
	public static void main(String[] args) {
		
		Address ad = new Address();
		ad.city="PUNE";
		ad.pin=442102;
		
		Student s =new Student();
		s.name="Rohan Kalamkar";
		s.rollno=1;
		s.addr=ad;
		
		System.out.println(s.name);
		System.out.println(s.rollno);
		System.out.println(s.addr.city);
		System.out.println(s.addr.pin);
		
		
	}

}
