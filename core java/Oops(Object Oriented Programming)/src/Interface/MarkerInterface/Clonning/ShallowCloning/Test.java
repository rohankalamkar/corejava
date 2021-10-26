package Interface.MarkerInterface.Clonning.ShallowCloning;

public class Test {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("Rohan");
		s1.setRollno(1);
		System.out.println("S1 Hash Code : "+s1.hashCode());
		System.out.println(s1);
		
		Student s2 = s1; // It is called shallow clonning
		s1.setName("Kapil");
		s1.setRollno(2);
		
		System.out.println("S2 Hash Code : "+s2.hashCode());
		System.out.println(s1);
		System.out.println(s2);
		
		Student s3 = s2;
		
		s3.setName("Nayan");
		s3.setRollno(3);
		System.out.println("S3 Hashcode : "+s3.hashCode());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Student s4 = s2;
		System.out.println("S4 HashCode : "+s4.hashCode());
		s4.setName("Akhil");
		s4.setRollno(4);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		Student s5 = s4;
		System.out.println("S5 HashCode : "+s5.hashCode());
		s5.setName("Sagar");
		s5.setRollno(5);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		
		
		
		
	}

}
