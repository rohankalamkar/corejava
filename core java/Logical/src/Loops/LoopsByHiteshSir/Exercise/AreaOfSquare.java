package Loops.LoopsByHiteshSir.Exercise;

import java.util.Scanner;

public class AreaOfSquare {
	public int areaofSquare() {
		System.out.println("Variable requires to calculate Square is side(a) .");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side in mm : ");
		int a = sc.nextInt();
		int area = (a* a);
		return area;
	}

}
