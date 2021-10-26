package MultiThreadInto.ByKunalSir.WithThread;

public class Test {
	public static void main(String[] args) {
		NumberG odd = new NumberG(1,100);
		NumberG even = new NumberG(2,100);
		
		//odd.run();   // If you call run it will work normally. (It means thread is not running yet)
		//System.out.println("------------------NORMAL RUN BY RUN--------------------");
		//even.run();  
		 System.out.println("____________________________________________________________________");
		// For Running thread, there is an inbuild method in Thread class to run Thread
		// start() method, which is neccessary to running thread.
		odd.setName("Odd Threads.");
		even.setName("Even Thread.");
		odd.setPriority(3);
		even.setPriority(10);
		odd.start();
		System.out.println("------------------THREAD RUN BY START---------------------");
		
		
		
 		even.start();
 		
 		
 		
 		
	}
}
