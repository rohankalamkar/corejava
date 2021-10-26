package Loops.LoopsByHiteshSir.Exercise;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Find Area Of Following Structures :");
		System.out.println("1. Circle.");
		System.out.println("2. Square.");
		System.out.println("3. Rectangle.");
		System.out.println("4. Triangle.");
		System.out.println("5. Trapazium");
		System.out.println("6. Exit");
		
		
		AreaOfCircle c = new AreaOfCircle();
		AreaOfSquare s = new AreaOfSquare();
		AreaOfRectangle r = new AreaOfRectangle();
		AreaOfTriangle t = new AreaOfTriangle();
		AreaOfTrapazium trpz = new AreaOfTrapazium();
		
		
		boolean flag = true;
		
		while (flag) {
			System.out.println("Enter Your Choice : ");
			int ch = sc.nextInt();
			
		switch(ch) {
		
		case 1 :
			double cir = c.areaofcircle();
			System.out.printf("Area of Circle is : %f in mm^2\n",cir);
			break;
		case 2 :
			int sq = s.areaofSquare();
			System.out.println("Area of Square is : "+sq+" mm^2");
			break;
		case 3 :
		    int rec = r.areaofRect();
		    System.out.println("Area of Rectangle is : "+rec+" mm^2");
			break;
			
		case 4 :
			double tri = t.areaOfTri();
			System.out.println("Area of Triangle is : "+tri+" mm^2");
			break;
			
		case 5 :
			double trapazium = trpz.areaOfTrapazium();
			System.out.println("Area of Trapazium is : "+trapazium+" mm^2");
			break;
		case 6 : 
			flag = false;
			
		}
		
		}	
		
		
	}

}
