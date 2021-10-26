package SetterGetter.Day1.ByHiteshSir.SecondaryRef.NewTypeDefiningSecRef;

public class Bank1 {
	private String ifsc ; 
	private int id;
	private String bname;
	private String branch;
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Bank1(int id,String ifsc,String bname,String branch) {
		this.id =id;
		this.ifsc = ifsc;
		this.bname =bname;
		this.branch = branch;
		
	}
	

}
