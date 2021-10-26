package TypeCastingClass;

public class Test {

	public A a() {
		A a= new A();
		//return new A();
		return a;   // both are same 
	}

	public B b() {
		return new B();
	}
	public C c() {
		return new C();
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.a(); // Calling return object

		A a1 = t.a(); // Storing A return value into A a1 Return type class variable
		// It is similar to 
		//A a1 = new A(); 
		a1.m1(); // m1 -----A
		System.out.println(a1.x); // 10

		// B b1 = (B)t.a(); // Error : Cannot cast from A to B ()because A and B has no relation
		// It is similar to 
		// B b1 = new A();  which is not possible

		// C c1 = (C)t.a(); // Error : Cannot cast from A to C (A and C has no relation)
		// It is similar to
		// C c1 = new A(); which is not possible
		System.out.println("1.-------------------------------------------------");

		//A a2 = (A) t.b(); // Cannot cast from B to A
		
		B b2 = t.b();  
		
		// It is similar to 
		// B b2 = new B();
		
		b2.m1(); // m1------B
		b2.m2(); // m2------B
		 System.out.println(b2);   // @15db9742
		 System.out.println(b2.x); // 20
		 System.out.println(b2.y); // 30
		//C c2 = (C)t.b();    //Error : Cannot cast from B to C 
		 	 
		 System.out.println("2.---------------------------------------------------");
		 t.c();
		 //A a3 = (A)t.c();   // Error : Cannot cast from C to A they have no relation
		 //B b3 = (B)t.c();   // Error : Cannot cast from C to B they have no relation
		C c3 = (C)t.c();
		System.out.println(c3.x);  // 40
		System.out.println(c3.z);  // 100
		System.out.println(c3);    //@6d06d69c
		c3.m1();  // m1----C
		c3.m2();  // m2-----C
		c3.m3();  // m3-----C
		System.out.println("3.-----------------------------------------------------");
		

	}

}
