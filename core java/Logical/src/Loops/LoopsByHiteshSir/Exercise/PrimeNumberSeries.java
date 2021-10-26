package Loops.LoopsByHiteshSir.Exercise;

import java.util.Scanner;

public class PrimeNumberSeries {
	public static void main(String[] args) {
		System.out.println("Prime Number Series Printing.........");
		Scanner sc = new Scanner(System.in);

		int count = 0;
		System.out.println("Enter Start number  : ");
int x = sc.nextInt();
		System.out.println("Enter Last number : ");
		int y = sc.nextInt();
		System.out.printf("Prime Number From %d to %d are : \n", x, y);
		for (int i = x; i <= y; i++) {
			boolean flag = true;
			for (int j = 2; j < y; j++) {

				if (i % j == 0 && i!=j) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.printf("\nTotal Prime Number Between %d and %d is : %d ", x, y, count);

	}
}