package Throw.ByKunalSir;

public class Test {
	public void m1(int age) {
		System.out.println("M1-----Start");
		if(age<0) {
			throw new ArithmeticException("age------Problem");
		}
		else {
			System.out.println("Your age is : "+age+" Years");
		}
		System.out.println("M1----End");
		
		
	}
	public static void main(String[] args) {
		System.out.println("Main---------Start");
		Test t = new Test();
		try {
			t.m1(-20);
		}catch(ArithmeticException e) {
			System.out.println("Catch-------Block..: "+e.getMessage());
		}
		System.out.println("Main-------End");
		
		
		
	}

}
