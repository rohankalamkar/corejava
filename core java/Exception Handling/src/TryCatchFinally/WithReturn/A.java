package TryCatchFinally.WithReturn;

public class A {  // Without Try block
	int x ;
	public int m1() {
		System.out.println("m1-----A");
		return x;
		//System.out.println("Statement after return in normal return method..");  //Error : Unreachable code
	}
	
	
	public static void main(String[] args) {
		
	}

}
