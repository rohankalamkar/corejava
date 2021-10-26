package MultiThreading.Intro.ByHiteshSir;

public class Test1 {
	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		
		System.out.println("----------------------------------------------");
		
		for(int i = 1;i<20;i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
		
		
		
		
	}

}
