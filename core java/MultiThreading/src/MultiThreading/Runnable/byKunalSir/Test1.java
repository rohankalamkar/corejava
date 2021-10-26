package MultiThreading.Runnable.byKunalSir;

public class Test1 {
	public static void main(String[] args) {
		
		MyRunnable1 mr = new MyRunnable1();
		
		Thread t1 = new Thread(mr);
		t1.start();
		
		
		for(int i = 0; i<20;i++) {
			System.out.println("main---- :  "+Thread.currentThread().getName());
		}
		
		
	}

}
