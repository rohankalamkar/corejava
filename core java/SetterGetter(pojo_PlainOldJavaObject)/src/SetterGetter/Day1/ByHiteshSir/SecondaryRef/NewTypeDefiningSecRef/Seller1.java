package SetterGetter.Day1.ByHiteshSir.SecondaryRef.NewTypeDefiningSecRef;



public class Seller1 {
	private int sid;
	private String sname;
	private String product;
	Bank1 bnk;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Seller1(int sid,String sname,String product,Bank1 bnk) {
		this.sid=sid;
		this.sname = sname;
		this.product=product;
		this.bnk=bnk;
		
	}

}
