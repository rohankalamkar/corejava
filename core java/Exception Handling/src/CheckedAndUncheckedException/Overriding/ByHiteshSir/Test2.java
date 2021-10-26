package CheckedAndUncheckedException.Overriding.ByHiteshSir;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 extends Exception{

	
	public static void main(String[] args)  throws IOException,ClassCastException {
		
		
		B2 b = new B2();
		Test2 t1 = new Test2();
		try {
			b.m1();
		} catch ( Exception e) {
			System.out.println("Catch----Block");
			//e.printStackTrace();
//			Test2 t2 = (Test2)e;
//			t1=t2;
			System.out.println(e.getMessage());
			System.out.println("1--------------------------------------");
			System.out.println(e.toString());
			System.out.println("2.-------------------------------------");
			//e.printStackTrace();
			
			
			
		}
	
		System.out.println("____________________________________________");
		System.out.println(t1.getMessage());
		System.out.println("3-----------------------------------------");
		//t1.printStackTrace();
		System.out.println("4.----------------------------------------");
		System.out.println(t1.toString());;
		System.out.println("5-----------------------------------------");
		
		
		
		
		
	}

}
