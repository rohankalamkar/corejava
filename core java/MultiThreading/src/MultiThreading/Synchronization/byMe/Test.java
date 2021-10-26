package MultiThreading.Synchronization.byMe;

public class Test {
	public static void main(String[] args) {
		Hello h = new Hello();
		MyThread t1 = new MyThread(h);
		t1.start();
		
		MyThread t2 = new MyThread(h);
		t2.start();
		
		// Here Two Thread Mixed means Mixed Output is Here 
		// For that we use synchronized .
		// This Condition occurs when Accessing single account at two DIfferent location with same time.
		
	}

}
