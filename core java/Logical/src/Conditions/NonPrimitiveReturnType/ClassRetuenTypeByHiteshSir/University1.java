package Conditions.NonPrimitiveReturnType.ClassRetuenTypeByHiteshSir;

public class University1 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.setRollno(1);
		s1.setName("Rohan Kalamkar");
		s1.setCollege("BDCOE");
		
		Student1 s2 = new Student1();
		s2.setRollno(2);
		s2.setName("Kapil Jawade");
		s2.setCollege("YCC");
		
		College1 c = new College1();
		c.setInfo(s1);
		c.setInfo(s2);
		
		
		
		
	}

}
