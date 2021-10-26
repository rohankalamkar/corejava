package Interface.MarkerInterface.ByHiteshSir;

public class Test {
	public Mark a () {
		return new A();
	}
	public Mark a1() {
		return new B();
	}
	public B b() {
		return new B();
	}
	
	public void m1(Mark m) {  // m = a1  // it means Mark m = new A();
		
		A a =(A)m;   // Convert/cast parent Mark to child A
		
		System.out.println(a.x);
		
		
		//B b =(B)m;   // Convert/cast parent Mark to child A
		//System.out.println(b.y); 
		
		//C c = (C)m;
		//System.out.println(c.z); // ClassCastException because Mark and C has no relation
		                     // Or we can say C is not marked.
		
		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		A a = (A)t.a();
		System.out.println(a.x); // 10
		
		// B b = t.a(); //Error :  Cannot convert from Mark to B
		
		B b = (B)t.a1();   // It will compile successfully (Because B is child of Mark interface) but during run 
		//It is similar to
		// B b = new B();
		System.out.println(b.y);  // 20
		
		// B b1 = (B)t.a(); //Error: ClassCastException it is similar to B b1 = new A();(Not possible)  therefore it gives ClassCastException
		
		
		//C c= (C)t.a();  // It will Also Compile it SuccessFully // Marker interface to Class relation 
		//Error :  ClassCastExceptionError
		//C c1 = (C)t.b();  // Cannot cast from B to C (Because class B and Class C has no relation)
		// Or we can say C is not Marked
		
		// for void method m1()
		
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		
		// t.m1(c1);  // Error : The method m1(Mark) in the type Test is not applicable for the arguments (C)
		
	
		
		
	}

}
