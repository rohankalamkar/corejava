package Constructor.Day8.byKunalSir;

public class A2 {
	int x = 10;
	public A2(int x){
	this.x= x;
	System.out.println("value in constructor: "+x);

	}

	public A2(){


	}

	public static void main(String args[]){

	A2 a = new A2(20);
	System.out.println("value after object creation : "+a.x);



	}

}
