package MultiThreading.Calleable.byManjushaMam;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
	int st;
	int end;
	int sum;

	public MyCallable(int st, int end) {
		this.st = st;
		this.end = end;
	}

	@Override
	public Integer call() throws Exception {
		for (int i = st; i < end; i+=2) {
			Thread.sleep(50);
			System.out.println(i + " : " + Thread.currentThread().getName());
			sum = sum + i;
		}
		return sum;
	}

}
