package MultiThreading.Intro.ByHiteshSir;

public class MyThread4 extends Thread {
	@Override
	public synchronized void start() {
		System.out.println("MyThread4 -----start");
		super.start();  // This super method calls below run methods
	}
	
	//@Override
	public void run() {   //Thread 0 
		m1();   

	}
	public void m1() {
		for(int i=1;i<20;i++) {
			System.out.println(i+" m1() : "+currentThread().getName());
		}

	}
	


}
