package MultiThreading.Synchronization.byHiteshSir;

public class Test1 {
	public static void main(String[] args) {
		
		Display1 d = new Display1();
		
		MyThread1 t1 = new MyThread1(d, "Raj");
		
		MyThread1 t2 = new MyThread1(d, "Nikhil");
		
		t1.start();
		t2.start();
		
		
		
		
		
		
		
		
	}

}
