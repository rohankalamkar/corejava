package ToString.Override;

public class Test {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.rollno=1;
		s.name= "Rohan Kalamkar";
		s.college = "BDCOE ";
		s.address="Wardha";
		
		Student s1= new Student();
		s1.rollno=2;
		s1.name="Akhil Kalamkar";
		s1.college = "BDCOE";
		s1.address="Wardha";
		System.out.println(s);
		System.out.println(s1);
		
	}

}
