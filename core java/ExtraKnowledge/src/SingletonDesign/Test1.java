package SingletonDesign;

public class Test1 {
	public static void main(String[] args) {
		
		System.out.println("Main--------Start");
		
	   // A1 c = new A1();  // We cannot create object here because of private no arg Constructor
		
		A1 a =A1.getA1Object();
		
		System.out.println("For a = "+a.hashCode());
		a.m1();
		
		
		A1 a1 = A1.getA1Object();
		
		System.out.println("For a1 = "+a1.hashCode());
		a1.m1();
		
		A1 a2 = A1.getA1Object();
		System.out.println("For a2 : "+a2.hashCode());
		a2.m1();
		
		
	}

}
