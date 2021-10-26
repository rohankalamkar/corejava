package Conditions.NonPrimitiveReturnType.ClassRetuenTypeByHiteshSir;

public class College {
	public Student getInfo() {    // We can create class return type in any other class directly but within folder 
		Student s1 = new Student();
		s1.setName("Rohan Kalamkar");
		s1.setRollno(1);
		s1.setCollege("BDCOE");
		return s1;
	
		}
	
	    
	

}
