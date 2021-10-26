package CollectionFrameWorkSorting.ByHiteshSir;

public class User_Cust {
	private int uid;
	private String uname;
	private String adress;
	public User_Cust(int uid, String uname, String adress) {
		
		this.uid = uid;
		this.uname = uname;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "User_Cust uid= " + uid + ", uname= " + uname + ", adress= " + adress;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
	

}
