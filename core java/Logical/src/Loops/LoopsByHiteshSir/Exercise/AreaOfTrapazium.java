package Loops.LoopsByHiteshSir.Exercise;

import java.util.Scanner;

public class AreaOfTrapazium {
	public double areaOfTrapazium() {
		System.out.println("Variable requires to find Area of Trapazium are UpperSide(a), Bottom Side(b) and Height(h): ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of UpperSide(a) in mm : ");
		double a = sc.nextDouble();
		System.out.println("Enter Value of BottomSide(b) in mm : ");
		double b = sc.nextDouble();
		System.out.println("Enter Value of Height(h) in mm : ");
		double h = sc.nextDouble();
		double area = (h/2)*(a+b);
		return area;
	}

}
