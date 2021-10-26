package SetterGetter.Day1.ByHiteshSir.SecondaryRef;

public class Bank1 {
	private String ifsc;
	private int id;
	private String bname;
	private String branch;
	
	public Bank1(int id,String ifsc,String bname,String branch) {
		this.id =id;
		this.ifsc = ifsc;
		this.bname =bname;
		this.branch = branch;
		
	}
	
	public void setIfsc(String  ifsc) {
		this.ifsc = ifsc;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setBname(String bname) {
		this.bname = bname;
	
	}
	public String getBname() {
		return bname;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBranch() {
		return branch;
	}
	
	
	
	

}
