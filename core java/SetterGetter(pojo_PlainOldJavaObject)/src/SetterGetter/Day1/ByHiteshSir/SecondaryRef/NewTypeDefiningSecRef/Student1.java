package SetterGetter.Day1.ByHiteshSir.SecondaryRef.NewTypeDefiningSecRef;

public class Student1 {
	private int rollno;
	private String name;
	Address1 addr;
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
	public Student1(int rollno,String name,Address1 addr) {
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
		
	}

	
}
