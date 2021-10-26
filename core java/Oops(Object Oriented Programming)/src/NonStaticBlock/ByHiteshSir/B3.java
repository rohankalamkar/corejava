package NonStaticBlock.ByHiteshSir;

public class B3 {
	A3 a = new A3();
	
	public static void main(String[] args) {
		System.out.println("Main ------Start");
		B3 b = new B3();
		A3 c = new A3();
		
		
		
	}

}
//Output : 
//Main ------Start
//Static ----Block---A3
//Non-Static -----Block----A3
//Constructor of-----A3
//Non-Static -----Block----A3
//Constructor of-----A3