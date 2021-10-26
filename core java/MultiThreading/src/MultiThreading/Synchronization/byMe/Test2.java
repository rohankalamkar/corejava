package MultiThreading.Synchronization.byMe;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		// static synchronization/Class Level Synchronization/class level lock
		
		// static synchronization apply here
		Hello2 h = new Hello2();
		
		MyThread2 t1 = new MyThread2(h);
		t1.setName("T1 Thread");
		t1.start();
		
		
		MyThread2 t2 = new MyThread2(h);
		t2.setName("T2 Thread");
		t2.start();
		
		// Now T1 thread Will complete first and Then T3 Thread Will Complete
		
		// because of static synchronization /class level lock each thread will start and complete.Then after new Thread will start and complete
		
		
		
		
		Hello2 h1 = new Hello2();
		
		MyThread2 t3 = new MyThread2(h1);
		t3.setName("T3 Thread");
		t3.start();
		
		
		MyThread2 t4 = new MyThread2(h1);
		t4.setName("T4 Thread");
		t4.start();
		
		
		
		
		
		
	}

}
