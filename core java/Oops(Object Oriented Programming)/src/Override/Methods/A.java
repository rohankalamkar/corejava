package Override.Methods;

public class A {
	
	public void m1() {
		System.out.println("m1-------A");
	}
	public int i1(int x) {
		return 10;
	}
	public String s1(String s) {
		return "ABC";
	}
	public A a(A a) {
		return new A();
	}
	
	public void m2() {
		
	}
	protected void m2(int i) {
		
	}
	protected void p1() {
		
	}
	public void p2() {
		
	}


}
//Overriding is only applicable for methods only.


// Overriding happens between only Parent and child class

// We CANNOT Override private, static and final methods (It means we cannot upgrade/improve private , static, final methods once they declared)

//Overriding requires same method name and same parameter or signature 

// Overriding is used for improving/upgrading existing same method.....

