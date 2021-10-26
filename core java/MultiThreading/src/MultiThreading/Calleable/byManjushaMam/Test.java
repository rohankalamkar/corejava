package MultiThreading.Calleable.byManjushaMam;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {
		
		MyCallable fr1 = new MyCallable(1,100);
		
		MyCallable fr2 = new MyCallable(2,100);
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		executorService.submit(fr1);    // calling call method
		executorService.submit(fr2);    // Calling call method
		System.out.println("-----------------------------------------------------");
		
		
		
		MyRunnable mr = new MyRunnable();
		
		executorService.submit(mr);   // You can start Run Method by Executor services
		
		executorService.shutdown();
		
		
		
		
	}

}
