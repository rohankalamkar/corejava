package Unchecked.MethodAndConstructor;

import java.io.IOException;

public class B1 extends A1{
	@Override
	public void m1() throws RuntimeException,ArithmeticException {  // Will not Give You Any error
	super.m1();	
	}
//	@Override
//	public void m2() throws RuntimeException { //throwing parent Runntime class
//		
//	}
	//@Override
	public void m3() throws Exception{ // Throwing child
		
	}
	//public void m4() throws Exception{  // Exception Exception is not compatible with throws clause in A1.m4()
		  // It is uncompatible because RuntimeEXception class is Completely Unchecked Exception class
		  // While Exception class is not purely Unchecked.It is Partially Unchecked And partially Checked class
		  // Therefore in Unchecked class It will gives Error
	//}
	
//	public B1() throws RuntimeException{
//		
//		
//	}
	
//	public B1() throws Exception {  // Yes It is Compatible with Constructor
//		
//	}
//	public B1() throws ArithmeticException,RuntimeException,IOException{
//		// It means You can throws any Exception class
//		// No worry about maintaining heirarchy here
//	}

}
