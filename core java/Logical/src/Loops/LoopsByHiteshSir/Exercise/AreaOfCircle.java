package Loops.LoopsByHiteshSir.Exercise;

import java.util.Scanner;

public class AreaOfCircle {
	public double areaofcircle() {
		System.out.println("Variable Reqiures to Calculate Area of Circle is radius(r) ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of radius in mm : ");
		double rad = sc.nextDouble();
		
		double area = Math.PI * (rad * rad);
		return area;
		
		
	}

}
