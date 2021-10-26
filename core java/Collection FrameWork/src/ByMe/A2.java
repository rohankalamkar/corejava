package ByMe;

import java.util.Arrays;

public class A2 {
	public static void main(String[] args) {
		
		String name = "Hello World";
		char [] ch = name.toCharArray();
		
		for(char s : ch) {
			System.out.println(s);
		}
		System.out.println("1---------------------------------------------");
		Arrays.parallelSort(ch);
		System.out.println(Arrays.toString(ch));
		System.out.println("-----------------------------------");
		for(char s1: ch) {
			System.out.println(s1);
		}
		
	}

}
