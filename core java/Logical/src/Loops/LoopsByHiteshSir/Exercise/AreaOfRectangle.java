package Loops.LoopsByHiteshSir.Exercise;

import java.util.Scanner;

public class AreaOfRectangle {
	public int areaofRect() {
		System.out.println("Variable requires to calculate Area of Rectangle area Length(L) and Width(W): ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of Length(L) in mm : ");
		int L = sc.nextInt();
		System.out.println("Enter Value of Width(W) in mm : ");
		int W = sc.nextInt();
		int area = L*W;
		return area;
	}

}
