package Throw.ByKunalSir;

public class Test1 {
	public void m1(int age) {
		System.out.println("M1------Start");
		if(age<0) {
			throw new AgeInavlidException("Age-----Problem-----");
		}
		else {
			System.out.println("Your age is : "+age);
		}
		System.out.println("M1------end");
	}
	public static void main(String[] args) {
		
		System.out.println("Main-----------Start");
		Test1 t = new Test1();
		
		try {
			System.out.println("Try------Start");
			t.m1(-5);
		}
		catch(AgeInavlidException e) {
			System.out.println("Catch------Block...: "+e.getMessage());
		}
		System.out.println("main-----------end");
		
		
	}

}
