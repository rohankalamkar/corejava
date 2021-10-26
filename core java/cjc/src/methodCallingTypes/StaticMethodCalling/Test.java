package methodCallingTypes.StaticMethodCalling;

public class Test {

public void m1(){
System.out.println("Non static method of----m1");
}

public static void main(String []args){
Test a = new Test();
a.m1();

//m1();   // error: non-static method m1() cannot be referenced from a static context

}
	

}
