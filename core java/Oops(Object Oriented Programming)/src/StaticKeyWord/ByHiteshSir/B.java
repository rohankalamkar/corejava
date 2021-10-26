package StaticKeyWord.ByHiteshSir;

public class B extends A {

	static {
		System.out.println("Static---Block----B");
	}
	{
		System.out.println("Non Static----Block----B");
	}
	A a = new A();
	
	public static void main(String[] args) {
		System.out.println("Main-------Start.");

		
	}
}
// Without extends(i.e. inherits) 
// Output : 
//Static---Block----B
//Main-------Start.

//With extends  
//Static ---- Block ----A
//Static---Block----B
//Main-------Start.