package Abstraction.Interface.Day2.ByKunalSir;

public class Test {
	public static void main(String[] args) {
		
		Oracle o = new Oracle();
		o.commitOracle();
		o.rollbackOracle();
		
		MySql m = new MySql();
		m.commitMysql();
		m.rollbackMy();
				
		
	}

}
