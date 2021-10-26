package ToString.Override;

public class Student {
	String name;
	int rollno;
	String college;
	String address;
	@Override
	public String toString() {
		return "Name : "+name+" Rollno : "+rollno+" College : "+college+ " Address : "+address;
	}

}
