package StaticKeyWord;

public class Student1 {
	private int rollno ; //Instance variable
	private String name ; // Instance Variable
	private String address; // Instance Variable
	private static String college;   // static variable
	
	
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public int getRollno() {
		return rollno;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setCollege( String college) {
		this.college= college;
	}
	public String getCollege() {
		return college;
	}

}
