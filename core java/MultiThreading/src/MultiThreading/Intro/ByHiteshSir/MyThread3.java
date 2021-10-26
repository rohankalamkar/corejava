package MultiThreading.Intro.ByHiteshSir;

public class MyThread3 extends Thread{
	@Override
	public void run() {   //Thread 0 
		m1();   

	}
	
	
	public void run(int x) {   //Thread 0 
		m2();   

	}
	
	
	
	public void m1() {
		for(int i=1;i<20;i++) {
			System.out.println(i+" m1() : "+currentThread().getName());
		}

	}
	public void m2() {
		for(int i=1;i<20;i++) {
			System.out.println(i+" m2(): "+currentThread().getName());
		}
	}

}
