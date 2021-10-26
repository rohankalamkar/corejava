package SetterGetter.Day1.ByHiteshSir.SecondaryRef;

public class Customer1 {
	private int cid;
	private String cname;
	private String caddress;
	private Bank1 bnk;
	
	public void setCid(int cid) {
		this.cid=cid;
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
		this.caddress=caddress;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setBnk(Bank1 bnk) {
		this.bnk =bnk;
	}
	public Bank1 getBnk() {
		return bnk;
	}
	
	public Customer1(int cid,String cname, String caddress,Bank1 bnk) {
		this.cid = cid;
		this.cname = cname;
		this.caddress =caddress;
		this.bnk = bnk;
		
	}

}
