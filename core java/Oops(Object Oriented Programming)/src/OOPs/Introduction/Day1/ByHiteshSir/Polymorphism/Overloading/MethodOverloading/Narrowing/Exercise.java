package OOPs.Introduction.Day1.ByHiteshSir.Polymorphism.Overloading.MethodOverloading.Narrowing;

public class Exercise {
	public void mean(int x) {
		System.out.println("Value of x is : "+x);
	}

}
 class Exercise1 extends Exercise{
	 
	 public void mean(int x,int y) {
		 super.mean(x);
		 System.out.println("Value of y is : "+y);
		 
	 }
	
}
 class Exercise2 extends Exercise1{
	 public void mean(int x,int y, int z) {
		 super.mean(x, y);
		 System.out.println("Value of z is : "+z);
		 int Avg = (x+y+z)/3;
		 System.out.printf("Average of Value %d , %d and %d is : %d",x,y,z,Avg);
	 }
	 public static void main(String[] args) {
		Exercise2 e = new Exercise2();
		e.mean(10,20,30);
		 
		 
	}
	 
	
	 
	 
 }
