package MultiThreading.Synchronization.byMe;

public class MyThread1 extends Thread{

	
	Hello1 h ;
	
	public MyThread1(Hello1 h) {
		this.h=h;
	}
	
	@Override
	public void run() {
	//	h.display();
	}
	

}
