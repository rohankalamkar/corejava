package Abstraction.Abstract.Day1.ByHiteshSir;

abstract public class A1 {    //  Partial Abstraction 
	                          //  While interface is called 100% Abstraction
	
	public abstract void m1();
	
	public abstract int m4();
	
	abstract public void m1(int i);    // We can Overload abstract method
	
	public void m2() {    // It is normal void method not an public abstract void m2()..see A1.class file
		System.out.println("m2-------A1");
	}
//	public int m2() { // Error : Duplicate
//		return 10;
//	}
	
	public int m3() {       // It is a normal int return method   ...See A1.class file 
		return 10;
	}

}
