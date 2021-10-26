package Abstraction.Interface.Day2.ByKunalSir;

public class Test1 {
	public static void main(String[] args) {
		
		Connection c = new Oracle1();
		c.commit();
		c.rollback();
		
		Connection c1 = new MySql1();
		c1.commit();
		c1.rollback();
		
	}

}
