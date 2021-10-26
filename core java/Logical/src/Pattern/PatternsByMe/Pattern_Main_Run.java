package Pattern.PatternsByMe;

import PatternProject.*;
import PatternProject.Numbers.SameNumber.*;
import PatternProject.Star.Star;
import PatternProject.Numbers.*;
import PatternProject.Alphabets.*;

import java.util.Scanner;

public class Pattern_Main_Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Star s = new Star();
		Square_Number s1 = new Square_Number();
		Triangle_Number_Pattern t = new Triangle_Number_Pattern();
		Triangle_Alphabets_Pattern a = new Triangle_Alphabets_Pattern();
		boolean b = true;

		while (b) {

			System.out.println("....................Welcome to Pattern World.........");
			System.out.println("1.   STAR PRINTING");
			System.out.println("2.   SQUARE PRINTING ");
			System.out.println("3.   TRIANGLE PRINTING ");
			System.out.println("4.   EXIT THE PROGRAM");

			System.out.println("Enter Your Choice : ");
			int n = sc.nextInt();
			

			if (n == 1) {
				while (b) {

					System.out.println("------------Welcome to Star Patter Printing---------");
					System.out.println("1. Star Printin in Square Shape");
					System.out.println("2. Star Printing Tringle(Right_Angle_Triangle From Left)");
					System.out.println("3. Star Printing Tringle(Right_Angle_Triangle From Right)");
					System.out.println("4. Star Printing Tringle(Right_Angle_Triangle From Left) But water Image");
					System.out.println("5. Star Printing Tringle(Right_Angle_Triangle From Right) But Water image");
					System.out.println("6. Exit From Star Printing");
					System.out.println("7. Exit from Program.");
					System.out.println("Enter Your Choice : ");
					int m = sc.nextInt();

					if (m == 1) {
						s.Star_Square();
					} else if (m == 2) {
						s.Triangle_From_Left();
					} else if (m == 3) {
						s.Triangle_From_Right();
					} else if (m == 4) {
						s.Triangle_From_Left_Water();
					} else if (m == 5) {
						s.Triangle_From_Right_Water();
					} else if (m == 6) {
						break;
					} else if (m == 7) {
						b = false;
					} else {
						System.out.println("\nYou Have Entered Wrong Number.......\n");
					}
				}

			} else if (n == 2) {

				while (b) {
					System.out.println("----------Welcome to Square Pattern Printing--------------");
					System.out.println("1. Same Number Printing in Single row in Square Pattern");
					System.out.println("2. Ascending Number Printing in Single row Square Pattern");
					System.out.println("3. Same Alphabets Printing in Single row in Square Pattern");
					System.out.println("4. Ascending Alphabets Printing in Single row Square Pattern");
					System.out.println("5. Exit from Square Printing...");
					System.out.println("6. Exit from Program...");
					System.out.println("Enter a Number of your Choice : ");
					int m1 = sc.nextInt();

					if (m1 == 1) {
						s1.Same_Number_In_Single_row();
					} else if (m1 == 2) {
						s1.Ascending_Number_in_Single_Row();
					} else if (m1 == 3) {
						s1.Same_Alphabets_in_Single_Row();

					} else if (m1 == 4) {
						s1.Asc_Alphabets_in_Single_Row();
					} else if (m1 == 5) {
						break;

					} else if (m1 == 6) {
						b = false;
					} else {
						System.out.println("\n You Have enteres Wrong Number...\n");
					}

				}

			}

			else if (n == 3) {
				System.out.println("--------------Welcome to Triangle pattern Printing------------- ");
				System.out.println("1. For Number ");
				System.out.println("2. For Alphabet");
				System.out.println("Enter your choice : ");
				int m2 = sc.nextInt();
				if (m2 == 1) {
					boolean d = true;
					while (b) {
						System.out.println("---------Welcome to Number Pattern Printing------------");
						System.out.println("1. Same Numbers in Each Row Triangle(Right Angle) From Left ");
						System.out
								.println("2. Same Numbers in Each Row Triangle(Right Angle) From Left but Water Image");
						System.out.println("3. Ascending Numbers in Each Row Triangle(Right Angle) From Left ");
						System.out.println(
								"4. Ascending Numbers in Each Row Triangle(Right Angle) From Left but Water Image");
						System.out.println("5. Same Numbers in Each Row Triangle(Right Angle) From Right ");
						System.out.println(
								"6. Same Numbers in Each Row Triangle(Right Angle) From Right but Water Image");
						System.out.println("7. Ascending Numbers in Each Row Triangle(Right Angle) From Right ");
						System.out.println(
								"8. Ascending Numbers in Each Row Triangle(Right Angle) From Right but Water Image");
						System.out.println("\n 9. For Exit from Number Printing ");
						System.out.println("10. For Exit from Program .");
						System.out.println("\n  Enter Your Choice :  ");
						int m2a = sc.nextInt();

						if (m2a == 1) {
							t.Triangle_Number_From_Left();
						} else if (m2a == 2) {
							t.Triangle_Number_From_Left_Water();
						} else if (m2a == 3) {
							t.Asce_Triangle_Number_From_Left_();
						} else if (m2a == 4) {
							t.Asce_Triangle_Number_From_Left_Water_();
						} else if (m2a == 5) {
							t.Triangle_Number_From_Right();
						} else if (m2a == 6) {
							t.Triangle_Number_From_Right_Water();
						} else if (m2a == 7) {
							t.Triangle_Number_From_Right_Ascending();
						} else if (m2a == 8) {
							t.Triangle_Number_From_Right_Ascending_Water();
						} else if (m2a == 9) {
							break;
						} else if (m2a == 10) {
							b = false;
						} else {
							System.out.println("\nYou Have Entered Wrong Number.....\n");
						}

					}
				} else if (m2 == 2) {
					boolean d = true;
					while (b) {

						System.out.println("---------Welcome to Alphabets Pattern Printing------------");
						System.out.println("1. Same Alphabets in Each Row Triangle(Right Angle) From Left ");
						System.out.println(
								"2. Same Alphabets in Each Row Triangle(Right Angle) From Left but Water Image");
						System.out.println("3. Ascending Alphabets in Each Row Triangle(Right Angle) From Left ");
						System.out.println(
								"4. Ascending Alphabets in Each Row Triangle(Right Angle) From Left but Water Image");
						System.out.println("5. Same Alphabets in Each Row Triangle(Right Angle) From Right ");
						System.out.println(
								"6. Same Alphabets in Each Row Triangle(Right Angle) From Right but Water Image");
						System.out.println("7. Ascending Alphabets in Each Row Triangle(Right Angle) From Right ");
						System.out.println(
								"8. Ascending Alphabets in Each Row Triangle(Right Angle) From Right but Water Image");
						System.out.println("\n 9. For Exit from Alphabet Printing ");
						System.out.println("10. For Exit from Program .");
						System.out.println("\n  Enter Your Choice :  ");
						int m2b = sc.nextInt();
						if (m2b == 1) {
							a.Triangle_Alphabets_Left_Same();
						} else if (m2b == 2) {
							a.Triangle_Alphabets_Left_same_Water();
							;
						} else if (m2b == 3) {
							a.Triangle_Alphabets_Left_Asc();
						} else if (m2b == 4) {
							a.Triangle_Alphabets_Left_Asc_Water();
						} else if (m2b == 5) {
							a.Triangle_Alphabets_Right_Same();
						} else if (m2b == 6) {
							a.Triangle_Alphabets_Right_Same_Water();
						} else if (m2b == 7) {
							a.Triangle_Alphabets_Right_Asc();
						} else if (m2b == 8) {
							a.Triangle_Alphabets_Right_Asc_Water();
						} else if (m2b == 9) {
							break;
						} else if (m2b == 10) {
							b = false;
						} else {
							System.out.println("\nYou have Entered Wrong Choice\n");
						}

					}

				}

			} else if (n == 4) {
				b = false;
			} else {
				System.out.println("\n You Have Entered Wrong Choice............\n");
			}

		}

	}

}
