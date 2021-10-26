package Test1.Que9;

public class B extends A {
	public void m1(B b) { System.out.println("M1---B");}
	public void m2(Integer b) { System.out.println("M2---B"); }
	public void m3(I2 i) { System.out.println("M3---B"); }
	public static void main(String[] args) {
	I1 i=null;
	A a=new B();
	a.m1(a);
	a.m2(5);
	a.m3(i);
	B b=new B();
	b.m1(b);
	b.m2(5);
	b.m3(i);
	}

}
