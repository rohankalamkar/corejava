package IntroJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Introjdbc1 {
	// Retrieving data from mysql database
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Step 1 : Driver Loading
		//Class.forName("com.mysql.jdbc.Driver"); //Traditional. But already attached to project
		
		// Step 2 : getting connection jdbc to mysql
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class", "root", "root");
		
		// Step 3 : Construct sql query
		
		String sql = "select * from sectiona";
		
		// Step 4 : statement creation 
		
		Statement smt = con.createStatement();
		// step 5: execute query
		ResultSet ex = smt.executeQuery(sql);
		
		while(ex.next()) {
			
			System.out.print(ex.getInt(1)+" ");
			System.out.print(ex.getString(2)+" ");
			System.out.println(ex.getString(3));
			
		}
		
		
	}

}
