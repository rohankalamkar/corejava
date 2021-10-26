package SetterGetter.Day1.ByHiteshSir.SecondaryRef;

public class Test1 {
	public static void main(String[] args) {
		
	
	Address1 a = new Address1("Pune","Rahatani");
	Student1 s = new Student1(15,"Kalamkar",a);
	s.setName("Rohan ");    // with the help of setters you can change the arguments
	
	System.out.println(s.getName());
	System.out.println(s.getRollno());
	System.out.println(s.getAddr().getAreaname());
	System.out.println(s.getAddr().getCityname());
	
	
	
	}
}
