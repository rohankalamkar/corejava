package OOPs.Introduction.Day1.ByHiteshSir.Polymorphism.Overloading.MethodOverloading.Narrowing;

public class Char {
	
	public void m1(char c) {
		System.out.println("m1 of Char----Char c : "+c);
	}
	public void m1() {
		System.out.println("m1 if char----Default");
	}
	public static void main(String[] args) {
		
		Char c1 = new Char();
		c1.m1('@');
		
	}

}
