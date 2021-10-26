package MultiThreading.Calleable.byHiteshSir;

import java.util.concurrent.Callable;

public class NumberG implements Callable<Integer>{
	
	int st;
	int end;
	int s;
	
	public NumberG(int st,int end) {
		this.st=st;
		this.end=end;
	}
	
	@Override
	public Integer call() throws Exception {   // Callable has call method, while Runnable interface and thread Class has run method 
		
		for(int i = st;i<end;i++) {
			s=s+i;
			System.out.println(i+" : "+Thread.currentThread().getName());
			i++;
		}
		return s;
	}
	
	

}
