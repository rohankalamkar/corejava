package MultiThreading.Calleable.byManjushaMam;

public class MyRunnable  implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<50;i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+" :My Runnable  "+Thread.currentThread().getName());
		}
		
	}



}
