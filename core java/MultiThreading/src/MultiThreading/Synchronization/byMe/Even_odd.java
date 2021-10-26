package MultiThreading.Synchronization.byMe;

public class Even_odd extends Thread {
	
	public static synchronized void display() throws InterruptedException {
		
		for(int i = 0; i<20;i++) {
			sleep(500);
			System.out.println(i+" : "+currentThread().getName());
		}
		
	}
	
//	public void display() throws InterruptedException {
//		
//		synchronized (Even_odd.class) {
//			for(int i = 0; i<20;i++) {
//				sleep(500);
//				System.out.println(i+" : "+currentThread().getName());
//			}
//			
//		}
//		
//
//		
//	}
	
	
	
	@Override
	public void run() {
		
		try {
			display();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
