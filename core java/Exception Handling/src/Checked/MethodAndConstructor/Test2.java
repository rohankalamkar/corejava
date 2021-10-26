package Checked.MethodAndConstructor;

import java.io.IOException;

public class Test2 extends IOException{
	public static void main(String[] args){
		System.out.println("Main----------Start");
		Test2 t = new Test2();
		System.out.println(t.hashCode()); // It will print different hashcode
		
		IOException i = new IOException();
		
		IOException i1 = null;
		
		B2 b = new B2();
		try {
			System.out.println("Try------------Start");
			b.m1();
			System.out.println("Try------------End");
		}
		

		catch(IOException e) {
			System.out.println("Catch------Block");
			System.out.println(e.getMessage());
			System.out.println(e.hashCode());  // Same Hashcode
			System.out.println(e.toString());
			System.out.println("1.------------------------------");
			i=e;
			i1=e;
		}
		finally {
			
		}
//	
			System.out.println(i.getMessage());
			System.out.println(i.toString());
			System.out.println(i.hashCode());  // Same Hashcode
			System.out.println("2---------------------------------");
			System.out.println(i1.hashCode());  // Same HashCode
			System.out.println("3---------------------------------");
			
		}
	
		
	
		
		
		
	}


