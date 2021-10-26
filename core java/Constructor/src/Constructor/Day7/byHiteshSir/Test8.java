package Constructor.Day7.byHiteshSir;

public class Test8 {
	public static void main(String args[]){
		System.out.println("Main start----");
		//A8 a = new A8();    // invalid Syntax :(because in A8 No-Arg Constructor not provided)

		A8 b = new A8(20);    // Correct syntax (because in A8, parameterized constructor provided)
		System.out.println("Main end----");
		}


}
