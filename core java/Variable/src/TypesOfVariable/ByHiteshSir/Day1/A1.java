package TypesOfVariable.ByHiteshSir.Day1;

public class A1 {
	
	public void m1(int x,String y) {   // Input parameterized method
		
		
		System.out.println("Value of x : "+x);
		System.out.println("Name of y : "+y);
		
	}
	public static void main(String[] args) {
		System.out.println("Main-----Start");
		
		A1 a = new A1();
		a.m1(350, "Castrol");
		
		System.out.println("Main ------ End");
		
		
	}
	

}
