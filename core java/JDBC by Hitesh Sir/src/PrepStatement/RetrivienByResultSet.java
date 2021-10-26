package PrepStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrivienByResultSet {
	
	public static void main(String[] args) throws SQLException {
		
		
		
		//Step 1 : Driver Loading
		// Already loaded
		//Class.forName("com.mysql.jdbc.Driver");
		
		
		//Step2: get Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		String sql = "select * from user";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			
			System.out.println(id+"  "+name+"  "+address);
		}
		
		
	}


}
