package CheckedAndUncheckedException.Overriding.ByHiteshSir;

import java.io.FileNotFoundException;
import java.io.IOException;

public class B2 extends A2{
	public void m1() throws ClassCastException,IOException {   // Here we can only use IOException because m1() is IOException . We cannot write here Exception
		System.out.println("M1------B2-----Start");                                                        // It will give error
		super.m1();
		System.out.println("M1------B2-----End");   
		
	}

}
