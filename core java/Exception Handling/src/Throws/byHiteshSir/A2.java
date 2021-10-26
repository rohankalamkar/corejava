package Throws.byHiteshSir;

public class A2 {
	public void m1() throws ClassNotFoundException {
		System.out.println("m1------A2");
		m2();
	}
	public void m2() throws ClassNotFoundException{
		System.out.println("m2------A2");
		m3();
		
	}
	public void m3() throws ClassNotFoundException{
		System.out.println("m3-----A2");
		Class.forName("Throws.byHiteshSir.A2");
	}
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		A2 a = new A2();
		System.out.println("Main------Start");
		try {
			a.m1();
		} catch (ArithmeticException e ) {  
			System.out.println("Catch ------Block");
			e.printStackTrace();
		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		System.out.println("Main--------End");
		
		
	}

}
