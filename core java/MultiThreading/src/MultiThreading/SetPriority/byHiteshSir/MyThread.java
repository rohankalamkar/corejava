package MultiThreading.SetPriority.byHiteshSir;

import java.util.Iterator;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println(currentThread().getPriority());
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println("MyThread : "+currentThread().getName()+" : "+currentThread().getPriority());
		}

		
	}
	
	
	

}
