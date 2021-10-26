package TryCatchFinally.WithReturn;

public class A2 {  // Return method With Try catch and finally 
	int x = 5;
	
	public int m1() {
		try {
			System.out.println("Try -------Start");
			int  y = 10/0;
			//return y;
			//System.out.println("try ----End");  //Error : Unreachable Code
		}
		catch(Exception e){
			System.out.println("Catch----Block ----Start");
			return 20;
			//System.out.println("Catch----Block-----End"); //Error : Unreachable Code
		}
		finally {
			int z = 50;
			System.out.println("Finally Block : "+z);
			//return z;   // Return value in finally block is not recommended at all
			            // It gives warning : finally block does not complete normally
			// Program alyways return finally return value....So return in finally is not Recommended at all
						// If you put return statments in finally..In this case other return value like try and catch return are meaningless
						// and normal return value is Unreachable
			
			
		} 
		 return 30;   // Error : Now It becomes Unreachable code  // If you gives Return value in try as well as catch block(2 return statements)
						// If return statement only in try block or only in catch block then it then this This return statement is valid
		 
		 // In a nut shell : You only write two return statements here if You have 1 try and 1 catch block
		
		 
	}
	public static void main(String[] args) {
		A2 a = new A2();
	    int x = a.m1();
	    System.out.println("Value : "+x);
	    System.out.println("Main------End");
		
		
		
	}

}
