package SingletonDesign;

public class A2 {
	public static A2 a=new A2();  // This will also gives same result
	private A2() {
		
	}
//	private A1 (int a) {
//		
//	}
	public static A2 getA2Object () {
		if(a==null) {   // This if block will skipped here
			//a= new A2();
			 //return a;
			return new A2();
		}
		return a;
		
	}
	public void m1() {
		System.out.println("M1-------A1-----Private--Constructor");
		System.out.println("M1-----A1---HashCode = "+a.hashCode());
	}
	
}
