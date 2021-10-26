package MultiThreading.Synchronization.byMe;

public class Hello2{
	
	
//	public static synchronized void display() {   // Object level Synchronization 
//		for(int i = 0;i<20;i++) {
//			System.out.println(i+" : "+Thread.currentThread().getName());
//		}
//	}
	
	public void display() {   // Both are same here
		synchronized (Hello2.class) {   // synchronized block / class level lock
			 
			for(int i = 0;i<20;i++) {
				System.out.println(i+" : "+Thread.currentThread().getName());
			}
		}
		
	}

}
