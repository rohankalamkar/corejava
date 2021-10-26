package methodCallingReturnType;

public class A {
	public void m1(int x , String y) {   // input parameterized method
		System.out.println("Value of X : "+x);
		System.out.println("Value of Y : "+y);
		System.out.println("method-----m1");
		
	}
	public String m2() {     // return type method
		System.out.println("m2 ----- A");
		String s = "CJC";
		return s;
		
		
		
	}
	public static void main(String[] args) {
		System.out.println("Main-------Start");
		A a = new A();
		a.m1(350, "Servo");
		
		a.m2();
		
		System.out.println("--------------------------------");
		
		String i = a.m2();
		System.out.println("Value Comes from m2() method : "+i);
		System.out.println("Main--------End");
		
	
	
	
	
	}
	
	

}
