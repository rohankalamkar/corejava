package Intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Intro3 {
	// Insert  multiple data into table through Scanner
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Step 1 : Driver Loading
		Class.forName("com.mysql.jdbc.Driver");
		
		// Step 2 : get Connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classrrom", "root", "root");
		
		// Step 3 : Construct Query
		
		Scanner sc = new Scanner(System.in);
		
		//String sql ="insert into class10 values(4,'nayan','arvi')";
		
//		Statement smt = con.createStatement();
//		smt.execute(sql);
		
		
		
		System.out.println("Enter Number of Students : ");
		int size = sc.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter Roll Number : ");
			int rn = sc.nextInt();
			System.out.println("Enter Name : ");
			String nm = sc.next();
			nm+=sc.nextLine();
			
			System.out.println("Enter Address : ");
			String adr = sc.next();
			adr+=sc.nextLine();
			
			String sql="insert into class10 values("+rn+",'"+nm+"','"+adr+"')";
			Statement smt = con.createStatement();
			smt.execute(sql);
			
			System.out.println(nm+" : Data Added Succussfully");
			smt.close();
		}
		//System.out.println(sql);
		//smt.close();
		con.close();
		
		
	}

}
