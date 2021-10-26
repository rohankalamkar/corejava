package SetterGetter.Day1.ByHiteshSir.SecondaryRef.UniversityExample;

public class Student {
	private int rollno;
	private String name;
	private College clg;
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getRollno() {
		return rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setClg(College clg) {
		this.clg=clg;
	}
	public College getClg() {
		return clg;
	}
	

}
