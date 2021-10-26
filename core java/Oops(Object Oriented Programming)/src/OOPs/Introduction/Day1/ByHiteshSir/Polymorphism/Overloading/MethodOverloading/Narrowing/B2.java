package OOPs.Introduction.Day1.ByHiteshSir.Polymorphism.Overloading.MethodOverloading.Narrowing;

public class B2 extends A2{
	
	public void add(B2 b) {   // Child  s = null
		System.out.println("5614");
		System.out.println("add method of B2 -----B class Object : "+b);
	}
	public void add(A2 a) {     // Child  s = null
		System.out.println("1111");
		System.out.println("add method of B2 -----A class object :  "+a);
	}


}
