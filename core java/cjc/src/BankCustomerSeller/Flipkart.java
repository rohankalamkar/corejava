package BankCustomerSeller;

public class Flipkart {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.bankname = "SBI";
		b.branch = "Pimpri";
		b.bid = 111;
		b.ifsc = 125634;
		
		Customer c = new Customer();
		c.cname="Rohan Kalamkar";
		c.cid=510;
		c.caddrs = "Near Dmart, Pune";
		c.bnk=b;
		
		Seller s = new Seller();
		s.sname = "Salman Khan";
		s.sid = 1212;
		s.product="Hp Laptop";
		s.bnk = b;
		
		
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
		
		
		
		
				
	}

}
