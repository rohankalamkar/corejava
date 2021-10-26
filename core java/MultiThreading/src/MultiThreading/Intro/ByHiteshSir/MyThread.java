package MultiThreading.Intro.ByHiteshSir;

public class MyThread extends Thread {

	public void m1() {
		for(int i=1;i<20;i++) {
			System.out.println(i+" : "+currentThread().getName());
		}

	}

}
