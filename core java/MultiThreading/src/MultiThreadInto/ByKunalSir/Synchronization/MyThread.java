package MultiThreadInto.ByKunalSir.Synchronization;

public class MyThread extends Thread {
	Hello h;
	String msg;
	
	public MyThread(Hello h,String msg) {
		this.msg=msg;
		this.h=h;
	}
	
	@Override
	public void run() {
		h.display(msg);
	}

}
