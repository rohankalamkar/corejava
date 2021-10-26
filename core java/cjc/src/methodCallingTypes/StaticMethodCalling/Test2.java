package methodCallingTypes.StaticMethodCalling;

public class Test2 {
	public static void m1(){
		System.out.println("static method of m1");
		//m2();          // error: non-static method m2() cannot be referenced from a static context

		}
		public void m2(){
		System.out.println("non static method ---m2");
		}
		public static void main(String [] args){
		System.out.println("Main Start----");
		Test2 a = new Test2();
		a.m1();    // static method can also call this way 
		System.out.println("----Main End");
		}


}
