package Loops.LoopsByHiteshSir.Exercise;

import java.util.Scanner;

public class AreaOfTriangle {
	public double areaOfTri() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Variable requires to Find Area of Triangle are Base(b) and Height(h) : ");
		System.out.println("Enter Value for Base(b) in mm : ");
		double b = sc.nextInt();
		System.out.println("Enter Value for Height(h) in mm : ");
		double h = sc.nextInt();
		double area = (1/2)*b*h;
		return area;
	}
	

}
