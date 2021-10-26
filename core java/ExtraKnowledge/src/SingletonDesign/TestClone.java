package SingletonDesign;

public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		A2ByClone x =A2ByClone.getA2Object();
		System.out.println(x.hashCode());
		x.m1(x);
		
		A2ByClone c = (A2ByClone)x.clone();


		c.m1(c);
		System.out.println("Clone HashCode : "+c.hashCode());
		
		
	}

}
