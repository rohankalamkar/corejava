package ByMe;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class A {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		//l.add("Rohan");
		//l.add("Shubham");
		//l.add("Vishal");
		l.add(40);
		//l.add("Amit");
		//l.add("Ravi");
		//l.add("Sagar");
		l.add(20);
		//l.add("Sayali");
		l.add(60);
		
		System.out.println(l);  // [Rohan, Shubham, Vishal, 40, Amit, Ravi, Sagar, 20, Sayali, 60]
		l.sort(null);  // Limitation : It requires same type of date else ClassCastException
		//l.sort(c);
		
		System.out.println(l);
		
	}

}
