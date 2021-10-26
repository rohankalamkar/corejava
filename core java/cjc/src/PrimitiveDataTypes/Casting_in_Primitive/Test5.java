package PrimitiveDataTypes.Casting_in_Primitive;

public class Test5 {
	public static void main(String args[]){

		long l = 12345678l;

		double d = l;

		System.out.println("for same size data type, long to double : " +d);



		double d1 = 56354.541265;
		long l1 = (long)d1;

		System.out.println("for same size data type, double to long : " +l1);

		}

}
