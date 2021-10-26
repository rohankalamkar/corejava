package MultiThreading.YieldDemo.byHiteshSir;

public class MyThread extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			//yield();
			System.out.println("CJC-Akurdi : "+currentThread().getName());
		}
		
	}
	// 1. Purpose :
	// Yield in english means to give up or to surrender. 
	//Yield means currently executing thread gives chance to the threads that have equal priority in the Thread-pool.
	//Yield does not guarantee that it will change the state of the currently executing thread to runnable state immediately.
	// If a join is called on a thread instance than it can be used to join the start of a thread's execution to the end of another thread's execution, such that a thread will not start running until another thread has ended.
	
	// 2. State change :  Yield changes the state from running to runnable. 
	// If the method join() called on the Thread instance, a thread will not start running until another thread finish executing.

	
	//Yield() :(attitude) samne wala Wait karunga but jada wait nahi karunga..
	// join() :(attitude) samne wala wait karta rahega jb tak pahle wala pura execute nahi hoga.(just like synchronized lock)
	
	
}
