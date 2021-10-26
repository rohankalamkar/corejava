package SecondaryReference.Day9.SecRefByKunalSir;

public class Test {
	public static void main(String []args){

		Address adr = new Address();     // it will create Address memory.

		adr.cityname = "Pune";

		adr.areaname = "Karve Nagar";

		Student s1 = new Student();

		s1.rollno = 1;
		s1.name = "Rohan Kalamkar";
		s1.addr=adr;           //this is very important to declare in secondary reference. With this reference Address memory stored in s1 object 
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.addr.cityname);
		System.out.println(s1.addr.areaname);

		}


}
