package methodCreation;

public class addition {
	public void add1(){
		System.out.println("Start addition Program");
		float a = 2500;
		float b = 35;
		float c = 40;
		float d = 50;
		float add = a+b+c+d;
		double mult = b*c;
		float div = a/b/c/d;
		float sub = a-b-c-d;
		System.out.println("Addition of 4 numbers is : "+add );
		System.out.println("Multiplication of 4 numbers is : "+mult);
		System.out.println("Division of 4 numbers is : "+ div);
		System.out.println("Substraction of 4 numbers is :" + sub);
		System.out.println("End Addition program");
		}


		public static void main(String args[]){
		addition a = new addition();
		a.add1();

		}
		}
		class file{
		public void add2(){
		System.out.println("Start file Program---");
		float a = 5;
		float b = 8;
		float c = 10;
		float d = 12;
		float add = a+b+c+d;
		float min = a-b-c-d;
		float mult = a*b*c*d;
		float div = d/c/b/a;
		System.out.println("Addition of 4 numbers is "+add);
		System.out.println("Substraction of 4 numbers is :"+min); 
		System.out.println("Multiplication of 4 numbers is :"+mult);
		System.out.println("Division of 4 numbers is : "+div);
		System.out.println("End file program");
		}


		public static void main(String args[]){
		file bd = new file();
		bd.add2();
		}

}
