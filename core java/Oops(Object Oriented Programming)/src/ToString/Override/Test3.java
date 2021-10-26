package ToString.Override;

public class Test3 {
	public static void main(String[] args) {
		
		Address3 ad = new Address3();
		ad.setPincode(200112);
		ad.setCity("Wardha");
		
		Student3 s = new Student3();
		s.setSname("Rohan");
		s.setRollno(12);
		s.setBranch("Mech");
		s.setAddr(ad);
		
		System.out.println(s);
		
	}

}
