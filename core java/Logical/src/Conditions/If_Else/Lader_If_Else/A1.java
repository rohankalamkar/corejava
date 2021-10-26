package Conditions.If_Else.Lader_If_Else;

public class A1 {
	public static void main(String[] args) {
		System.out.println("Main----Start");
		
		int x =20;
		
		if (x<20 || x==20) {         // F || T = T 
			System.out.println("x<20   or x>20 ");
		}
		else if (x>20) {
			System.out.println("x greater than 20");
		}
	
		System.out.println("Main -------- End");
	}


}
