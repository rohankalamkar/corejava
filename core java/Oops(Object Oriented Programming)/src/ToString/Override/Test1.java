package ToString.Override;

public class Test1 {
	public static void main(String[] args) {
		
		Student1 s = new Student1();
		s.setRollno(1);
		s.setName("Rohan Kalamkar");
		s.setCollege("BDCOE");
		s.setAddress("Wardha");
		
		Student1 s1 = new Student1();
		s1.setRollno(2);
		s1.setName("Nayan Sawai");
		s1.setCollege("Walchand");
		s1.setAddress("Sangali");
		
		System.out.println(s);
		System.out.println(s1);
		
	}

}
