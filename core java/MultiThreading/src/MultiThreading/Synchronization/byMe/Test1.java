package MultiThreading.Synchronization.byMe;

public class Test1 {
	public static void main(String[] args) {
		
		
		Hello1 h = new Hello1();   // We apply Synchronization here (For Single Hello Object)
		
		// here Only One thread will Execute at a single time
		// First T1 Thread will execute and Then after T2 Thread will execute
		// 
		
		MyThread1 t1 = new MyThread1(h);
		t1.setName("T1 Thread");
		t1.start();
		
		MyThread1 t2 = new MyThread1(h);
		t2.setName("T2 Thread");
		t2.start();
		
		//System.out.println("----------------------------------------------------------");
		// Here Problem Arrives When We Create Another same Object like below
		
		//Problem is :  Chances of Mixing Thread T1 and Thread T3 Because Both are running at same times
		// Here T3 Thread will execute first then After T4 thread will execute because of Object leven Syncronization
		// Or we call Object level Lock or non static Synchronization
		// But problem here is T1 and T3 Thread will execute and there is chances of mixing. 
		// For This problem we Have Static Synchronizational lock/Class level lock/ class level Syschronization
		
		
		
//		Hello1 h1 = new Hello1();
//		MyThread1 t3 = new MyThread1(h1);
//		t3.setName("T3 Thread");
//		t3.start();
//		
//		MyThread1 t4 = new MyThread1(h1);
//		t4.setName("T4 Thread");
//		t4.start();
		
	}

}
