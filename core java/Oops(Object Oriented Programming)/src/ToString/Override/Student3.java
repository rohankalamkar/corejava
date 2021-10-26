package ToString.Override;

public class Student3 {
	private String sname;
	private String branch;
	private int rollno;
	private Address3 addr;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address3 getAddr() {
		return addr;
	}
	public void setAddr(Address3 addr) {
		this.addr = addr;
	}
	
//	@Override
//	public String toString() {
//		return "Student Details : Name = "+sname+" , Branch = "+branch+" . Roll Number = "+rollno+"\n"+addr;
//	}
	
	@Override
	public String toString() {
		return "Student Details : Name = "+getSname()+" Branch : "+getBranch()+" RollNumber = "+getRollno()+"\n"+getAddr();
	}

}
