package TypeCastingClass;

public class Test1 {
	
	public A1 a () {
		A1 a1 = new A1();
		B1 b1 = new B1();
		// or A1 b1 = new B1();
		A1 c1 = new C1();
		// or C1 c1 = new C1();
		
		
		
		//return a1;
		//return b1;   // allow, parent can return their child
		return c1;     // allow, parent can return their grand child and so on
		
	}
	public A1 a1 () {
		A1 a1 = new A1();
		//B1 b1 = new B1();
		 A1 b1 = new B1();  // Both will give you same output
		C1 c1 = new C1();
		
		//return a1;
		return b1;   // allow, parent can return their child
		//return c1;     // allow, parent can return their grand child and so on
		
	}
	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.a();
		
		Object o = t.a();  // AutoUpcasting  Storing A1 object in Object(Topmost) object o
		
		A1 ab = t.a();    // Storing A1 return type value in A1 ab variable
		                  // But the problem is return value is child of A1 i.e. C1
		
		// Above Condition is similar to 
		//A1 ab = new C();
		ab.m1();   // m1 -----C1
		ab.m4();   // m4------A1
		System.out.println(ab.x); // 10
		System.out.println("1.-----------------------------------------------------");
		
		//B1 ab1 =t.a();   // Cannot convert from A1 to B1(DownCasting)
		B1 ab1 = (B1)t.a(); // Here Convert A1 to B1 
		 // Here Condition is 
		 // B1 ab1 = new C1();
		ab1.m1();  //m1------C1
		ab1.m2();  // m2------C1
		ab1.m4();  // m4-----A1
		System.out.println(ab1.x); // 20
		System.out.println(ab1.y); // 30
		System.out.println("2.------------------------------------------------------");
		
		//C1 ab2 = t.a();  // Error : Type mismatch: cannot convert from A1 to C1
		C1 ab2 = (C1)t.a(); // Here First Convert(Cast) A1 to C1(DownCasting)
		// Here Condition now is 
		// C1 ab2 = new C();
		
		ab2.m1(); //m1------C1
		ab2.m2(); //m2------C1
		ab2.m3();  //m3------C1
		ab2.m4();  // m4-----A1
		System.out.println(ab2.x); // 40
		System.out.println(ab2.y);  // 30
		System.out.println(ab2.z);  // 100
		System.out.println("3.------------------------------------------------------");
		
		A1 bb = t.a1();   // Storing A1 return value in A1 object  .. no issue
		//B1 bb1 = t.a1();   // Error : Cannot Convert A1 to B1
		//Storing A1 return value in B1 object. 
		
		B1 bb1 = (B1)t.a1();  // Downcasting Converting A1 into B1
		                     // for casting we just requires relation (here parent and child relation)
		                    
		// Now from here Condition Become
		// B1 bb1 = new B1();
		
		bb1.m1();  // m1-----B1
		bb1.m2();  // m2-----B1
		bb1.m4();  // m4-----A1
		System.out.println(bb1.x);  // 20
		System.out.println(bb1.y);  // 30
		System.out.println("4.------------------------------------------------------");
		
		//C1 bb2 = t.a1();  // Error : Type mismatch: cannot convert from A1 to C1
		 // C1 bb2 = (C1)t.a1(); // Here we are storing A1 return value into C1   
		  					// Downcasting Storing A1 to C1
		  // From here Condition become : 
		  // C1 bb2 = new B1();   // Here Condition Becomes fails And Gives ClassCastException Error
		  // Error : ClassCastException
		 // bb2.m1();
		
		
		
		
		
		
		
	}

}
