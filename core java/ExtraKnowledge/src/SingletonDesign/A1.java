package SingletonDesign;

public class A1 {
	public static A1 a;
	private A1() {
		
	}
//	private A1 (int a) {
//		
//	}
	public static A1 getA1Object () {
		if(a==null) {
			a= new A1();
			 return a;
			//return new A1();// ye kiska new A1() hai pata nhi..so after that
			 //if you are trying to access a, it will gives null pointer exceptions
		}
		return a;
		
	}
	public void m1() {
		System.out.println("M1-------A1-----Private--Constructor");
		System.out.println("M1-----A1---HashCode = "+a.hashCode());
	}
	

}
