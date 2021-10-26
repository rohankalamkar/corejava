package SetterGetter.Day1.ByHiteshSir.SecondaryRef.NewTypeDefiningSecRef;



public class Customer1 {
	private int cid;
	private String cname;
	private String caddress;
	Bank1 bnk;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public Customer1(int cid,String cname, String caddress,Bank1 bnk) {
		this.cid = cid;
		this.cname = cname;
		this.caddress =caddress;
		this.bnk = bnk;
		
	}

}
