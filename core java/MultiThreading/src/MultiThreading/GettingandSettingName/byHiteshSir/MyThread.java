package MultiThreading.GettingandSettingName.byHiteshSir;

public class MyThread extends Thread {
	
	
	@Override
	public void run() {
		System.out.println(currentThread().getName());
		System.out.println("-----------------------------------");
		System.out.println(Thread.currentThread().getName());
	}
	

}
