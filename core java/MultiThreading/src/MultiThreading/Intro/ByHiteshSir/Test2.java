package MultiThreading.Intro.ByHiteshSir;

public class Test2 {
	public static void main(String[] args) {
		
		
		MyThread2 t1 = new MyThread2();
	//	t1.run();   // No thread created yet
		
		
		t1.start();   // Yes New Thread created now.
		// Run method in myThread2 start by calling start() in main method
		
		
		
		System.out.println("----------------------------------------------");
		
		for(int i = 1;i<20;i++) {
			System.out.println("Main : "+Thread.currentThread().getName());
		}
		
	}

}
