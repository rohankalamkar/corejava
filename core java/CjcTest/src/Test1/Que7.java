package Test1;

public class Que7 {

}
 class A7 {
public A7 m1() {
return new A7();
}

public A7 m2() {
return new A7();
}
public Object m3() {
return new Object();
}
}
class B7 extends A7{
	@Override
public B7 m1() {
return new B7();
}

//public Object m2() { 
//return new Object();
//}
@Override
public A m3() {
return new A();
}
}
