package methodCallingTypes.StaticMethodCalling;

public class Test4 {
	public static void m2(){
		System.out.println("Static method  m2--of--test4");
		}

		public static void main(String args[]){
		System.out.println("Main start---");

		m2();     // Type 1 :- Calling Directly

		Test4 t = new Test4();  // Type 2 :- By Creating Object

		t.m2();  //Static method

		Test4.m2();    //(Recommended) Type 3 :- By Using Class name(in company we use this)  




		System.out.println("Main End---");
		}


}
