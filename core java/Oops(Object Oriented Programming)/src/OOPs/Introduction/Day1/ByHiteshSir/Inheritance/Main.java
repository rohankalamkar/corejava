package OOPs.Introduction.Day1.ByHiteshSir.Inheritance;

public class Main {
	public static void main(String[] args) {
		
		ParentClass p = new ParentClass();
		
		p.m1();
	//	p.m2();   // We cannot access childclass methods or variables through parent class 
// 		System.out.println(p.y);
		
		ChildClass c = new ChildClass();
		
		c.m2();
		c.m1();      // We can access parentclass methods or variables through child class
		System.out.println(c.x);     // We can access parentclass methods or variables through child class
		System.out.println(c.y);
		
	}

}
