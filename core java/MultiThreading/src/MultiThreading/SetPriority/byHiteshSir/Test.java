package MultiThreading.SetPriority.byHiteshSir;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("Main Thread Priority : "+Thread.currentThread().getPriority());
		// Default thread Priority is 5
		MyThread t1 = new MyThread();
		System.out.println("T1 Thread before : "+t1.getPriority());
			
		t1.setPriority(2);
		System.out.println("T1 Thread after : "+t1.getPriority());
		t1.start();
		Thread.currentThread().setPriority(8);
		System.out.println(" Main Thread Priority after : "+Thread.currentThread().getPriority());
		
		for(int i =0;i<20;i++) {
			System.out.println("Main Thread : "+Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());
			
		}
		
		t1.setPriority(30);   //IllegalArgumentException
		// range is 0 -10
		
		// 0-4   : min priority
		//  5    : Mid priority (Default Priority)
		// 6-10  : Max Priority
		
		
		
	}

}
