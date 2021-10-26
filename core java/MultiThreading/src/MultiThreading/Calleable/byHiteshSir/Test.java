package MultiThreading.Calleable.byHiteshSir;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(5);
		
		NumberG odd = new NumberG(1, 30);
		NumberG even = new NumberG(2, 30);
		
		Future fr = ex.submit(odd);
		Future fr1 = ex.submit(even);
		
		System.out.println(fr.get());
		System.out.println(fr1.get());
		
		
	}

}
