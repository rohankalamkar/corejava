package ToString.Override;

public class Student1 {
	private String name;
	private String College;
	private int rollno;
	private String address;

	public void setName(String name) {
		this.name = name;
	}

	public void setCollege(String college) {
		College = college;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Name : "+name+" Rollno : "+rollno+" College : "+ College+" Address : "+address;
	}
	
	

}
