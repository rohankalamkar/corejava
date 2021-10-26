package PrimitiveDataTypes.Casting_in_Primitive;

public class Test6 {
	public static void main(String args[]){
		double d = 625.2254663; 
		int i = (int)d;
		System.out.println("DownCasting , double to int : "+i);

		int i1 = 625;

		double d1 = i1; 
		System.out.println("UpCasting , int to double : "+d1);


		}

}
