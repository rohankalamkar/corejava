package MultiThreading.JoinMethod.byHiteshSir;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		

		
	//Thread.currentThread().join(500);
		for(int i = 0;i<10;i++) {
			Thread.currentThread().sleep(1000);
			
			System.out.println(i+" :  Main----- : "+Thread.currentThread().getName());
		}
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		//t1.setPriority(2);
		//t2.setPriority(9);
		t2.start();
		t2.join(300); // Before join , this thread must have to start() i.e in running state
		t1.start();
		t1.join();   // Location matters in join method In this location, In this program , Unnecessary
		
		
		
		
		// join method is first complete its Thread execution then after it will join/handshake with others 
		
	
	}

}
