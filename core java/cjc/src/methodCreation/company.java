package methodCreation;

public class company {
	public static void main(String[] args) {
		employee s1=new employee();
		s1.name="Akhil Kalamkar";
		s1.age = 25;
		s1.salary=35000;
		s1.start();
		System.out.println("Name : "+ s1.name);
		System.out.println("Age : "+s1.age);
		System.out.println("Salary : "+s1.salary);
		System.out.println("----------------------");

		employee s2 = new employee();
		s2.name="Nayan Sawai";
		s2.age=24;
		s2.salary=40000;
		s2.start();
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.salary);




	}
	

}
