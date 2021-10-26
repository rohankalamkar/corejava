package ByMe;

public class Student_Mx {
	private int rollno;
	private String name;
	private int marks;
	@Override
	public String toString() {
		return "Student_Mx Details [rollno = " + rollno + ", name = " + name + ", marks = " + marks ;
	}
	public Student_Mx(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	
	

}
