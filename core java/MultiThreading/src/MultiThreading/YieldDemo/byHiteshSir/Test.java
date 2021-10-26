package MultiThreading.YieldDemo.byHiteshSir;

public class Test {
	public static void main(String[] args) {
		//Thread.currentThread().setPriority(8);
		
		MyThread t1 = new MyThread();
		//t1.setPriority(2);
		t1.start();
		
		for(int i = 0;i<10;i++) {
			Thread.currentThread().yield();
			System.out.println("CJC-Karvenagar : "+Thread.currentThread().getName());
		}
	}
	// Primary work is waiting Thread Thread
	// Yield depends on Priority

}
