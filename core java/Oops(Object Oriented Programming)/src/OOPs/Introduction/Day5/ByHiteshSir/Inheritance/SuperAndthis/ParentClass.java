package OOPs.Introduction.Day5.ByHiteshSir.Inheritance.SuperAndthis;

public class ParentClass {
	public ParentClass() {
		System.out.println("ParentClass No arg Constructor.");
	}
	public ParentClass(String s) {
		this(20);
		System.out.println("ParentClass ---- String-----Constructor : "+s);
	}
	public ParentClass(int i) {
		
		System.out.println("ParentClass ---- Int-----Constructor : "+i);
	}


}
