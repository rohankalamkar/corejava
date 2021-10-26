package PrimitiveDataTypes.Casting_in_Primitive;

public class Test2 {
	public static void main (String [] args){

		byte b = 25;     //(size 1 byte --> size 4 byte)
		                 // it is like 1 book storing into 4 book capacity shell
		int i = b;       // auto upcasting in case of primitive 
		                 // here we will not get any CE(Compile time Error)

		System.out.println(i);


		}

}
