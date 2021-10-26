package IntroJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Adding_By_Using_Scanner {
	
	// Adding data by using scanner into mysql database
	
	public static void main(String[] args) throws SQLException {
		
		// Step 1 : Loading driver
		
		
		//step 2 : getting connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		// step 3 : sql query
		
		String sql = "desc class10 ";
		
		// step 4 : create Statement
		
		Statement smt = con.createStatement();
		
		ResultSet rs = smt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getRow());
			System.out.println(rs.getType());
		}
		
		
		
		
		
	}

}
