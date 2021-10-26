package methodCallingTypes.NonStaticMethodCalling;

public class B {
	public void m3(){
		System.out.println("m3 method of B");
		       A a = new A();
		          a.m1();
		          a.m2();


		}

		public static void main(String args[]){

		B b = new B();
		b.m3();

		}


}
