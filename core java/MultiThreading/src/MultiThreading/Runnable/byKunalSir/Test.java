package MultiThreading.Runnable.byKunalSir;

public class Test {
	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();  // Runnable interface is like just single bullet
		// to fire this bullet we Required gun (where thread class is complete gun)
		Thread t1 = new Thread(mr);   // Now bullet loaded in gun
		
		t1.start();   // Here Bullet fire
		
		
		
	}

}
