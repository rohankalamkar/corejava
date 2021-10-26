package Calleable_PrepCall;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert {
	
	
	
	public static void main(String[] args) throws SQLException {
		
		// Step 1 : Driver Loading
		
		// Step 2 : Get Connection
		
	
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classrrom", "root", "root");
			
			
			String sql = "{call insert_student (?,?,?)}";
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, 18);
			cs.setString(2, "Tushar");
			cs.setString(3, "Manmad");

			cs.execute();
			cs.close();
			con.close();
			System.out.println("Success....");
		
		
		
		
		
	}

}
