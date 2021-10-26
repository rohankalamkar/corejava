package Conditions.NonPrimitiveReturnType.ClassRetuenTypeByKunalSir;

public class A_StringReturn {
	String x  = "ABC";
	//String y  = "YYY";
	public String sum(A_StringReturn b) {
		//A_StringReturn c = new A_StringReturn();
		System.out.println("Return Type ----1. : "+b.x);
		//System.out.println("Retern type ------1 . : "+b.y);
		b.x ="Rohan";
		//b.y =" ZZZ";
		System.out.println("Retern type ------ 2 . : "+b.x);
		//System.out.println("Retern type ------ 2 . : "+b.y);
		//String z = x+y;
		return x;  // Here you only return single(1) string parameter, not more than 1
	}
	public static void main(String[] args) {
		A_StringReturn a = new A_StringReturn();
		
		System.out.println("Normal : "+a.x);
		//System.out.println("Normal : "+a.y);
		a.x = "PQR";
		//a.y = "ZZZ";
		System.out.println("Main Starting------1." +a.x);
		//System.out.println("Main Starting------2." +a.y);
		String b = a.sum(a);
		System.out.println("Final After Comes out from Class Return method : "+ b);
	}

}
