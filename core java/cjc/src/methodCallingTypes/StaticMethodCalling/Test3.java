package methodCallingTypes.StaticMethodCalling;

public class Test3 {
	public static void m1(){
		System.out.println("static method of m1");
		//m2();          // error: non-static method m2() cannot be referenced from a static context

		}
		public void m2(){
		System.out.println("non static method ---m2");
		m1();
		}
		public static void main(String [] args){
		System.out.println("Main Start----");
		Test3 a = new Test3();
		a.m2();
		System.out.println("----Main End");
		}

}
