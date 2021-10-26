package MultiThreading.Synchronization.byMe;

public class Hello1 {
	
//	public synchronized void display() {   // Object level Synchronization 
//		for(int i = 0;i<20;i++) {
//			System.out.println(i+" : "+Thread.currentThread().getName());
//		}
//	}
	
	
	// Both are same here
	
	public void display() {
		
		synchronized (this) {
			
			for(int i = 0;i<20;i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
		}
		
	}
	

}
