package com.controller;

import java.util.Scanner;

import com.service.College;
import com.service.University;

public class Admin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		University u = new College();
		System.out.println("-----------Welcome------------ \n");
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("\nEnter Your Choice  : \n");
			System.out.println("1. Add Course : ");
			System.out.println("2. View Course : ");
			System.out.println("3. Add Faculty : ");
			System.out.println("4. View Faculty : ");
			System.out.println("5. Add Batch : ");
			System.out.println("6. View Batch : ");
			System.out.println("7. Add Student : ");
			System.out.println("8. View Student : ");
			System.out.println("9. Exit.\n");
			int ch = sc.nextInt();
		switch(ch) {

		case 1 : 
			u.addCourse();
			break;
		case 2 : 
			u.viewCourse();
			break;
		case 3 : 
			u.addFaculty();
			break;
		case 4 : 
			u.viewFaculty();
			break;
		case 5 : 
			u.addBatch();
			break;
		case 6 : 
			u.viewBatch();
			break;
		case 7 : 
			u.addStudent();
			break;
		case 8 : 
			u.viewStudent();
			break;
		case 9 : 
			System.out.println("Exit.....");
			flag=false;
			break;
			default:
				System.out.println("Wrong Choice Enter.");
		
		
		}
		
		}
		
	}

}
