package MultiThreading.Synchronization.byHiteshSir;

public class Test {
	public static void main(String[] args) {
		
		Display d = new Display();
		
		MyThread t1 = new MyThread(d, "Raj");
		MyThread t2 = new MyThread(d, "Nikhil");
		t1.start();
		t2.start();
		
		
		
		
	}

}
