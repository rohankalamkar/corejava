package methodCallingTypes.NonStaticMethodCalling;

public class User {
	public void transaction(){
	    Bank a = new Bank();

	a. deposit();
	a.withdraw();

	}

	public static void main(String args[]){
	     User u = new User();

	u.transaction();

	}

}
