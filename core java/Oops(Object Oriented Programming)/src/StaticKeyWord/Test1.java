package StaticKeyWord;

public class Test1 {
	public static void main(String[] args) {
		
		Student1 s = new Student1();
		s.setRollno(1);
		s.setName("Rohan Kalamkar");
		s.setAddress("Wardha");
		s.setCollege("BDCOE");
		
		System.out.println(s.getRollno()+" "+s.getName()+ " "+ s.getAddress()+" "+s.getCollege());
		
		Student1 s1 = new Student1();
		s1.setRollno(2);
		s1.setName("Kapil Jawade");
		s1.setAddress("Pune");
		
		System.out.println(s1.getRollno()+" "+s1.getName()+ " "+ s1.getAddress()+" "+s1.getCollege());
		
		
		
	}

}
