package Intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Intro1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		// Step 1 : Loading Driver
		
		//Class.forName("com.mysql.jdbc.Driver");
		
		// Ste[ 2 : Get Connection of jdbc driver to mysql database
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classrrom", "root", "root");
		
		// step 3 : Construct query
		
		//String sql = "create table class10 (rollno int(20), name varchar(60), address varchar(60))";
		String sql = "insert into class10 values(2,'Chetan Kalamkar','Wardha')";
		
		// step 4 : create statement 
		
		Statement smt = con.createStatement();
		
		// Step 5 : execute query / pass query into statement
		
		smt.execute(sql);
		
		
		// step 6 : close all resources 
		smt.close();
		con.close();
		
		System.out.println(sql);
		
		
		
		
		
	}

}
