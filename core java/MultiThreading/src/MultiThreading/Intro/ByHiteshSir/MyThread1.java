package MultiThreading.Intro.ByHiteshSir;

public class MyThread1 extends Thread {
	
	@Override
	public synchronized void start() {
		m1();
		//super.start();   //Doesnt matter
	}
	
	
	
	public void m1() {
		for(int i=1;i<20;i++) {
			System.out.println(i+" : "+currentThread().getName());
		}

	}

}
