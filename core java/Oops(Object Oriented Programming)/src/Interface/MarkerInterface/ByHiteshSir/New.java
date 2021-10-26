package Interface.MarkerInterface.ByHiteshSir;

public class New {
	
	public Object o() {
		return "Cjc";
	}
	
	public A a () {
		return new A();
	}
	public static void main(String[] args) {
		New n  = new New();
		
		//String s = n.o();  // Error : Type mismatch: cannot convert from Object to String
		
		String s = (String)n.o();  // Converting parent int child i.e. (String)n.o()  and Storing this value into String variable s , here String s
		System.out.println(s);   // Cjc  
		
		Object o1 = n.o();
		System.out.println(o1);  // CJC
		
		//int x = n.o();   //Error: Type mismatch: cannot convert from Object to int
//		int x = (int)n.o();   //  Successfully Compiled   (Here Compiler check only format)  
								// here First Convert Object into int i.e. (int)n.o();  and later store this object into int
		
//		System.out.println(x); // During run it will give error : ClassCastException
		
//		String s1 = (int)n.o();   // Type mismatch: cannot convert from int to String
		
//		A a=(A)n.o();      //  It will also get compile successfully
		                   // But during run, Error : ClassCastException
		
		
		
		
		
		
	}

}
