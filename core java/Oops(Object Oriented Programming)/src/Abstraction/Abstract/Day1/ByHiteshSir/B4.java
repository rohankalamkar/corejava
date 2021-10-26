package Abstraction.Abstract.Day1.ByHiteshSir;

public class B4 extends A4 {
	
	

	@Override
	public void m1() {
		super.start();
		super.m2();
		System.out.println("m1--------B4");
		
	}
	public static void main(String[] args) {
		
		I4 i = new B4();
		i.start();
		System.out.println(i.x);
		i.end();
		i.m1();
		
	}
	@Override
	public void end() {
		System.out.println("end ---- engline----B4");
		
	}

}
