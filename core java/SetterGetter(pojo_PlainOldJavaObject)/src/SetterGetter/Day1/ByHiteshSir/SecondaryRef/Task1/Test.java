package SetterGetter.Day1.ByHiteshSir.SecondaryRef.Task1;

public class Test {
	public static void main(String[] args) {
		Course c = new Course();
		c.setCid(25);
		c.setCname("Bachelor of Engineering in Mechanical Engineering ");
		
		Faculty f = new Faculty();
		f.setFid("BDF136");
		f.setFname("Prof. V. D. Gulhane Sir");
		f.setCourse(c);
		
		Batch b = new Batch();
		b.setBid(2021);
		b.setBname("Mechanical Regular Batch ");
		b.setFaculty(f);
		
		Student s = new Student();
		s.setSid(10);
		s.setSname("Apoorv Khade");
		s.setBatch(b);
		
		
		System.out.println("Student Details : ");
		
		System.out.println("Student Name : "+s.getSname());
		System.out.println("Student ID : "+s.getSid());
		System.out.println("Student Batch Name : "+s.getBatch().getBname());
		System.out.println("Student Batch ID : "+s.getBatch().getBid());
		System.out.println("Student Faculty Name : "+s.getBatch().getFaculty().getFname());
		System.out.println("Student Faculty ID : "+s.getBatch().getFaculty().getFid());
		System.out.println("Student Course Name : "+s.getBatch().getFaculty().getCourse().getCname());
		System.out.println("Course Name : "+s.getBatch().getFaculty().getCourse().getCid());
		
		
		
		
		
		
		
		
		
	}

}
