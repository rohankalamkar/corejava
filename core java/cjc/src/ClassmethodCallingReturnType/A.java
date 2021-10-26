package ClassmethodCallingReturnType;

public class A {
	int x ;
	public A m1() {
		A a = new A();
		a.x=100;
		return a;
	}
	public static void main(String[] args) {
		
		A b = new A();
		A c = b.m1();
		System.out.println("Class Return type Value : "+c.x);
		
	}

}
