package SetterGetter.Day1.ByHiteshSir.SecondaryRef.Task2;

public class Calci {
	public int add(int x, int y ) {
		System.out.printf("Addition of %d and %d  : ",x,y);
		System.out.println("");
		int z = x + y;
		return z;
	}
	public int sub(int x , int y ) {
		System.out.printf("Substraction of %d and %d  : ",x,y);
		System.out.println("");
		int z = x-y;
		return z;
	}
	public int mult(int x , int y ) {
		System.out.println("Multiplication of "+x+" and "+ y+"   :");
		System.out.println();
		int z = x*y;
		return z;
	}
	public double div(int x , int y) {
		System.out.printf("Division of %d and %d  : ",x,y);
		System.out.println("");
		
		double z = (double)x/y;
		return z;
	}
	public static void main(String[] args) {
		 Calci c = new Calci();
		 int a1 = c.add(200, 500); 
		 System.out.println("Result is : "+a1);
		 
		 int a2 = c.sub(625, 25);
		 System.out.println("Result is : "+a2);
		 
		 int a3 = c.mult(45, 25);
		 System.out.println("Result is : "+a3);
		 
		 double a4 = c.div(625, 4);
		 System.out.println("Result is : "+a4);
				 
		
		
		
	}
	

}
