package SecondaryReference.Day9.SecRefByHiteshSir;

public class Seller {
	int sid;
	String sname;
	String product;
	Bank bnk;



	public void seldetails(){

	System.out.println("Seller Details : ");
	System.out.println("Seller name : "+sname);
	System.out.println("Seller ID : "+sid);
	System.out.println("Seller Product : "+product);
	System.out.println("Seller Bank Details : ");
	System.out.println("Bank Name : "+bnk.bname);
	System.out.println("Bank Branch Name : "+bnk.branch);
	System.out.println("Bank Branch ID : "+bnk.id);
	System.out.println("Bank Branch IFSC : "+bnk.ifsc);
	System.out.println("---------------------------------");

	}
	

}
