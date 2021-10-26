package Conditions.Scanner;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Byte Value : ");
		byte b = sc.nextByte();
		
		System.out.println("Enter Short Value : ");
		short s = sc.nextShort();
		
		System.out.println("Enter Int Value : ");
		int i = sc.nextInt();
		
		System.out.println("Enter Long Value : ");
		long l = sc.nextLong();
		
		System.out.println("Enter float Value : ");
		float f =sc.nextFloat();
		
		System.out.println("Enter double Value : ");
		double d = sc.nextDouble();
		
		System.out.println("Enter Boolean Value : ");
		boolean flag = sc.nextBoolean();
		
//		System.out.println("Enter char Value : ");
//		char c  = sc.nextChar();                 // The method nextChar() is undefined for the type scanner
		
		System.out.println("Enter String Data : ");
		String s1 = sc.next();		
		
		System.out.println("-----------------------------------------------");
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(flag);
		System.out.println(s1);
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
		
	}

}
