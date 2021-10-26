package Abstraction.Interface.Day1.ByKunalSir;

public class Test1 {
	public static void main(String[] args) {
		
//		I1 a = new I1();   // Error: We cannot Instantiate the type I1
		                   // It means We cannot Create an Object of Interface class
		
		A1 a = new A1();
		a.m1();
		a.m2();
		a.m3();
		
		System.out.println("1.--------------------------------------------------");
		
		I1 i = new A1();
		i.m1();
		i.m2();
		i.m3();
		System.out.println("2.--------------------------------------------------");
		
		
	}

}
