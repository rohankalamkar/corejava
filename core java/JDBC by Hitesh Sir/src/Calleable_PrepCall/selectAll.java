package Calleable_PrepCall;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class selectAll {
	public static void main(String[] args) throws SQLException {
		
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classrrom", "root", "root");
		
		
		String call = "{call selectallStudent}";
		
			CallableStatement pc = con.prepareCall(call);
			
			ResultSet rs = pc.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3));
			}
		
			rs.close();
			con.close();
			pc.close();
	}

}
