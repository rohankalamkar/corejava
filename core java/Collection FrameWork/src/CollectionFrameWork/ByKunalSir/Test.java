package CollectionFrameWork.ByKunalSir;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList  al1 = new ArrayList();    // It allows but prefered to use below.
		 
		List al = new ArrayList();    // List is interface and ArrayList is Class
		al.add(10);     // add is inbuilt method to add object in List in array
		al.add(30);
		al.add("ABC");
		al.add(80);
		al.add('Z');
		
		System.out.println(al);   // [10, 30, ABC, 80, Z]  // int is repsentation of an array al 
		
		// Now for retrieving elements/objects from array al
		
	//	int x = al.get(0);  // Error : Type mismatch: cannot convert from Object to int
		int x1 = (int)al.get(0);   // We have to cast Object to required data type
		System.out.println(x1);   // 10 ....at index 0
		int x2 = (int)al.get(1);  // 30 ....at index 1
		//int x3 = (int)al.get(2);  // Exception:ClassCastException..at index 2 is String 
		                         // and you want to store in int.
		
		String s = (String)al.get(2);
		System.out.println(s);   // ABC
		
		int x4 = (int)al.get(3);
		//int x5 = (int)al.get(4);  // ClassCastException :java.lang.Character cannot be cast to java.lang.Integer
		//Here Character Cannot Convert into integer even not in its Unicode NumberS
		char ch1 = (char)al.get(4);
		System.out.println(ch1);   // Z
		
		
		//Lets check : I want to Convert int to character(Unicode) here
		// Ans : No Its Cannot convert from Cast into any In Array .
		// Because it is present in Java.lang
		//char ch2 = (char)al.get(0);   // ClassCastException :java.lang.Integer cannot be cast to java.lang.Character
		
		
		// In a NutShell : 
		// We cannot convert One Data type into Other data type in array;
		// We need be carefull and More specific about data Type
		
		
	}

}
