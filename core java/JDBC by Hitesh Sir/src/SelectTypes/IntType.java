package SelectTypes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IntType {
	// Fetching/Retrivieng specific int data
	public static void main(String[] args) throws SQLException {
		
		
		// Step1  : Load Driver 
		// Class.forName("com.mysql.jdbc.Driver");
		
		// Step 2 : Get Connected 
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root", "root");
		
		// Step 3 : construct sql query
		
		String sql="select * from payments where customerNumber = 471";
		
		// Step 4 : Create statement 
		Statement smt = con.createStatement();
		
		
		
		// execute query by statement
		
		ResultSet rs = smt.executeQuery(sql);
		
		while(rs.next()) {
			int custNum = rs.getInt(1);
			String ChNum = rs.getString(2);
			Date date = rs.getDate(3);
			double amt = rs.getDouble(4);
			
			System.out.println(custNum + "   "+ChNum+"   "+date+"  "+amt );
		}
		
		
		
		
		
		
		
		
		
		
	}

}
