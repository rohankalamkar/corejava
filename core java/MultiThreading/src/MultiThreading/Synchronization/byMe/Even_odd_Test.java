package MultiThreading.Synchronization.byMe;

public class Even_odd_Test {
	public static void main(String[] args) {
		
		Even_odd t1 = new Even_odd();
		
		t1.start();
		
		Even_odd t2 = new Even_odd();
		
		t2.start();
		
	}

}
