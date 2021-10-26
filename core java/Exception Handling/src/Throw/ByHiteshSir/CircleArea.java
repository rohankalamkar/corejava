package Throw.ByHiteshSir;

import java.util.Scanner;

public class CircleArea {
	public void area(int radius) {
		double CircArea= Math.PI*radius*radius;
		
		System.out.println("Area of Circle is : "+CircArea);
	}
	public static void main(String[] args) {
		
		CircleArea c = new CircleArea();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
		int rad = sc.nextInt();
		try {

			if(rad==0) {
				throw new NegativeRadius("Radius of circle cannot be zero");
			}
			if(rad<0) {
				throw new NegativeRadius("Radius cannot be negative.");
			}
			
			c.area(rad);
		}
		catch(NegativeRadius e) {
			System.out.println(e.getMessage());
		}
		
	}

}
