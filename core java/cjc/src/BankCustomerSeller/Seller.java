package BankCustomerSeller;

public class Seller {
    int sid;
    String sname;
    String product;
    Bank bnk;
    
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
