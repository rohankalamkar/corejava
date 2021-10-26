package SetterGetter.Day1.ByHiteshSir.SecondaryRef;

public class Seller {
	private int sid;
	private String sname;
	private String product;
	private Bank bnk;
	
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
		this.product = product;
	}
	public String getProduct() {
		return product;
	}
	public Bank getBnk() {
		return bnk;
	}
	public void setBnk(Bank bnk) {
		this.bnk = bnk;
	}
	

}
