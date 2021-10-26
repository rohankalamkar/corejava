package PrepStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {
	public static void main(String[] args) throws SQLException {
		// Step 1 : Driver Loading
		
		// Step 2 : Get Connection
		
	
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classrrom", "root", "root");
			
			
			String sql = "delete from class10 where rollno = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, 13);
			ps.execute();
			ps.close();
			System.out.println("Success......");
		
		
		
		
		
	}

}
