package JDBCByMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AcDBConnection {
	
	
	public static Connection GetConnection()   {
		// Step 1 : Load Driver :
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Step 2 : Get Connected
		
		
			Connection con = null;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankproject", "root", "root");
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
	
		return con;
		
	}

}
