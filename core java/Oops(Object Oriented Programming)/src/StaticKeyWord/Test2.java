package StaticKeyWord;

public class Test2 {
	public static void main(String[] args) {
		
		Student2 s = new Student2(1, "Akhil Kalamkar", "Wardha");
		s.setCollege("YCC");
		
		System.out.println(s.getRollno()+" "+s.getName()+ " "+ s.getAddress()+" "+s.getCollege());
		
		Student2 s1 = new Student2(2, "Nayan Sawai", "Arvi");
		System.out.println(s1.getRollno()+" "+s1.getName()+ " "+ s1.getAddress()+" "+s1.getCollege());
		
	}

}
