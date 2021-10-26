package BankCustomerSellerwithConstructor;

public class Bank {
	int ifsc;
	int bid;
	String bankname;
	String branch;
	public Bank(	int ifsc,int bid,String bankname,String branch) {
		this.ifsc = ifsc;
		this.bid = bid;
		this.bankname = bankname;
		this.branch = branch;
	}
	
	public void bankdetails(String name1) {
		
	System.out.println(name1);
		
	}
}
