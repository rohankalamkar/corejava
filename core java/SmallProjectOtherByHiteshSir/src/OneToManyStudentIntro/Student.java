package OneToManyStudentIntro;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int rollno;
	private String name;
	private long mob;
	private List<String> courseList=null;//new ArrayList<String>();
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
