package StudentAndAddress;

public class Test {
	public static void main(String[] args) {
		Address ad = new Address();
		ad.areaname= "Karve Nagar";
		ad.cityname = "Pune";
		
		
		Student s1 = new Student();
		s1.rollno = 1;
		s1.name = "Rohan";
		s1.addr = ad;
		
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.addr.areaname);
		System.out.println(s1.addr.cityname);
		
	}

}
