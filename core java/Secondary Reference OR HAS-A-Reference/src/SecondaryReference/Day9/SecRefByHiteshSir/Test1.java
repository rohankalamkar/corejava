package SecondaryReference.Day9.SecRefByHiteshSir;

public class Test1 {
	public static void main(String args[]){
		Address1 a = new Address1("Wardha","Sevagram",442001);
		Student1 s = new Student1(1,"Rohan Kalamkar",a);

		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(s.addr.areaname);
		System.out.println(s.addr.cityname);
		System.out.println(s.addr.pin);




		}

}
