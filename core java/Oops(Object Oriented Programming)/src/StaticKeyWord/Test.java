package StaticKeyWord;

public class Test {
	public static void main(String[] args) {
		
		Student.college="BDCOE";
		
		Student s = new Student();
		s.rollno = 1;
		s.name = "ABC";
		s.address = "Wardha";
		
		
		
		System.out.println(s.rollno + " "+ s.name + " "+ s.address +" " + Student.college);
		
		Student s1 = new Student();
		s1.rollno=2;
		s1.name = "PQR";
		s1.address= "Nagpur";
		s1.college = "DattaMeghe";
		
		
		System.out.println(s1.college);
		
		System.out.println(s1.rollno + " "+ s1.name + " "+ s1.address +" " + Student.college);
		
	}

}
