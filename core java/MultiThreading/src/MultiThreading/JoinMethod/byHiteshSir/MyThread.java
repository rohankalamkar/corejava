package MultiThreading.JoinMethod.byHiteshSir;

public class MyThread extends Thread{
	// Example 1 : 
	
	@Override
	public void run() {
//		try {
//			System.out.println(currentThread().getName());
//			//currentThread().join();
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		for(int i = 0;i<10;i++) {
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Waiting this(current) Thread till executed. 
			//  Once Other code executed then after this code executed(joins hands/Handshaking)
			System.out.println("CJC---Akurdi -- :  " +currentThread().getName());
			
		}

	}

}
