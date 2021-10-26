package PrimitiveDataTypes.Casting_in_Primitive;

public class Test3 {
	public static void main(String args []){

		short s = 111;

		byte b = (byte)s;      // Downcasting perform MANUALLY 

		System.out.println("DownCasting short to byte : " +b);

		byte b1 = 85;

		short s1 = b1;         // Upcasting performs AUTOMATICALLY

		System.out.println("UpCasting byte to short : " +s1);

		}

}
