package com.Jdbc_introduction.Example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Loading Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		// Establised connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc", "root","root");
		
		//String sql = "create table student1(rollno int,name varchar(45),address varchar(56))";
		
		String sql = "insert into student1 values(101,'rt','pune')";
		
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		stmt.close();
		con.close();
		System.out.println("data added successfully!");
		
		
		
		
		
	}
}
