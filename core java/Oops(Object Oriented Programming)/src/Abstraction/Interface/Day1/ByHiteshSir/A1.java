package Abstraction.Interface.Day1.ByHiteshSir;

public class A1 implements I1{
	//int x = 20;
	@Override
	public void m1() {
		System.out.println("m1--------A1");
		
	}
	public static void main(String[] args) {
	//	I1 i = new I1(); // Error : Cannot Instantiate type I1
		                 // It means We cannot create Object of interface
		
		A1 a = new A1();
		a.m1();
		System.out.println(x);
		System.out.println(a.x);
		
		I1 i = new A1();
		i.m1();
		System.out.println(i.x);
		System.out.println(I1.x);
		
		
		
		
	}
	

}
