package Interface.MarkerInterface.Clonning.DeepCloning;

public class Test {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student();
		s1.setName("Rohan");
		s1.setRollno(1);
		System.out.println("S1 HashCode : "+s1.hashCode());
		System.out.println(s1);
		
		Student s2 =(Student)s1.clone();
		System.out.println("S2 Hashcode : "+s2.hashCode());
		s2.setName("Akhil");
		s2.setRollno(2);
		System.out.println(s1);
		System.out.println(s2);
		
		Student s3 = (Student)s1.clone();
		System.out.println("S3 Hashcode : "+s3.hashCode());
		s3.setName("Nayan");
		s3.setRollno(3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Student s4 = (Student)s1.clone();
		s4.setName("Kapil");
		s4.setRollno(4);
		System.out.println("S4 Hashcode : "+s4.hashCode());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	
		
		
		
		
	}

}
