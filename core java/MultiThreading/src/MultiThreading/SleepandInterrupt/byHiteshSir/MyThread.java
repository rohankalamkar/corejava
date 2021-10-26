package MultiThreading.SleepandInterrupt.byHiteshSir;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("CJC-Akurdi--- : "+currentThread().getName());
			
			try {
				sleep(1000);
				System.out.println("I am Sleeping..");
			} catch (InterruptedException e) {
				
				System.out.println("I am interruptor");
			}
		}
		
	}

}
