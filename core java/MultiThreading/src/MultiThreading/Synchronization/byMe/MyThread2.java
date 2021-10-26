package MultiThreading.Synchronization.byMe;

public class MyThread2 extends Thread {
	Hello2 h ;
	
	public MyThread2(Hello2 h) {
		this.h=h;
	}
	
	@Override
	public void run() {
		h.display();
	}

}
