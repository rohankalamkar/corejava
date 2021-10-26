package TryCatch.MultipleCatch;

public class A {
	int x =10;

	
	public static void main(String[] args1) {
		
		try {
			String s = args1[3];  
			
			int x = Integer.parseInt(s);  
			Class.forName("A");
				
			int a = 10/x;
					
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();			
			System.out.println("Plz enter non Zero value");
		}
		catch(NumberFormatException e) {
			e.printStackTrace(); // Here it will not trace any path because we are setting value in main args method
			System.out.println("Plz enter number");
		}
	
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Please enter valid input");
		}
		catch(RuntimeException e) {
			System.out.println("Run time errorrrr..................");
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class Not Present here...");
		}
		catch(Exception e) {
			System.out.println("Parent of All exception is : "+e);
			
		}
		System.out.println("Main --------End");
		
		
	}

}
