package OOPs.Introduction.Day1.ByHiteshSir.Polymorphism.Overloading.MethodOverloading.Narrowing;

public class A1 {
	public void add(Object o) {  // Parent
		System.out.println("add method of A1 -----Object : "+o);
	}
	public void add(String s) {   // Child  s = null
		System.out.println("add method of A1 -----String : "+s);
	}
	public void add(A a) {     // Child  s = null
		System.out.println("add method of A1 -----A class object :  "+a);
	}

}
