package MultiThreading.SleepandInterrupt.byHiteshSir;

public class Test {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.start();
		System.out.println("Before interrupt : "+t1.isInterrupted());  // False
		
		t1.interrupt();
		t1.interrupt();
		
		System.out.println(t1.interrupted());
		
		System.out.println("After interrupt : "+t1.isInterrupted());
		
		
		
		
		
		
		
	}

}
