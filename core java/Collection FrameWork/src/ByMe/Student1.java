package ByMe;

public class Student1 {
	private int rollno;
	private String name;
	private String address;
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public Student1(int rollno, String name, String address) {
	
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student Details - Roll Number : " + rollno + " , name : " + name + ", address : " + address;
	}
	

}
