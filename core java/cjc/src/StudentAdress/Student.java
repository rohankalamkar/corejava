package StudentAdress;

public class Student {
	int rollno;
	String name;
	Address addr;
	public Student(int rollno,String name,Address addr) {
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
		
	}
	public void details() {
		
		System.out.println("Roll Number : "+rollno);
		System.out.println("Name is : "+name);
		System.out.println("City Name is : "+addr.cityname);
		System.out.println("Area Name is : "+addr.areaname);
		System.out.println("-------------------------------");
		
	}

}
