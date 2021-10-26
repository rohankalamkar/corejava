package Conditions.NonPrimitiveReturnType.ClassRetuenTypeByHiteshSir;

public class Employee2 {
	private int eid;
	private String name;
	
	private String department;
	
	public void setEid(int eid) {
		this.eid = eid;
		
	}
	public int getEid() {
		return eid;
	}
	 
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	
	public Employee2(int eid,String name,String department) {
		this.eid = eid;
		this.department = department;
		this.name = name;
	}

}
