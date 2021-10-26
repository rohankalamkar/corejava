package OOPs.Introduction.Day5.ByHiteshSir.Inheritance.SuperAndthis;

public class ChildClass extends ParentClass {
	int x=100;
	public ChildClass() {
		super("ABC");
		System.out.println("ChildClass No Arg Consructor....");
	}
	public ChildClass(long l) {
		this("XYZ");
		System.out.println("ChildClass long Arg Constructor....."+l);
		
	}
	public ChildClass(String s) {
		this();
		System.out.println("ChildClass String Constructor.....: "+s);
	}

}
