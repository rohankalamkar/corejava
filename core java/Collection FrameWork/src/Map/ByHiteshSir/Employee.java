package Map.ByHiteshSir;

public class Employee {
	private int eid;
	private String name;
	private String designation;
	@Override
	public String toString() {
		return "Employee Details : Emp id : " + eid + ", Emp name : " + name + ", designation: " + designation;
	}
	public Employee(int eid, String name, String designation) {
		super();
		this.eid = eid;
		this.name = name;
		this.designation = designation;
	}
	
	

}
