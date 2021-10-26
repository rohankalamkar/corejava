package OOPs.Introduction.Day1.ByHiteshSir.Inheritance;

public class Test1 {
	public static void main(String[] args) {
		TataCar1 t = new TataCar1();
		System.out.println(t);      // @15db9742    // It is Memory address of t object after creating object
		System.out.println(t.name);  // Harrier
		System.out.println(t.ModelPrice); // 13
		System.out.println(t.c);      // @6d06d69c   
		System.out.println(t.c.hp);    // 3 Horse Power 
		System.out.println(t.c.mileage);  // 8 km/litre
		
	}

}
