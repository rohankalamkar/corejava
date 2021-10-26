package PrimitiveDataTypes.DefaultValue;

public class Test1 {
	public static void main(String args[]){

		Demo a = new Demo();
		a.b = 50;
		a.s = 4200;
		a.i = 562563489;
		a.l = 99756910282508L;   // or a.l=99756910282508l; 
		a.f = 88.22f;
		a.d = 11.2357454456442;
		a.c = 'h';
		a.flag = true;
		 
		System.out.println(a.b);
		System.out.println(a.s);
		System.out.println(a.i);
		System.out.println(a.l);
		System.out.println(a.f);
		System.out.println(a.d);
		System.out.println(a.c);
		System.out.println(a.flag);


		}
	

}
