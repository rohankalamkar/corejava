package AccountServiceTest;

public class Account {
	private int acno;
	private String name;
	private String address;
	private String pan;
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "Account details :\nAccount Number : " + acno + "\nName : " + name + "\nAddress : " + address + "\nPan : " + pan;
	}
	

}
