package methodCallingReturnType;

public class A1{
	public void m1(int x , String y) {   // input parameterized method
		System.out.println("Value of X : "+x);
		System.out.println("Value of Y : "+y);
		System.out.println("method-----m1");
		
	}
	public String m2() {     // return type method
		System.out.println("m2 ----- A");
		String s = "CJC";
		String s1 = "  Akurdi";
		String s2 = s + s1;
		return s2;
	}
	public static void main(String[] args) {
		System.out.println("Main-------Start");
		A1 a = new A1();
		a.m1(350, "Servo");
		
		//a.m2();
		
		System.out.println("--------------------------------");
		
		String i = a.m2();
		String s4 = i + " KarveNagar";
		System.out.println("Value Comes from m2() method : "+s4);
		System.out.println("Main--------End");
		
	}
		
}
