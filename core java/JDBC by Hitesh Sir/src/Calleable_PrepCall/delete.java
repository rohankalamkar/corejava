package Calleable_PrepCall;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class delete {
	public static void main(String[] args) throws SQLException {
		
		// Step 1 : Driver Loading
		
		// Step 2 : Get Connection
		
	
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classrrom", "root", "root");
			
			
			String sql = "{call delete_student (?)}";
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, 4);

			cs.execute();
			cs.close();
			con.close();
			System.out.println("Success....");
		
		
		
		
		
		
	}

}
