package Interface.MarkerInterface.Clonning.DeepCloningWithoutCloneable;

public class Employee {
	private int eid;
	private String ename;
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	
	public Employee copy() {
		Employee copyObject = new Employee();
		copyObject.eid = eid;
		copyObject.ename=ename;
		return copyObject;
	}
	
	

}
