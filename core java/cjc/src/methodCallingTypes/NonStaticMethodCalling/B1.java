package methodCallingTypes.NonStaticMethodCalling;

public class B1 {
	public void m3(){
		System.out.println("m3____B");
		A1 a1 = new A1();
		a1.m1();
		}
		public static void main(String args[]){
		 B1 b1 = new B1();

		b1.m3();

		}

}
