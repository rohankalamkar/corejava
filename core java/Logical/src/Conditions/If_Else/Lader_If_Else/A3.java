package Conditions.If_Else.Lader_If_Else;

public class A3 {
	public static void main(String[] args) {
		System.out.println("Main----Start");
		
		int x =23 ;
		int y = 23%4;
		System.out.println(y);
		
		if (x%4==0) {         // T && T = T      x%2= 1    here
			System.out.println("Given Number is Divisible by 4");
		}
		else {
			System.out.println("Given Number is not Divisible by 4");
		}
	
		System.out.println("Main -------- End");
	}

}
