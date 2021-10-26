package SecondaryReference.Day9.SecRefByHiteshSir;



public class Flipcart1 {
	public static void main(String[] args) {
		
		
		Bank1 bk = new Bank1(125634,111,"SBI","Pimpri");
		Customer1 c = new Customer1(510,"Rohan Kalamkar","Near Dmart, Pune",bk);
		Seller1 s = new Seller1(1212,"Salman Khan","Hp Laptop",bk);
		
		System.out.println("Details of Customer :- " );
		System.out.println("Customer Name : "+c.cname);
		System.out.println("Customer ID : "+c.cid);
		System.out.println("Customer Address : "+c.caddrs);
		System.out.println("Customer Bank Name : "+c.bnk.bankname);
		System.out.println("Customer Bank Branch : "+c.bnk.branch);
		System.out.println("Customer Bank ID : "+c.bnk.bid);
		System.out.println("Customer Bank IFSC Number : "+c.bnk.ifsc);
		System.out.println("----------------------------------------");
		
		
		System.out.println("Details of Seller :- " );
		System.out.println("Seller Name : "+s.sname);
		System.out.println("Seller ID : "+s.sid);
		System.out.println("Seller Address : "+s.product);
		System.out.println("Seller Bank Name : "+s.bnk.bankname);
		System.out.println("Seller Bank Branch : "+s.bnk.branch);
		System.out.println("Seller Bank ID : "+s.bnk.bid);
		System.out.println("Seller Bank IFSC Number : "+s.bnk.ifsc);
		System.out.println("----------------------------------------");
		
		
		c.customdetails();
		s.selrdetails();
		
		bk.bankdetails("Customer");
		
		}
	

}
