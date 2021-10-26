package Test1;

public class Que4 {

}
 class A2 {
	 static {
	 System.out.println("static block--A");
	 }
	 public A2(){
	 System.out.println("A--constuctor");
	 }
}
  class B2 extends A2{ 
 static{
 System.out.println("static block--B");
 }
 public B2(){
 System.out.println("B--constructor");
 }
 }
 class Test {
 public static void main(String[] args) {
 A2 a=new A2();
 A2 a1=new B2();
 B2 b=new B2();
 }
 }

