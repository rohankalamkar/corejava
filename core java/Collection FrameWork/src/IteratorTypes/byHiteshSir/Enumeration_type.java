package IteratorTypes.byHiteshSir;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Enumeration_type {
	public static void main(String[] args) {
		// It works on vector , Stack only
		// It only read
		// We do not use it mostly
		
		
		Vector<Integer> list = new Vector<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		System.out.println(list);   // [100, 200, 300, 400, 500]
		
		Enumeration<Integer> itr=list.elements();
		// Enumerator since jdk 1.0
		while(itr.hasMoreElements()) {
			int x=itr.nextElement();    // read only
			System.out.println(x);
		}
		
		
		
		
	}

}
