package SetterGetter.Day1.ByKunalSir;

public class Test1 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.setRollno(12);
		s1.setName("xyz");
		
		Student1 s2 = new Student1();
		s2.setRollno(15);
		s2.setName("abc");
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		System.out.println(s2.getRollno());
		System.out.println(s2.getName());
		
	}

}
