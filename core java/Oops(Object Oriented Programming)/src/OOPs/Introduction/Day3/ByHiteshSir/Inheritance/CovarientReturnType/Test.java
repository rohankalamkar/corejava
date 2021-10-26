package OOPs.Introduction.Day3.ByHiteshSir.Inheritance.CovarientReturnType;

public class Test  {
	public static void main(String[] args) {
		
		A a = new A();
		a.m1();
		a.m2();
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println("-----------------------------------------------------");
		A a1 = new B();
		a1.m1();
		a1.m2();
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println("------------------------------------------------------");
		A a2 = new C();
		a2.m1();
		a2.m2();
		System.out.println(a2.x);
		System.out.println(a2.y);
		System.out.println("-----------------------------------------------------");
		A a3 = new D();
		a3.m1();
		a3.m2();
		System.out.println(a3.x);
		System.out.println(a3.y);
		System.out.println("-------------------------------------------------------");
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
		System.out.println("--------------------------------------------------------");
		B b1 = new C();
		b1.m1();
		b1.m2();
		b1.m3();
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);
		System.out.println("--------------------------------------------------------");
		B b2 = new D();
		b2.m1();
		b2.m2();
		b2.m3();
		System.out.println(b2.x);
		System.out.println(b2.y);
		System.out.println(b2.z);
		System.out.println("--------------------------------------------------------");
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);
		System.out.println(c.d);
		System.out.println("--------------------------------------------------------");
		C c1 = new D();
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
		System.out.println(c1.d);
		System.out.println("-------------------------------------------------------");
		D d = new D();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		d.m5();
		System.out.println(d.x);
		System.out.println(d.y);
		System.out.println(d.z);
		System.out.println(d.d);
		System.out.println(d.e);
		System.out.println("--------------------------------------------------------");
		
		
		
		
		
	}

}
