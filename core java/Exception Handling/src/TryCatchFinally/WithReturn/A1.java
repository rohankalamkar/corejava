package TryCatchFinally.WithReturn;

public class A1 { // Return method with try Catch block
	int x = 5;
	
	public int m1() {
		try {
			System.out.println("Try -------Start");
			int  y = 10/0;
			//return y;
			//System.out.println("try ----End");  //Error : Unreachable Code
		}
		catch(ArithmeticException e){
			System.out.println("Catch----Block ----Start");
			return 20;
			//System.out.println("Catch----Block-----End"); //Error : Unreachable Code
		}
		catch(Exception e) {
			System.out.println("Exception......");
			return 80;
		}
		 return 30;   // Error : Now It becomes Unreachable code  // If you gives Return value in try as well as catch block(2 return statements)
						// If return statement only in try block or only in catch block then it then this This return statement is valid
		 
		 // In a nut shell : You only write two return statements here if You have 1 try and 1 catch block
		
		// If You Write return statement outside try catch block and If either try contains return statement or catch contains return statement 
		 // then then it will compiled successfully. and will return outside return value
	}
	public static void main(String[] args) {
		A1 a = new A1();
	    int x = a.m1();
	    System.out.println("Value : "+x);
		
		
		
	}

}
