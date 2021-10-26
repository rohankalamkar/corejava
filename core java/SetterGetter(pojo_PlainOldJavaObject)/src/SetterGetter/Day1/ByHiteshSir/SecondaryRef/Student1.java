package SetterGetter.Day1.ByHiteshSir.SecondaryRef;

public class Student1 {
	private int rollno;
	private String name;
	private Address1 addr;
	
	
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
	public void setAddr(Address1 addr) {
		this.addr = addr;
	}
	public  Address1 getAddr() {
		return addr;
	}
	
	public Student1(int rollno,String name,Address1 addr) {
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
		
	}
	
	
}
