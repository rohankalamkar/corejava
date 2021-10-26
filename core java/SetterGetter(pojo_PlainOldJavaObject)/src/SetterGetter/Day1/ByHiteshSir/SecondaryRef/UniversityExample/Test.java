package SetterGetter.Day1.ByHiteshSir.SecondaryRef.UniversityExample;

public class Test {
	public static void main(String[] args) {
		University u = new University();
		u.setUname("Rashtrasant Tukdoji Maharaj Nagpur University");
		u.setAddress("Nagpur");
		
		
		College c = new College();
		c.setCname("BDCOE");
		c.setYear(1981);
		c.setUni(u);
		
		Student s = new Student();
		s.setName("Rohan Kalamkar");
		s.setRollno(29);
		s.setClg(c);
		
		System.out.println("Student Details : ");
		System.out.println("Student Name : "+s.getName());
		System.out.println("Student Rollno : "+s.getName());
		System.out.println("Student College Name : "+s.getClg().getCname());
		System.out.println("Student College Established Year : "+s.getClg().getYear());
		System.out.println("Student College University Name : "+s.getClg().getUni().getUname());
		System.out.println("Student College University Address : "+s.getClg().getUni().getAddress());
		System.out.println("-----------------------------------------------------------------------");
		
		
		
		
		
	}

}
