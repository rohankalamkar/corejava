package MultiThreadInto.ByKunalSir.WithoutThread;

public class NumberG {
	int st;
	int end;
	
	public NumberG(int st,int end) {
		this.st=st;
		this.end=end;
	}
	public void display() {
		for(int i = st;i<end;i+=2) {
			System.out.println(i);
			
		}
	}

}
