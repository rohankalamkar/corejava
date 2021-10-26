package MultiThreading.Runnable.byKunalSir;

public class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<100;i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
		
	}

}
