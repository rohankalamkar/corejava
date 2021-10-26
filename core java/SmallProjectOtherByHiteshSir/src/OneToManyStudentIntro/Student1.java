package OneToManyStudentIntro;

import java.util.ArrayList;
import java.util.List;

public class Student1 {
	private int rollno;
	private String name;
	private long mob;
	private List<String> courseList=new ArrayList<String>();   // This constructor is useless. If we Creating new Constructor in Main Method
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
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public List<String> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<String> courseList) {
		this.courseList = courseList;
	}
	@Override
	public String toString() {
		return "Student [rollno = " + rollno + ", name = " + name + ", mob = " + mob + ", courseList = " + courseList + "]";
	}
	

}
