package SecondaryReference.Day9.SecRefByHiteshSir;


public class Seller1 {
	int sid;
    String sname;
    String product;
    Bank1 bnk;
    
    
    public Seller1(int sid, String sname,String product,Bank1 bnk) {
    	this.sid = sid;
    	this.sname = sname;
    	this.product = product;
    	this.bnk = bnk;
    	
    }
    
    public void selrdetails() {
		System.out.println("Details of Seller :- " );
		System.out.println("Seller Name : "+sname);
		System.out.println("Seller ID : "+sid);
		System.out.println("Seller Address : "+product);
		System.out.println("Seller Bank Name : "+bnk.bankname);
		System.out.println("Seller Bank Branch : "+bnk.branch);
		System.out.println("Seller Bank ID : "+bnk.bid);
		System.out.println("Seller Bank IFSC Number : "+bnk.ifsc);
		System.out.println("----------------------------------------");
    }
	

}
