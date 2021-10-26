package ByMe;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	@Override
	public int compare(Student o1, Student o2) {
		int x = o1.getRollno()-o2.getRollno();
		return x;
	}

}
