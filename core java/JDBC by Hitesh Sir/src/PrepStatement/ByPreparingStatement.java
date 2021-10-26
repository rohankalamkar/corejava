package PrepStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ByPreparingStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Step 2 : Driver Loading
		// Already loaded
		// Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		//Step : 3 Construct query
		String sql = "insert into user values(?,?,?) ";
		// Step 4 : Preparing Statement
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, 8);
		ps.setString(2, "Akhil");
		ps.setString(3, "Pune");
		
		// Step 5 : Execute This query:
		ps.execute();   // return boolean
		ps.executeUpdate();// Both Doing Same Work // return int
		
		
		
	}

}
