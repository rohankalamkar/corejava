package MultiThreadInto.ByKunalSir.WithThread;

public class NumberG extends Thread {
	int st;
	int end;
	public NumberG(int st, int end) {
		this.st=st;
		this.end= end;
	}
	
	@Override
	public void run() {
		for(int i = st;i<end;i+=2) {
			System.out.println(i+" : "+currentThread().getName());
		}
	}
}
