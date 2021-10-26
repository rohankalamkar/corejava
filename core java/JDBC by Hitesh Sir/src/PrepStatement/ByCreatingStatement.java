package PrepStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ByCreatingStatement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Step 1 : Driver Loading
		// Already loaded
		//Class.forName("com.mysql.jdbc.Driver");
		
		
		//Step2: get Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		//Step 3:  Construct query
		String sql = "insert into user values(5,'nayan','Arvi')";
		
		// Step 4 :Create Statement
		Statement smt = con.createStatement();
		// Step 5 : Execute Query into statement
		smt.execute(sql);
		
		
	}

}
