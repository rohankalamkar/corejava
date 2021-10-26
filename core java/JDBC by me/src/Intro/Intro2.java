package Intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Intro2 {
	// Adding data into schemas table by scanner
	public static void main(String[] args) throws SQLException {
		
		// Step 1 : Load Driver
		
		
		// Step 2: Get Connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classrrom","root", "root");
		
		
		//Step 3: Construct query
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Roll no :");
		int rn = sc.nextInt();
		
		System.out.println("Enter Name : ");
		String nm = sc.next();
		nm+=sc.nextLine();
		
		System.out.println("Enter Address : ");
		String adr = sc.next();
		adr += sc.nextLine();
		
		
		String sql = "insert into class10 values("+rn+",' "+nm+"','"+adr+"')";
		
		// Step 4 : create Statement 
		Statement smt = con.createStatement();
		
		// Step 5 : execute query
		
		smt.execute(sql);
		
		// Step 6 : close resources 
		smt.close();
		con.close();
		
		
		System.out.println(sql);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}