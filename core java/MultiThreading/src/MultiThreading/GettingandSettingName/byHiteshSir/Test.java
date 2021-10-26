package MultiThreading.GettingandSettingName.byHiteshSir;

public class Test {
	public static void main(String[] args) {
		
		System.out.println(" Before: "+Thread.currentThread().getName());
		
		Thread.currentThread().setName("CJC Thread");
		
		System.out.println(" After : "+Thread.currentThread().getName());
		
		
		MyThread t1 = new MyThread();
		System.out.println("MyThread T1 Before : "+t1.getName());
		
		t1.setName("JAVA Thread");
		
		System.out.println("MyThread T1 After : "+t1.getName());
		System.out.println("-----------------------------------------------");
		
		t1.start();
		
	}

}
