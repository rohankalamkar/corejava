package SetterGetter.Day1.ByHiteshSir.SecondaryRef;

public class Customer {
	private int cid;
	private String cname;
	private String caddress;
	private Bank bnk;
	
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCid() {
		return cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCname() {
		return cname;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setBnk(Bank bnk) {
		this.bnk = bnk;
	}
	public Bank getBnk() {
		return bnk;
	}
}
