package ByMe;

import java.util.ArrayList;
import java.util.List;

public class A1 {
	public static void main(String[] args) {
		// sort method of String character
		List<String> st = new ArrayList<>();
		st.add("Rohan");
		st.add("Akash");
		st.add("anil");
		st.add("Amit");
		st.add("SHUBHAM");
		st.add("Shivam");
		st.add("sayali");
		st.add("Niketan");
		st.add("kapil");
		System.out.println("Before sort : "+st);
		// Before sort : [Rohan, Akash, anil, Amit, SHUBHAM, Shivam, sayali, Niketan, kapil]
		
		st.sort(null);
		System.out.println("After Sort : "+st);
		//After Sort : [Akash, Amit, Niketan, Rohan, SHUBHAM, Shivam, anil, kapil, sayali]
		
		// Observation : 
		// Preference :first- Uppercase(Capital), Then Lowercase(small)  
		
		List<Integer> in = new ArrayList<Integer>();
		in.add(60);
		in.add(50);
		in.add(70);
		in.add(20);
		in.add(80);
		in.add(90);
		System.out.println("Before sort : "+in);
		// Befor sort : [60, 50, 70, 20, 80, 90]
		
		in.sort(null);
		
		System.out.println("After sort : "+in);
		
		// After sort : [20, 50, 60, 70, 80, 90]
		
		

	}

}
