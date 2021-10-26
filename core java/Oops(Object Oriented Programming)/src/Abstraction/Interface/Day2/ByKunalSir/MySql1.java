package Abstraction.Interface.Day2.ByKunalSir;

public class MySql1 implements Connection {

	@Override
	public void commit() {
		System.out.println("Commit---------Mysql");
		
	}

	@Override
	public void rollback() {
		System.out.println("rollback--------Mysql");
		
	}

}
