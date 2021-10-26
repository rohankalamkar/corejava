package OOPs.Introduction.Day1.ByHiteshSir.Polymorphism.Overloading.MethodOverloading;

public class A {
	
	// MethodOverloading
	
	public void add(int i,int j) {
		int z = i + j ;
		System.out.println("Addition of i and j is : "+z);
	}
	public void add(double a , double b) {
		double z = a +b ;
		System.out.println("Addition of a and b is : "+z);
	}
	public void add(float i,float j) {
		float z = i + j ;
		System.out.println("Addition of i and j is : "+z);
	}
	
	public void add(String x , String y ) {
		String z = x +" "+ y;
		System.out.println("Full Name is : "+z);
	}
	public static void main(String[] args) {
		A a = new A();
		
		a.add(10,20);
		a.add(1.1, 2);
		a.add(5.8, 6.1);
		a.add(10,0.8);
	a.add(10.7f,10.8f);
		a.add("Rohan","Kalamkar");
		
	}

}
