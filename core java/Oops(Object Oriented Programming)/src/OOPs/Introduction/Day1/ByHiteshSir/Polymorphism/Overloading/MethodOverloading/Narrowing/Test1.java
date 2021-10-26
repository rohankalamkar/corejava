package OOPs.Introduction.Day1.ByHiteshSir.Polymorphism.Overloading.MethodOverloading.Narrowing;

public class Test1 {
	public static void main(String[] args) {
		
		B1 a = new B1();
		
		//a.add(null); // Error : The method Add Object is Ambiguous for the type A1
					//here parent is Object, but child are two String s, A a (Both have default value null)  
		a.add((A)null);
		
		a.add((Object)null);
		a.add((String)null);
		
		
		
	}

}
