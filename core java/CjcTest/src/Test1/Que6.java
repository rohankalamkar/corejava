package Test1;

public class Que6 {

}
 class B6 { 
int x;
static int y;
public B6(){
x=10;
y=20;
}
public static void main(String[] args) {
B6 b=new B6();
b.x=100;
b.y=200;
System.out.println(b.x);
System.out.println(b.y);
B6 b1=new B6();
System.out.println(b1.x);
System.out.println(b1.y);
}
} 
