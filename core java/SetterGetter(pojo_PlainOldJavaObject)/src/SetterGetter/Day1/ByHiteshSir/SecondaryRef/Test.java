package SetterGetter.Day1.ByHiteshSir.SecondaryRef;

public class Test {
public static void main(String[] args) {
	Address a = new Address();
	a.setAreaname("Hinjewadi Phase1");
	a.setCityname("Pune");

	Student s = new Student();
	s.setRollno(1);
	s.setName("Rohan Kalamkar");
	s.setAddr(a);
	
	System.out.println(s.getRollno());
	System.out.println(s.getName());
	System.out.println(s.getAddr().getAreaname());
	System.out.println(s.getAddr().getCityname());







}
	

}
