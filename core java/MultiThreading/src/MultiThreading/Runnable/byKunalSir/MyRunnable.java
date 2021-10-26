package MultiThreading.Runnable.byKunalSir;

public class MyRunnable  implements Runnable{
    // Runnable is like just single bullet
	// To use this bullet we require gun . // Thread class is complete gun
	@Override
	public void run() {
		
		for(int i = 0;i<20;i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
		
	}

}
