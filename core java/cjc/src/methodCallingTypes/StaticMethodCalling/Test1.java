package methodCallingTypes.StaticMethodCalling;

public class Test1 {
	public void m1(){
		System.out.println("Non static method of----m1");
		m2();
		}
		public void m2(){
		System.out.println("Non static method of----m2");
		}

		public static void main(String []args){
		Test1 a = new Test1();
		a.m1();

		//m1();   // error: non-static method m1() cannot be referenced from a static context

		}

}
