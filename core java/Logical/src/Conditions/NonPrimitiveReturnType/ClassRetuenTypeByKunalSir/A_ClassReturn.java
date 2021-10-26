package Conditions.NonPrimitiveReturnType.ClassRetuenTypeByKunalSir;

public class A_ClassReturn {
	int x = 10;
	public A_ClassReturn sum(A_ClassReturn a) {
		
//		A_ClassReturn a = new A_ClassReturn();   // It will create default constructor memory
		
		System.out.println("Return Type ----1. : "+a.x);
		
		a.x = 80;
		System.out.println("Retern type ------ 2 . : "+a.x);
		return a;  // Here you return complete memory of that class which can contains more than 1 Variable 
		
	}
	public static void main(String[] args) {
		A_ClassReturn a = new A_ClassReturn();
		
		System.out.println("Normal : "+a.x);
		
		a.x = 50;
		System.out.println("Main Starting------1." +a.x);
		
		A_ClassReturn b = a.sum(a);   // Return Method Calling
		
		System.out.println("Final After Comes out from Class Return method : "+ a.x);  // Return value calling
	
		}

}
