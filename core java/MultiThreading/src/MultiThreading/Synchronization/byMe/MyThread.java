package MultiThreading.Synchronization.byMe;

public class MyThread extends Thread{
	
	Hello h ;
	
	public MyThread(Hello h) {
		this.h=h;
	}
	
	@Override
	public void run() {
		h.display();
	}
	

	

}
