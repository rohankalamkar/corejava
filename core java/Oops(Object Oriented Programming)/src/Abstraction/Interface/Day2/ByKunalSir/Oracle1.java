package Abstraction.Interface.Day2.ByKunalSir;

public class Oracle1 implements Connection {

	@Override
	public void commit() {
		System.out.println("commit---------Oracle");
		
	}

	@Override
	public void rollback() {
	System.out.println("rollback--------Oracle");
		
	}

}
