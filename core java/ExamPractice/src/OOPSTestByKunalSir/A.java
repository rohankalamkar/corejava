package OOPSTestByKunalSir;

public class A{

	final int x=10;
	private void m1() {
		
	}
	public A() {
		
	}
	
	
	public void m2() {
		
	}
	public static void main(String[] args) {
		System.out.println("Main-------Start");
		try {
			System.out.println("try ---------Start");
			String s1 = args[2];
			int x = Integer.parseInt(s1);
			System.out.println(x/0);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator cannot be zero..It will Gives you Infinite result..");
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter valid input name");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("This array index is not found");
		}
		catch(Exception e) {
			System.out.println("Other Exception...");
		}
		System.out.println("Main-----------End");
		
		
		
	}


}
