package SetterGetter.Day1.ByHiteshSir.SecondaryRef;

public class Flipcart1 {
	public static void main(String[] args) {
		Bank1 b = new Bank1(56,"SBI001256","State Bank Of India","Pimpri");
		Seller1 s = new Seller1(2562,"DMart","Grocery",b);
		Customer1 c = new Customer1(105641,"Rohan Kalamkar","Wardha",b);
		
		System.out.println("Customer Details : ");
		System.out.println("Customer Name : "+c.getCname());
		System.out.println("Customer ID : "+c.getCid());
		System.out.println("Customer Address : "+c.getCaddress());
		System.out.println("Customer Bank Details : ");
		System.out.println("Customer Bank Name : "+c.getBnk().getBname());
		System.out.println("Customer Bank Branch : "+c.getBnk().getBranch());
		System.out.println("Customer Bank ID : "+c.getBnk().getId());
		System.out.println("Customer Bank IFSC : "+c.getBnk().getIfsc());
		System.out.println("--------------------------------------------");
		System.out.println("Seller Details : ");
		System.out.println("Seller Name : "+s.getSname());
		System.out.println("Seller ID : "+s.getSid());
		System.out.println("Seller Product Name : "+s.getProduct());
		System.out.println("Seller Bank Details : ");
		System.out.println("Seller Bank Name : "+s.getBnk().getBname());
		
		System.out.println("Seller Bank Branch : "+s.getBnk().getBranch());
		System.out.println("Seller Bank ID : "+s.getBnk().getId());
		System.out.println("Seller Bank IFSC : "+s.getBnk().getIfsc());
		System.out.println("----------------------------------------------");
		
		
		
	}

}
