package OOPs.Introduction.Day1.ByHiteshSir.Polymorphism.Overloading.MethodOverloading.Narrowing;

public class A2 {
	public void add(Object o) {  // Parent o = null
		System.out.println("add method of A2 -----Object : "+o);
	}
	public void add(B2 b) {   // Child  s = null
		System.out.println("add method of A2 -----B class Object : "+b);
	}
	public void add(A2 a) {     // Child  s = null
		System.out.println("add method of A2 -----A class object :  "+a);
	}


}
