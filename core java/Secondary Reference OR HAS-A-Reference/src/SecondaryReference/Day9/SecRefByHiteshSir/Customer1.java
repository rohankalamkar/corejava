package SecondaryReference.Day9.SecRefByHiteshSir;



public class Customer1 {
	int cid;
	String cname;
	String caddrs;
	Bank1 bnk;
	public Customer1(int cid,String cname,String caddrs, Bank1 bnk ) {
		this.cid = cid;
		this.cname = cname;
		this.caddrs = caddrs;
		this.bnk = bnk;
		
	}
	
	public void customdetails() {
		System.out.println("Details of Customer :- " );
		System.out.println("Customer Name : "+cname);
		System.out.println("Customer ID : "+cid);
		System.out.println("Customer Address : "+caddrs);
		System.out.println("Customer Bank Name : "+bnk.bankname);
		System.out.println("Customer Bank Branch : "+bnk.branch);
		System.out.println("Customer Bank ID : "+bnk.bid);
		System.out.println("Customer Bank IFSC Number : "+bnk.ifsc);
		System.out.println("----------------------------------------");
	}


}
