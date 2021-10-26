package Map.ByHiteshSir;

public class Account {
	private int acno;
	private String Name;
	private String address;
	private double balance;
	public Account(int acno, String name, String address, double balance) {
		super();
		this.acno = acno;
		Name = name;
		this.address = address;
		this.balance = balance;
	}
	public int getAcno() {
		return acno;
	}
	public String getName() {
		return Name;
	}
	public String getAddress() {
		return address;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "Account Details : Account Number = " + acno + ", Name =  " + Name + ", address  =  " + address + ", balance = " + balance ;
	}
	
	

}
