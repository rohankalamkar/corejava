package OOPs.Introduction.Day1.ByHiteshSir.Inheritance;

public class Test {
	public static void main(String[] args) {
		TataCar t = new TataCar();
		System.out.println(t);      // @15db9742    // It is Memory address of t object after creating object
		System.out.println(t.name);  // Harrier
		System.out.println(t.ModelPrice); // 13
		System.out.println(t.c);      // null       // c object not create yet so it give null value
		System.out.println(t.c.hp);    // error : NullPointerException // Because we accessing null value   // It is becuase we not declare Object.  and here we are 
		System.out.println(t.c.mileage);  // error : NullPointerException
		
	}

}
