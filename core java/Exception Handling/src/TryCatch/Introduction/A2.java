package TryCatch.Introduction;

public class A2 {
	public static void main(String[] args) {
		
		
		
		System.out.println("Main-------Start");
		
		//System.out.println(10/5);
		try {
			System.out.println("Try ------Start");
			System.out.println(10/0);
			System.out.println("Try -------End");
		}
		catch(ArithmeticException e) {  // It there is no ExceptionError statement then catch block will skipped
			System.out.println("Catch-------Block");
			System.out.println(e);
		}
		
		System.out.println("Main-------End");
		
		
	}
	}


