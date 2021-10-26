package Constructor.Day7.byHiteshSir;

public class A10 {
	 int x;
	 String s ;
	 public A10(int y){
	 x = y;
	 s = "Rohan";
	 System.out.println("I am parameterized Constructor for A10.");

	 }
	 public A10(){
	 x = 50;
	 s = "Kalamkar";

	 System.out.println("I am No arg Constructor for A10. ");

	 }

	 public void get(){
	 System.out.println("Getting value : " + x);
	 System.out.println("Candidate name : "+ s);
	 }

}
