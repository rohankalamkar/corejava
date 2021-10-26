package SetterGetter.Day1.ByHiteshSir.SecondaryRef.NewTypeDefiningSecRef;



public class Flipcart {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.setBname("State Bank Of India");
		b.setBranch("Pimpri");
		b.setId(101);
		b.setIfsc(12563);
		
		Customer c = new Customer();
		c.setCname("Rohan Kalamkar");
		c.setCid(625);
		c.setCaddress("Wardha");
		c.bnk=b;
		
		Seller s = new Seller();
		s.setSname("Dmart");
		s.setSid(5125);
		s.setProduct("Shampoo");
		s.bnk=b;
		
		
		System.out.println("Customer Details : ");
		System.out.println("Customer Name"+c.getCname());
		System.out.println("Customer ID : "+c.getCid());
		System.out.println("Customer Address : "+c.getCaddress());
		System.out.println("Customer Bank Details : ");
		System.out.println("Customer Bank Name : "+c.bnk.getBname());
		System.out.println("Customer Bank Branch : "+c.bnk.getBranch());
		System.out.println("Customer Bank ID : "+c.bnk.getId());
		System.out.println("Customer Bank IFSC : "+c.bnk.getIfsc());
		System.out.println("--------------------------------------------");
		System.out.println("Seller Details : ");
		System.out.println("Seller Name : "+s.getSname());
		System.out.println("Seller ID : "+s.getSid());
		System.out.println("Seller Product Name : "+s.getProduct());
		System.out.println("Seller Bank Details : ");
		System.out.println("Seller Bank Name : "+s.bnk.getBname());
		
		System.out.println("Seller Bank Branch : "+s.bnk.getBranch());
		System.out.println("Seller Bank ID : "+s.bnk.getId());
		System.out.println("Seller Bank IFSC : "+s.bnk.getIfsc());
		System.out.println("----------------------------------------------");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
