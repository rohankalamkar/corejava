package MultiThreading.Synchronization.byHiteshSir;

public class MyThread1 extends Thread{
	Display1 d;
	String name;
	
	public MyThread1(Display1 d  , String name) {
		this.d=d;
		this.name=name;
	}
	@Override
	public void run() {
		
		d.call(name);

	}

}
