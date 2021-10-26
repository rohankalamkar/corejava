package ToString;

public class Test {
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.rollno=1;
		s.name="Rohan";
		s.College="Bdcoe";
		s.address="Wardha";
		
		System.out.println("Roll Number : "+s.rollno);
		System.out.println("Name : "+s.name);
		System.out.println("Address : "+s.address);
		System.out.println("College : "+s.College);
		
		
		System.out.println(s);    // ToString.Student@15db9742    // this hashCode comes from toString Object class in java
		System.out.println(s.toString());  //ToString.Student@15db9742    
		System.out.println(s.getClass());  //class ToString.Student
		System.out.println(s.hashCode());  // 366712642
		
		
	}

}
