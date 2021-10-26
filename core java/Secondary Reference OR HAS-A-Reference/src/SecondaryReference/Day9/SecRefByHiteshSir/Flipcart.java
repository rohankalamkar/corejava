package SecondaryReference.Day9.SecRefByHiteshSir;

public class Flipcart {
	public static void main(String args[]){

		Bank b = new Bank();
		b.ifsc = 125006;
		b.id = 111;
		b.bname="SBi";
		b.branch = "PIMPRI";

		Customer c = new Customer();
		c.cid = 5503;
		c.cname = "Rohan Kalamkar";
		c.caddress = "Near Dmart, Rahatni";
		c.bnk = b ;

		Seller s = new Seller();
		s.sid = 1200;
		s.sname= "Shahrukh Khan";
		s.product = "Dell TV";
		s.bnk = b;

		System.out.println("Customer Details : ");
		System.out.println(c.cname);
		System.out.println(c.cid);
		System.out.println(c.caddress);
		System.out.println(c.bnk.bname);
		System.out.println(c.bnk.branch);
		System.out.println(c.bnk.id);
		System.out.println(c.bnk.ifsc);
		System.out.println("---------------------------------");


		System.out.println("Seller Details : ");
		System.out.println(s.sname);
		System.out.println(s.sid);
		System.out.println(s.product);
		System.out.println(s.bnk.bname);
		System.out.println(s.bnk.branch);
		System.out.println(s.bnk.id);
		System.out.println(s.bnk.ifsc);
		System.out.println("---------------------------------");


		s.seldetails();
		c.custdetails();




		}


}
