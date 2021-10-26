package CollectionFrameWork.ByHiteshSir;

public class Employee1 {
	
	private int eid;
	private String ename;
	public Employee1(int eid, String ename) {
		
		this.eid = eid;
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		
		return "Employee Info : Employee ID : "+eid+" , Employee Name : "+ename;
	}
	
	

}
