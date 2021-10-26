package OOPs.Introduction.Day1.ByHiteshSir.Polymorphism.Overloading.MethodOverloading.Narrowing;

public class A {
	
	// Narrowing is a concept related to passing default value in Overloaded method in main object
	
	Object o;
	public void add(Object o) {    // o = null   (Parent)
		System.out.println("add method of A-------Object Para : "+o);
	}
	public void add(String s) {    // s = null    (Child)
		System.out.println("add method of A-------String Para : " +s);
	}

}
