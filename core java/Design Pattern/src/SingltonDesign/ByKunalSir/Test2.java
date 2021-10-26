package SingltonDesign.ByKunalSir;

public class Test2 {
	public static void main(String[] args) {
		
		//	A2 a1 = new A2();  // We cannot create  object because constructor is private
		
		A2.m1();   // Calling static return method.
		A2 a2 = A2.m1();  // Storing return value of static method in a2
		// It becomes A2 a2 = new A2();
		System.out.println("a2 : hashcode : "+a2.hashCode());
		a2.m3();
		System.out.println("1---------------------------------------");
		
		A2 a3= A2.m1();//It becomes A2 a3 = new A2();
		System.out.println("a3 : Hashcode : "+a3.hashCode());
		a3.m3();
		System.out.println("2---------------------------------------");
		
		A2 a4=a3.m1();  // It becomes A2 a4 = new A2();
		System.out.println("a4 : Hashcode : "+a4.hashCode());
		a4.m3();
		System.out.println("3.--------------------------------------");
		
		
		
		
	}

}
