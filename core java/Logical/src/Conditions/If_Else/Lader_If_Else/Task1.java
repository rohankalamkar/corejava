package Conditions.If_Else.Lader_If_Else;

public class Task1 {
	public static void main(String[] args) {
		int a=60;
		int b = 65;
		int c = 20;
		System.out.println("Comparison Between Three Numbers a,b,c");
		
		// Comparison Between Three Numbers 
		
		if (a>b && a>c) {
			System.out.println("Greatest Number between  a, b, c is a : "+a);
		}
		else if(b>a && b>c) {
			System.out.println("Greatest Number between  a, b, c is b : "+b);
		}
		else if(c>a && c>b) {
			System.out.println("Greatest Number between  a, b, c is c : "+c);
		}
		

	}
}


