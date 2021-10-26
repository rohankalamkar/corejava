package MultiThreading.Synchronization.byHiteshSir;

public class Display {
	// Without Synchronization
	
	public void call(String name)  {
		
		for(int i=0;i<10;i++) {
		System.out.println("Hello----- : "+i+" : "+name);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
