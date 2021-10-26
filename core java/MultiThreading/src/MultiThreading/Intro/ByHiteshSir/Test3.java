package MultiThreading.Intro.ByHiteshSir;

public class Test3 {
	
	public static void main(String[] args) {
		
		MyThread3 t1 = new MyThread3();
		t1.run();
		t1.run(10);
		t1.start();
		
		
		
		
	}

}
