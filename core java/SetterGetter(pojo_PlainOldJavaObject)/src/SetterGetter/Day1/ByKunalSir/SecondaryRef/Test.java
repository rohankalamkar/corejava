package SetterGetter.Day1.ByKunalSir.SecondaryRef;

public class Test{
	public static void main(String[] args) {
		Address a = new Address();
		a.setAreaname("KarveNagar");
		a.setCityname("Pune");
		
		Student s = new Student();
		s.setRollno(1);
		s.setName("xyz");
		s.setAddr(a);
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddr().getAreaname());
		System.out.println(s.getAddr().getCityname());
		
		
	} 

}
