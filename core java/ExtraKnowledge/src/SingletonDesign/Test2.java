package SingletonDesign;

public class Test2 {
	public static void main(String[] args) {
		
		System.out.println("Main--------Start");
		
		   // A1 c = new A1();  // We cannot create object here because of private no arg Constructor
			
			A2 a =A2.getA2Object();
			
			System.out.println("For a = "+a.hashCode());
			a.m1();
			
			
			A2 a1 = A2.getA2Object();
			
			System.out.println("For a1 = "+a1.hashCode());
			a1.m1();
			
			A2 a2 = A2.getA2Object();
			System.out.println("For a2 : "+a2.hashCode());
			a2.m1();
		
		
	}

}
