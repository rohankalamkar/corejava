package MultiThreadInto.ByKunalSir.Synchronization;

public class Test {
	public static void main(String[] args) {
		
		Hello h = new Hello();
		
		MyThread t1 = new MyThread(h, "JAVA");
		MyThread t2 = new MyThread(h, "Classes");
		
		t1.start();
		t2.start();
		// Problem arrived when We create different object in same class.
		// 
		Hello h1 = new Hello();
		
		MyThread t3 = new MyThread(h1, "CJC");
		MyThread t4 = new MyThread(h1, "PUNE");
		
		t3.start();
		t4.start();
		
		
	}

}
