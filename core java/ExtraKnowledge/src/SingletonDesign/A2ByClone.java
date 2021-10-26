package SingletonDesign;

public class A2ByClone implements Cloneable {
	public static A2ByClone a = new A2ByClone();
	private A2ByClone() {
		
	}
	
	public static A2ByClone getA2Object() {
		return a;
	}
	public void m1(A2ByClone a) {
		System.out.println("M1----A2ByClone");
		System.out.println("Method HashCode : "+a.hashCode());
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
