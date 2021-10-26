package methodCallingTypes.StaticMethodCalling;

public class Test5 {
	public static void m2(){

		System.out.println("M2-----");
		}
		//public void main(String args[]){   //Error: Main method is not static in class Test5, please define the main method as:
		 public static void main(String[] args) { // JVM give access to call by static 

		    		Test5.m2();

		}

}
