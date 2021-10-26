package methodCallingTypes.NonStaticMethodCalling;

public class A1 {
	public void m1(){
		System.out.println("m1----A");
		m2();     //It must be within same class. & then It will compile and run properly.  
		}

		public void m2(){

		System.out.println("m2____A");
		}


}
