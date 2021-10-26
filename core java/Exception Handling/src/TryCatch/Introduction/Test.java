package TryCatch.Introduction;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main------Start");

		// System.out.println(10/0); // It is Unchecked Error Exception
		// ArithmeticException: / by zero
		// So we write this statement in try catch Block

		try {
			System.out.println("Try------Start");
			System.out.println(10 / 0);
			System.out.println("Try------End");
		} catch (ArithmeticException e) {
			System.out.println("Catch ----Block");

		}

		System.out.println("Main------End");

	}

}
// try , catch , finally, throw , throws

//Output : 
//	Main------Start
//	Try------Start
//	Catch ----Block
//	Main------End
