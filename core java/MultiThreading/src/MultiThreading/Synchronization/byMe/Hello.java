package MultiThreading.Synchronization.byMe;

public class Hello {
	
	
	public void display() {
		for(int i = 0;i<10;i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}

}
