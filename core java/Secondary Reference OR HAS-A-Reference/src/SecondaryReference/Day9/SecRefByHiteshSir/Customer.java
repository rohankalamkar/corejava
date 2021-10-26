package SecondaryReference.Day9.SecRefByHiteshSir;

public class Customer {
	int cid;
	String cname;
	String caddress;
	Bank bnk;

	public void custdetails(){

	System.out.println("Customer Details : ");
	System.out.println("Customer name : "+cname);
	System.out.println("Customer ID : "+cid);
	System.out.println("Customer Address : "+caddress);
	System.out.println("Customer Bank Details : ");
	System.out.println("Bank Name : "+bnk.bname);
	System.out.println("Bank Branch Name : "+bnk.branch);
	System.out.println("Bank Branch ID : "+bnk.id);
	System.out.println("Bank Branch IFSC : "+bnk.ifsc);
	System.out.println("---------------------------------");


	}

}
