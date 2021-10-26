package Interface.MarkerInterface.ByHiteshSir;

public class Test1 {
	public void low(Mark1 m) {
		//B1 b = (B1)m;  //1. If we pass A
		// It is similar to B1 b  = new A1(); // NotPossible
		                // ClassCastException
		
//		B1 b = (B1)m; // 2
//		              // Now it is similar to B1 b = new B1();
//		System.out.println(b.x);   // 10
//		System.out.println(b.y);    // 20
//		b.m1();  // m1----B1
//		b.m2();  // m2----B1
		
		C1 c = (C1)m; // 3   // It is similar to C1 c = new C1();
		c.m4();  // m4---C1
		System.out.println(c.z);  //  50
	}
	public Mark1 m () {
		A1 a = new A1();
		B1 b = new B1();
		C1 c = new C1();
		//return c;   // It is similar to new C1();
		return b;    // It is similar to new B1();
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		
		t.m();
		//B1 b =(B1)t.m();   // It is similar to B1 b = new C1();   
		                 // B and C has no relation 
		                 // Error : ClassCastException
		
		
		B1 b =(B1)t.m();   // It is now similar to B1 b = new B1();
		        // DownCast Mark to B1 
		System.out.println(b.x);  // 10
		System.out.println(b.y);  // 20
		b.m1();  // m1----B1
		b.m2();  // m2----B1
		
		A1 a = new A1();
		B1 b1 = new B1();
		C1 c = new C1();
		
		//t.low(a);  // 1
		
		//t.low(b);    // 2
		
		t.low(c);
		
		
	}
	
	
	

}
