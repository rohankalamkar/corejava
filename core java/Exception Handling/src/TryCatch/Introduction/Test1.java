package TryCatch.Introduction;

public class Test1 {
	public static void main(String[] args) {
		
		System.out.println("Main-------Start");
		
		System.out.println(10/5);
		try {
			System.out.println("Try ------Start");
			System.out.println(10/5);
			System.out.println("Try -------End");
		}
		catch(ArithmeticException e) {  // It there is no ExceptionError statement then catch block will skipped
			System.out.println("Catch-------Block");
			System.out.println(e);
		}
		
		System.out.println("Main-------End");
		
		
	}

}
//Output: 
//Main-------Start
//2
//Try ------Start
//2
//Try -------End
//Main-------End
