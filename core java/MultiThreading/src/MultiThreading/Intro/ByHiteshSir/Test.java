package MultiThreading.Intro.ByHiteshSir;

public class Test {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.m1();
		System.out.println("----------------------------------------------");
		for(int i = 1;i<20;i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}
}
