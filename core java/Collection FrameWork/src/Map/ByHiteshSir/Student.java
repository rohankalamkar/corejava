package Map.ByHiteshSir;

public class Student {
	
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
}
