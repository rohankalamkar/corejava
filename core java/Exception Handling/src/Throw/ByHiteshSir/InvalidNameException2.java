package Throw.ByHiteshSir;

public class InvalidNameException2 extends Exception {
	private String custname;
	public InvalidNameException2(String msg) {
		custname =msg;
	}
	@Override
	public String getMessage() {
		
		return "RK "+this.custname;
	}

}
