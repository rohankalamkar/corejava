package ByMe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class A3 {
	public static void main(String[] args) {
		
		List<Integer> num =new ArrayList<>();
		//Collections
		num.add(20);
		num.add(35);
		num.add(45);
		num.add(50);
		num.add(65);
		num.add(70);
		num.add(80);
		//ConcurrentModificationException
		
		System.out.println("Before : "+num);
		
		Iterator<Integer> itr=num.iterator();
		while(itr.hasNext()) {
			Integer x=itr.next();
			//Integer y = new Integer(x);
			if(x<50) {
				itr.remove();	// It an void method present in Iterator interface 
			}
		}
		System.out.println("After : "+num);
	}

}
