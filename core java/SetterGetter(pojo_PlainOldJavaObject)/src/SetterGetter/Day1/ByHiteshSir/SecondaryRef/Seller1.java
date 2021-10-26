package SetterGetter.Day1.ByHiteshSir.SecondaryRef;

public class Seller1 {
	private int sid;
	private String sname;
	private String product;
	private Bank1 bnk;
	
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSid() {
		return sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSname() {
		return sname;
	}
	public void setProduct(String product) {
		this.product=product;
	}
	public String getProduct() {
		return product;
	}
	public void setBnk (Bank1 bnk) {
		this.bnk=bnk;
	}
	public Bank1 getBnk() {
		return bnk;
	}
	public Seller1(int sid,String sname,String product,Bank1 bnk) {
		this.sid=sid;
		this.sname = sname;
		this.product=product;
		this.bnk=bnk;
		
	}
	
	

}
